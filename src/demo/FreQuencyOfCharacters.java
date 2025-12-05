package demo;

import java.util.HashMap;
import java.util.Map;

public class FreQuencyOfCharacters {

	public static void main(String[] args) {

		String name="SeleniumAutomation Program";
		name=name.toLowerCase().replaceAll("\\s", "");

		Map<Character,Integer> freq=new HashMap<>();

		for(char ch:name.toCharArray()) {

			freq.put(ch, freq.getOrDefault(ch, 0)+1);
		}

		for(Map.Entry<Character, Integer> entry:freq.entrySet()) {

			System.out.println(entry.getKey()+" -> "+entry.getValue());

		}	
	}
}
