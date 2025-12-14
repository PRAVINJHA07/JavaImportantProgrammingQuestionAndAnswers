package demo;

import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateCharacters {

	public static void main(String[] args) {

		
		String name="PravinKumarJha";
		name=name.toLowerCase().replaceAll("\\s","");
		
		
		Map<Character,Integer> fre=new HashMap<>();
		
		for(char c:name.toCharArray()) {
			
			fre.put(c, fre.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:fre.entrySet()) {
		
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		}
			
	}

}
