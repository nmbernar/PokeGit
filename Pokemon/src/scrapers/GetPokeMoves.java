package scrapers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import base.DatabaseConnect;

/*
 * Generates a MySQL database of every Pokemon move in the game
 */
public class GetPokeMoves {

	private static final int numOfMoves = 622; //622
	
	private static String[] keys = {"name", "type", "type", "category", "power", "accuracy",
	                              "pp", "description", "probability"};
	
	
	public static void main(String[] args){
		DatabaseConnect db = new DatabaseConnect();
		System.out.println("Started:" + LocalTime.now());
		HashMap<String, String> move = null;
		ArrayList<HashMap<String, String>> moveslist = new ArrayList<HashMap<String, String>>();
		
		try {
			Document doc = Jsoup.connect("http://pokemondb.net/move/all").get();
			for(int i = 1; i < numOfMoves; i++){
				String num = String.valueOf(i);
				move = GetPokeMoves.generateMoveMap(doc, num);
				moveslist.add(move);
				//System.out.println(moveslist.get(i-1));
			}
			GetPokeMoves.populateMoveDatabase(db, moveslist);

			
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			System.out.println("Finished: " + LocalTime.now());
		}
	}

	
	
	private static HashMap<String, String> generateMoveMap(Document doc, String num) {
		HashMap<String, String> move = new HashMap<String, String>();
		
		for(String attribute: keys){
			switch(attribute){
			case "name":
				String cssName = "#moves > tbody > tr:nth-child(" + num + ") > td.cell-icon-string > a";
				Elements e = doc.select(cssName);
				move.put(attribute, e.text());
				break;
			case "type":
				String cssType = "#moves > tbody > tr:nth-child(" + num + ") > td:nth-child(2)";
				Elements e1 = doc.select(cssType);
				move.put(attribute, e1.text());
				break;
			case "category":
				String cssCat = "#moves > tbody > tr:nth-child(" + num + ") > td:nth-child(3)";
				Elements e2 = doc.select(cssCat);
				move.put(attribute, e2.text());
				break;
			case "power":
				String cssPow = "#moves > tbody > tr:nth-child(" + num + ") > td:nth-child(4)";
				Elements e3 = doc.select(cssPow);
				move.put(attribute, interpretDash(e3.text()));
				break;
			case "accuracy":
				String cssAcc = "#moves > tbody > tr:nth-child(" + num + ") > td:nth-child(5)";
				Elements e4 = doc.select(cssAcc);
				move.put(attribute, interpretDash(e4.text()));
				break;
			case "pp":
				String cssPP = "#moves > tbody > tr:nth-child(" + num + ") > td:nth-child(6)";
				Elements e5 = doc.select(cssPP);
				move.put(attribute, interpretDash(e5.text()));
				break;
			case "description":
				String cssDesc = "#moves > tbody > tr:nth-child(" + num + ") > td.long-text";
				Elements e6 = doc.select(cssDesc);
				move.put(attribute, e6.text());
				break;
			case "probability":
				String cssProb = "#moves > tbody > tr:nth-child(" + num + ") > td:nth-child(9)";
				Elements e7 = doc.select(cssProb);
				move.put(attribute, interpretDash(e7.text()));
				break;
			}
		}
		return move;
	}


	private static String interpretDash(String s){
		if(s.equals("-") || s.equals("∞")){
			return "0";
		} else {
			return s;
		}
	}
	
	private static HashMap<String, String> populateMoveDatabase(DatabaseConnect db, ArrayList<HashMap<String, String>> moves) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = DriverManager.getConnection(db.getURL(), db.getUsername(), db.getPass());
			
			for(HashMap<String, String> move: moves){
				stmt = connect.prepareStatement("INSERT INTO moves "
						+ "(name, type, category, power, acc, pp, descript, prob) "
						+ "VALUES (?,?,?,?,?,?,?,?)");
				
				stmt.setString(1, move.get("name"));
				stmt.setString(2,  move.get("type"));
				stmt.setString(3, move.get("category"));
				stmt.setInt(4, Integer.parseInt(move.get("power")));
				stmt.setInt(5, Integer.parseInt(move.get("accuracy")));
				stmt.setInt(6, Integer.parseInt(move.get("pp")));
				stmt.setString(7, move.get("description"));
				stmt.setInt(8, Integer.parseInt(move.get("probability")));

				//System.out.println(stmt);
				stmt.executeUpdate();
			}
			
		} catch(Exception e){
			System.out.println(stmt);
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null || connect != null){
					stmt.close();
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
