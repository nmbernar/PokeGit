//Get Pokemon information from this url: view-source:http://pokemondb.net/pokedex/all and put it in sql database/txt file
package base;


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

/*
 * Generates a MySQL database of every Pokemon in the game
 */
public class GetPokeInfo {
	
	private static final int numOfPokes = 801; //801
	
	private static String[] keys = {"dex", "name", "types", "total", "hp", "atk",
            "def", "spatk", "spdef", "spd"};
    
	
	public static void main(String[] args){
		DatabaseConnect db = new DatabaseConnect();
		ArrayList<HashMap<String, String>> pokes = new ArrayList<HashMap<String, String>>();
		System.out.println("Started: " + LocalTime.now());
		HashMap<String,String> pokemon = null;
		try { 
			Document doc = Jsoup.connect("http://pokemondb.net/pokedex/all").get();
			for(int i = 1; i < numOfPokes; i++){
				String num = String.valueOf(i);
				pokemon = GetPokeInfo.generatePokeMap(doc, num);
				pokes.add(pokemon);
			}
			GetPokeInfo.populateDatabase(pokes, db);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finished: " + LocalTime.now());
		}
	}

	private static void populateDatabase(ArrayList<HashMap<String, String>> pokes, DatabaseConnect db) {
		Connection connect = null;
		PreparedStatement stmt = null;

		try {
			//Open Connection
			connect = DriverManager.getConnection(db.getURL(), db.getUsername(), db.getPass());
			
			for(HashMap<String, String> poke: pokes){
				//Prepare query
				stmt = connect.prepareStatement("INSERT INTO pokes"
						+ " (dexnum, name, total, hp, atk, def, spatk, spdef, spd, ptype, stype)"
						+ " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
				
				stmt.setInt(1, Integer.parseInt(poke.get("dex")));
				stmt.setString(2, poke.get("name"));
				stmt.setInt(3, Integer.parseInt(poke.get("total")));
				stmt.setInt(4, Integer.parseInt(poke.get("hp")));
				stmt.setInt(5, Integer.parseInt(poke.get("atk")));
				stmt.setInt(6, Integer.parseInt(poke.get("def")));
				stmt.setInt(7, Integer.parseInt(poke.get("spatk")));
				stmt.setInt(8, Integer.parseInt(poke.get("spdef")));
				stmt.setInt(9, Integer.parseInt(poke.get("spd")));
				String[] types = GetPokeInfo.separateTypes(poke.get("types"));
				stmt.setString(10, types[0]);
				if(types.length > 1){
					stmt.setString(11, types[1]);
				} else {
					stmt.setString(11, "None");
				}
				stmt.executeUpdate();
			}
	
		} catch (Exception e) {
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
	}

	
	private static String[] separateTypes(String types) {
		if(types.contains(" ")){
			return types.split(" ");	
		} else {
			String[] typeArray = {types};
			return typeArray;
		}
	}

	private static HashMap<String, String> generatePokeMap(Document doc, String num) {
		HashMap<String, String> pokemon = new HashMap<String, String>();
		
		for(String attribute : keys){
			switch(attribute){
			case "dex":
				String cssDex = "#pokedex > tbody > tr:nth-child(" + num + ") > td.num.cell-icon-string";
				Elements e = doc.select(cssDex);
				pokemon.put(attribute, e.text());
				break;
			case "name":
				String cssName = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(2)";
				Elements e1 = doc.select(cssName);
				pokemon.put(attribute, e1.text());
				break;
			case "types":
				String cssType = "#pokedex > tbody > tr:nth-child(" + num + ") > td.cell-icon > a";
				Elements e2 = doc.select(cssType);
				pokemon.put(attribute, e2.text());
				break;
			case "total":
				String cssTotal = "#pokedex > tbody > tr:nth-child(" + num + ") > td.num-total";
				Elements e3 = doc.select(cssTotal);
				pokemon.put(attribute, e3.text());
				break;
			case "hp":
				String cssHp = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(5)";
				Elements e4 = doc.select(cssHp);
				pokemon.put(attribute, e4.text());
				break;
			case "atk":
				String cssAtk = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(6)";
				Elements e5 = doc.select(cssAtk);
				pokemon.put(attribute, e5.text());
				break;
			case "def":
				String cssDef = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(7)";
				Elements e6 = doc.select(cssDef);
				pokemon.put(attribute, e6.text());
				break;
			case "spatk":
				String cssSpAtk = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(8)";
				Elements e7 = doc.select(cssSpAtk);
				pokemon.put(attribute, e7.text());
				break;
			case "spdef":
				String cssSpDef = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(9)";
				Elements e8 = doc.select(cssSpDef);
				pokemon.put(attribute, e8.text());
				break;
			case "spd":
				String cssSpd = "#pokedex > tbody > tr:nth-child(" + num + ") > td:nth-child(10)";
				Elements e9 = doc.select(cssSpd);
				pokemon.put(attribute, e9.text());
				break;
			}
		}
		return pokemon;
	}
}
