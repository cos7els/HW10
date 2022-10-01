public class WorkWithStrings {

    public static void firstTwoDigitBlocks(String string) {
        StringBuilder result = new StringBuilder();
        for (String s : string.split("-")) {
            if (s.matches("\\d{4}")) {
                result.append(s).append("-");
            }
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }

    public static void onlyDigits(String string) {
        System.out.println(string.replaceAll("[a-zA-Z]{3}", "***"));
    }

    public static void onlyLetters(String string) {
        StringBuilder result = new StringBuilder("Letters: ");
        for (String s : string.split("[^a-zA-Z]")) {
            if (s.matches("[a-zA-Z]+")) {
                result.append(s).append("/");
            }
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }

    public static void isContainsABC(String string) {
        System.out.println(string.toLowerCase().contains("abc") ? "Contains ABC" : "Not contains ABC");
    }

    public static void isStartFrom555(String string) {
        System.out.println(string.startsWith("555") ? "Start from 555" : "Not start from 555");
    }

    public static void isEndWith1a2b(String string) {
        System.out.println(string.toLowerCase().endsWith("1a2b") ? "End with 1a2b" : "Not end with 1a2b");
    }

    public static void shortestWord(String string) {
        StringBuilder result = new StringBuilder(string);
        for (String s : string.split(" ")) {
            if (result.length() >= s.length()) {
                result = new StringBuilder(s);
            }
        }
        System.out.printf("The shortest word: %s\n", result);
    }

    public static void longestWord (String string) {
        StringBuilder result = new StringBuilder();
        for (String s : string.split(" ")) {
            if (result.length() <= s.length()) {
                result = new StringBuilder(s);
            }
        }
        System.out.printf("The longest word: %s\n", result);
    }

    public static void isPolyndrom(String string, int i) {
        if (string == null || string.length() == 0) {
            System.out.printf("Incorrect string '%s'\n", string);
            return;
        }
        String[] array = string.split(" ");
        if (i < 0 || i > array.length - 1) {
            System.out.printf("Incorrect value '%d'\n", i, array.length);
            return;
        }
        StringBuilder result = new StringBuilder(array[i]);
        if (array[i].equals(result.reverse().toString())) {
            System.out.printf("The word '%s' is polyndrom\n", array[i]);
        } else {
            System.out.printf("The word '%s' is not polyndrom\n", array[i]);
        }
    }

    public static void duplication(String string) {
        StringBuilder result = new StringBuilder();
        for (String s : string.split("")) {
            result.append(s).append(s);
        }
        System.out.println(result);
    }

    public static void min(String string) {
        String result = string;
        for (String s : string.split(" ")) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length() - 1; i++) {
                for (int j = i + 1; j < sb.length();) {
                    if (sb.charAt(i) == sb.charAt(j)) {
                        sb.deleteCharAt(j);
                    } else {
                        j++;
                    }
                }
            }
            if (sb.length() < result.length()) {
                result = s;
            }
        }
        System.out.printf("The string with minimum characters: '%s'\n", result);
    }

}
