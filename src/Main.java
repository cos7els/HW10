public class Main {

    public static void main(String[] args) {
        WorkWithStrings.firstTwoDigitBlocks("1234-abc-5678-def-9g0h");
        WorkWithStrings.onlyDigits("1234-abc-5678-def-9g0h");
        WorkWithStrings.onlyLetters("1234-abc-5678-def-9g0h");
        WorkWithStrings.isContainsABC("1234-abc-5678-def-9g0h");
        WorkWithStrings.isContainsABC("1234-cba-5678-def-9g0h");
        WorkWithStrings.isStartFrom555("1234-abc-5678-def-9g0h");
        WorkWithStrings.isStartFrom555("5555-abc-5678-def-9g0h");
        WorkWithStrings.isEndWith1a2b("5555-abc-5678-def-9g0h");
        WorkWithStrings.isEndWith1a2b("5555-abc-5678-def-1a2b");
        WorkWithStrings.shortestWord("It's not beautiful day");
        WorkWithStrings.longestWord("It's not beautiful day");
        WorkWithStrings.isPolyndrom("The word non", 2);
        WorkWithStrings.isPolyndrom("The word not", 2);
        WorkWithStrings.isPolyndrom(null, 2);
        WorkWithStrings.isPolyndrom("", 2);
        WorkWithStrings.isPolyndrom("The", 500);
        WorkWithStrings.isPolyndrom("The", -500);
        WorkWithStrings.duplication("Hello world!");
        WorkWithStrings.min("Hello world a ffff adbc");
        WorkWithStrings.min("Hello world ab ac ert");
    }

}
