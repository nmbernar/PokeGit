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

public class GetPokeAbility {

	private static final int NUM_ABILITIES = 191;

	private static String[] keys = { "name", "description", "gen" };

	public static void main(String[] args) {
		System.out.println("Started: " + LocalTime.now());
		DatabaseConnect db = new DatabaseConnect();

		HashMap<String, String> ability = null;
		ArrayList<HashMap<String, String>> abilityList = new ArrayList<HashMap<String, String>>();

		try {
			Document doc = Jsoup.connect("http://pokemondb.net/ability").get();

			for (int i = 1; i < NUM_ABILITIES; i++) {
				String num = String.valueOf(i);
				ability = GetPokeAbility.generateAbilityMap(doc, num);
				abilityList.add(ability);
			}
			GetPokeAbility.populateAbilityTable(db, abilityList);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finished: " + LocalTime.now());
		}
	}

	private static void populateAbilityTable(DatabaseConnect db, ArrayList<HashMap<String, String>> abilityList) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = DriverManager.getConnection(db.getURL(), db.getUsername(), db.getPass());
			
			for(HashMap<String, String> ability: abilityList){
				stmt = connect.prepareStatement("INSERT INTO pokemon.abilities "
						+ "(name, descript, gen) VALUES (?,?,?)");
				
				stmt.setString(1, ability.get("name"));
				stmt.setString(2, ability.get("description"));
				System.out.println(ability.get("gen"));
				stmt.setInt(3, Integer.parseInt(ability.get("gen")));
				
				stmt.executeUpdate();
			}
		} catch (SQLException e) {
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
		
	}

	private static HashMap<String, String> generateAbilityMap(Document doc, String num) {

		HashMap<String, String> ability = new HashMap<String, String>();

		for (String attribute : keys) {
			switch (attribute) {
			case "name":
				String cssName = "#abilities > tbody > tr:nth-child(" + num + ") > td:nth-child(1) > a";
				Elements e = doc.select(cssName);
				ability.put(attribute, e.text());
				break;
			case "description":
				String cssDesc = "#abilities > tbody > tr:nth-child(" + num + ") > td:nth-child(3)";
				Elements e1 = doc.select(cssDesc);
				ability.put(attribute, e1.text());
				break;
			case "gen":
				String cssGen = "#abilities > tbody > tr:nth-child(" + num + ") > td.num";
				Elements e2 = doc.select(cssGen);
				ability.put(attribute, e2.text());
				break;
			}
		}
		return ability;
	}

}
