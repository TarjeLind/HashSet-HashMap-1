import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char simbol = text.charAt(i);
            if (!Character.isLetter(simbol)) {
                continue;
            }
            if (map.containsKey(simbol)) {
                map.put(simbol, map.get(simbol) + 1);
            } else {
                map.put(simbol, 1);
            }
        }
        int max = -1;
        char maxLetter = 0;
        for (char simbol : map.keySet()) {
            int value = map.get(simbol);
            if (value > max) {
                max = value;
                maxLetter = simbol;
            }
        }
        int min = Integer.MAX_VALUE;
        char minLetter = 0;
        for (char simbol : map.keySet()) {
            int value = map.get(simbol);
            if (value < min) {
                min = value;
                minLetter = simbol;
            }
        }
        System.out.println("Буква " + maxLetter + " встречается чаще всего " + " - " + max + " раз(а).");
        System.out.println("Буква " + minLetter + " встречается реже всего " + " - " + min + " раз(а).");
    }
}