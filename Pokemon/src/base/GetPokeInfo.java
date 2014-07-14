//Get Pokemon information from this url: view-source:http://pokemondb.net/pokedex/national and put it in sql database/txt file
package base;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetPokeInfo {
	
	private static String pokeinfo = "pokeinfo.txt";
	private static PrintWriter out;
	private static final int numOfPokes = 775;
	
	public static void main(String[] args){
		try {
			out = new PrintWriter(new FileWriter(pokeinfo)); 
			Document doc = Jsoup.connect("http://pokemondb.net/pokedex/all").get();
			for(int i = 1; i < numOfPokes; i++){
				String num = String.valueOf(i);
				String cssPath = "#pokedex > tbody > tr:nth-child(" + num + ")";
				Elements e = doc.select(cssPath);
				System.out.println(e.text());
				out.println(e.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.close();
	}
}
