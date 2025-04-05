package Homework_10.The_first_task;

public class StaticMethods {

    public static void getTwoMainBlocks(String document) {
     StringBuilder strBuilder = getBuilder(document);
     strBuilder.delete(13,22);
     strBuilder.delete(4,8);
        strBuilder.replace(4,5, " ");
     System.out.println(strBuilder);
    }

    public static void replaceLetters(String document) {
        StringBuilder strBuilder = getBuilder(document);
        strBuilder.replace(5,8, "***");
        strBuilder.replace(14,17, "***");
        System.out.println(strBuilder);
    }

    public static void getOnlyLetters(String document) {
        StringBuilder strBuilder = getBuilder(document);
        strBuilder.delete(0,5);
        strBuilder.replace(3,9, "/");
        strBuilder.replace(7,9, "/");
      strBuilder.replace(9,10, "/");
        System.out.println(strBuilder.toString().toLowerCase());
    }

    public static void getLettersWithDescription(String document) {
        StringBuilder strBuilder = getBuilder(document);
        strBuilder.delete(0,5);
        strBuilder.replace(3,9, "/");
        strBuilder.replace(7,9, "/");
        strBuilder.replace(9,10, "/");
        System.out.println("Letters:" + strBuilder.toString().toUpperCase());
    }

    public static void checkABC(String document) {
        String wordToCompare = "abc";
        System.out.println("The document number contain abc? -> "
                + document.toLowerCase().contains(wordToCompare.toLowerCase()));

    }

    public static void startWith(String document) {
        String wordToCompare = "555";
        System.out.println("The document number start with 555? -> "
                + document.toLowerCase().startsWith(wordToCompare.toLowerCase()));

    }

    public static void endWith(String document) {
        String wordToCompare = "1a2b";
        System.out.println("The document number end with 1a2b? -> "
                + document.toLowerCase().endsWith(wordToCompare.toLowerCase()));

    }


    public static StringBuilder getBuilder(String document) {
        return new StringBuilder(document);
    }

}
