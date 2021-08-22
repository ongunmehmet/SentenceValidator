import java.lang.reflect.Array;

public class Main {
    public static  boolean isSentenceValid(String input){
        char firstLetter = input.charAt(0);
        String [] words=input.split(" ");
        boolean isValid = false;
        for (int i=1 ; i<words.length ;i++) {
            if(words[i].length() >=4 && Character.toUpperCase(words[i].charAt(0)) == Character.toUpperCase(firstLetter)){
                isValid = true;

            }
            else if(words[i].length() <4){
                continue;

            }
            else {
                isValid = false;
                break;
            }
        }
        return  isValid;



    }

    public static void main(String[] args) {

        String example ="Serious songs and seeds split";
        System.out.println(isSentenceValid(example));


    }
}
