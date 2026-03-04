import java.util.HashMap;

public class UC8 {

    // Create character pattern map
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        map.put('P', new String[]{
                " ***** ",
                " *   * ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        });

        map.put('S', new String[]{
                " ***** ",
                " *     ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " ***** "
        });

        return map;
    }

    // Display banner
    public static void displayBanner(String message, HashMap<Character, String[]> map) {

        int height = map.get('O').length;

        for (int i = 0; i < height; i++) {

            for (char ch : message.toCharArray()) {
                System.out.print(map.get(ch)[i] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        displayBanner("OOPS", charMap);
    }
}