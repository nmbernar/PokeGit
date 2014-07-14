package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import traits.*;
import elements.*;

public class GetDex {
	
	private static Pokemon[][] dex = new Pokemon[718][5];
	private static String pokeinfo = "pokeinfo.txt";
	private static Pokemon filler = new Pokemon();
	
	
	public GetDex(){
	}
	
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File(pokeinfo));
		int pokeCount = 1;
		int formCount = 0;
		int trueForm = 1;
 		while(scan.hasNext()){
			if(scan.nextInt() != pokeCount || pokeCount == 386 || pokeCount == 413 || pokeCount == 487 || pokeCount == 492 || 
					pokeCount == 555 || pokeCount == 641 || pokeCount == 642 || pokeCount == 645 || pokeCount == 647 || 
					pokeCount == 648 || pokeCount == 678 || pokeCount == 681 || pokeCount == 710 ||pokeCount == 711){ //alternate forms + Megas
				String base_name = scan.next();
				String megaCheck = scan.next();
				String forme = null;
				if(megaCheck.equals("Mega")){ //Megas
					String name = scan.next();
					if(name.equals("Charizard") || name.equals("Mewtwo")){
						filler.setName("Mega " + name + " " + scan.next());
					} else {
						filler.setName("Mega " + name);
					}
				}
				forme = megaCheck;
				if(base_name.equals("Giratina") || base_name.equals("Shaymin") || base_name.equals("Darmanitan") || 
						base_name.equals("Tornadus") || base_name.equals("Thundurus") || base_name.equals("Landorus") ||
						base_name.equals("Keldeo") || base_name.equals("Meloetta") || base_name.equals("Pumpkaboo") ||
						base_name.equals("Gorgiest") || base_name.equals("Meowstic") || base_name.equals("Aegislash")){
					if(base_name.equals("Meowstic")){
						filler.setName(base_name + " " + forme);
					} else {
						filler.setName(base_name + " " + forme);
						scan.next(); //skip word
					}
					filler.setDexNumber(pokeCount-1);
					if(formCount == 1){
						//filler.setDexNumber(pokeCount);
						pokeCount++;
						formCount = 0;
					} else {
						formCount++;
					}
				} else if(base_name.equals("Deoxys")){
					filler.setName(base_name + " " + forme);
					filler.setDexNumber(pokeCount-1);
					if(formCount == 3){
						//filler.setDexNumber(pokeCount);
						pokeCount++;
						formCount = 0;
					} else {
						formCount++;
					}
				} else if(base_name.equals("Wormadam")){
					filler.setName(base_name + " " + forme);
					filler.setDexNumber(pokeCount-1);
					scan.next();
					if(formCount == 2){
						//filler.setDexNumber(pokeCount);
						pokeCount++;
						formCount = 0;
					} else {
						formCount++;
					}
				} else if(base_name.equals("Rotom")){ //Rotom
					filler.setName(base_name + " " + forme);
					filler.setDexNumber(pokeCount-1);
					scan.next();
					if(formCount == 4){
						formCount = 0;
						//pokeCount++;
					} else {
						formCount++;
					}
				} else if(base_name.equals("Kyurem")){
					filler.setName(base_name + " " + forme);
					filler.setDexNumber(pokeCount-1);
					scan.next();
					formCount++;
					trueForm = formCount;
					if(formCount == 2){
						formCount = 0;
						//pokeCount++;
					} /*else {
						formCount++;
					}*/
				}

				String type = scan.next();
				filler.setPrimaryType(GetDex.determineType(type));
				if(!scan.hasNextInt()){
					String type2 = scan.next();
					filler.setSecondaryType(GetDex.determineType(type2));
				} else {
					filler.setSecondaryType(null);
				}
				filler.setTotal(scan.nextInt());
				filler.setHp(scan.nextInt());
				filler.setAtt(scan.nextInt());
				filler.setDef(scan.nextInt());
				filler.setSpatt(scan.nextInt());
				filler.setSpdef(scan.nextInt());
 				filler.setSpd(scan.nextInt());
				dex[pokeCount][trueForm] = filler;
			} else {
				filler.setName(scan.next());
				String type = scan.next();
				filler.setPrimaryType(GetDex.determineType(type));
				if(!scan.hasNextInt()){
					String type2 = scan.next();
					filler.setSecondaryType(GetDex.determineType(type2));
				} else {
					filler.setSecondaryType(null);
				}
				filler.setDexNumber(pokeCount);
				filler.setTotal(scan.nextInt());
				filler.setHp(scan.nextInt());
				filler.setAtt(scan.nextInt());
				filler.setDef(scan.nextInt());
				filler.setSpatt(scan.nextInt());
				filler.setSpdef(scan.nextInt());
 				filler.setSpd(scan.nextInt());
				dex[pokeCount][formCount] = filler;
				pokeCount++;
			}
		}
		
		scan.close();
		System.out.println(dex[1][0].toString());
	}
	
	public static Type determineType(String type){
		switch(type){
		case "Bug":
			return new Bug();
		case "Dark":
			return new Dark();
		case "Dragon":
			return new Dragon();
		case "Electric":
			return new Electric();
		case "Fairy":
			return new Fairy();
		case "Fighting":
			return new Fighting();
		case "Fire":
			return new Fire();
		case "Flying":
			return new Flying();
		case "Ghost":
			return new Ghost();
		case "Grass":
			return new Grass();
		case "Ground":
			return new Ground();
		case "Ice":
			return new Ice();
		case "Normal":
			return new Normal();
		case "Poison":
			return new Poison();
		case "Psychic":
			return new Psychic();
		case "Rock":
			return new Rock();
		case "Steel":
			return new Steel();
		case "Water":
			return new Water();
		}
		
		return null;
	}
	
	
}
