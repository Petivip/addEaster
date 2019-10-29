import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String, String> myMap = new HashMap<String, String>();
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println("Good Morning? what is your problem today?Enter your response here or press q to quite.");
        String answer = myVar.nextLine();
        wordSwitch(answer);

        if(answer.equalsIgnoreCase("q")){
            quit();
        }

        response();

    }

    public static void response() {
        String input="word";
        Scanner myVar = new Scanner(System.in);

        while (!input.equalsIgnoreCase("q")) {
            System.out.println("Enter your response here or Q to quit:");
            input = myVar.nextLine();
            wordSwitch(input);

        }
        quit();
    }
        public static void quit () {

            System.out.println("Bye bye!!! See you next time.");

        }
    public static void wordSwitch(String sentence) {
        String newS=sentence;
        myMap.put("i","you");
        myMap.put("me","you");
        myMap.put("am","are");
        myMap.put("my","your");
       for(String word:sentence.split(" ")){
           for(String key:myMap.keySet()) {
               if (word.equalsIgnoreCase(key)) {
                   newS = newS.replace(word, myMap.get(word));
               }
           }
       }
        System.out.println(newS);

        }

    }

