package miscell;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class getnonrepeatedcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sassssaay";
Optional<Character> cg=getNonRepeatedCharacterOpt(str);

System.out.println(cg.toString());
	}

	public static Optional<Character> getNonRepeatedCharacterOpt(String str) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
         Character c = str.charAt(i);
         if (!countCharacters.containsKey(c)) {
          countCharacters.put(c, 1);
         } else {
          countCharacters.put(c, countCharacters.get(c) + 1);
         }
        }
        
        System.out.println(countCharacters.toString());
        // As LinkedHashMap maintains insertion order, first character with
        // count 1 should return first non repeated character
        for (Entry<Character, Integer> e : countCharacters.entrySet()) {
         if (e.getValue() == 1)
          return Optional.of(e.getKey());

        }
        return Optional.ofNullable(null);

       }

	
	
}
