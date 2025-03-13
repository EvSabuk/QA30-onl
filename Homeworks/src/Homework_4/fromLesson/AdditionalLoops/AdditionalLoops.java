package Homework_4.fromLesson.AdditionalLoops;

public class AdditionalLoops {
    public static void main(String[] args){
        readLetters();
    }

    public static void advancedFor(){
        String java = "Hello new world!!!";

        for (char letter : java.toCharArray()){
            System.out.println("Your letter is: " + letter);
        }
    }

    public static void readLetters(){
        for (int index = 2, letter = 65; index <= 27; index++, ++letter){
            System.out.println("ASCII Table " + letter + " equals to " + (char) letter);
        }
    }
}

