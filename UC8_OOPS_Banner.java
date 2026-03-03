import java.util.HashMap;

public class UC8_OOPS_Banner {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        // O
        map.put('O', new String[]{
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        });

        // P
        map.put('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        });

        // S
        map.put('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                " ***** "
        });

        return map;
    }

    public static void displayBanner(String message,
                                     HashMap<Character, String[]> map) {

        int height = map.get('O').length;

        for (int i = 0; i < height; i++) {
            for (char ch : message.toCharArray()) {
                System.out.print(map.get(ch)[i] + "   "); // spacing between letters
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}