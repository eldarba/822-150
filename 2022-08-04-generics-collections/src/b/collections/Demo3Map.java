package b.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3Map {

	public static void main(String[] args) {
		
		Map<String, String> mapDictionary = new HashMap<>();
		
		// add entries
		
		mapDictionary.put("table", "a furniture with 4 legs");
		mapDictionary.put("java", "a programming language");
		mapDictionary.put("moon", "a heavenly body");
		

		try(Scanner sc = new Scanner(System.in);){
			System.out.print("enter word: ");
			String key = sc.nextLine();
			System.out.println(mapDictionary.get(key));
		}
		

	}

}
