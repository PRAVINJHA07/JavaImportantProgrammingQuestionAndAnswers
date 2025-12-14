import java.util.*;

class Main {
    public static void main(String[] args) {

        String name = "SeleniumProgram".toLowerCase();
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : name.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                break;
            }
        }
    }
}
