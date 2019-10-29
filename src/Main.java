import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static HashMap<String, String> myMap = new HashMap<String, String>();
    public static boolean capsLock=false;
    public static String color="white";
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

    public static void pig(String word) {
        char ch = word.charAt(0);
        if(word.equalsIgnoreCase("caps lock")){
            if(!capsLock){
                capsLock=true;
            }else {
                capsLock=false;
            }
        }
              if(capsLock){

                  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                      System.out.println((word + "way").toUpperCase());
                  } else {
                      System.out.println((word + "ay").toUpperCase());
                  }
              }else {

                  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                      System.out.println(word + "way");
                  } else {
                      System.out.println(word + "ay");
                  }
              }

    }

    public static void wordSwitch(String sentence) {
        Scanner myVar=new Scanner(System.in);
        String newS = sentence;
        myMap.put("i", "you");
        myMap.put("me", "you");
        myMap.put("am", "are");
        myMap.put("my", "your");

        if (sentence.equalsIgnoreCase("pig")) {
            System.out.println("Switching to a pig game latin game");
            String input2="pig";
           while(!input2.equalsIgnoreCase("q")) {

               System.out.println("What word do want to have pigmitized?:");
               input2 = myVar.nextLine();
               pig(input2);
           }
           quit();
        } else {
            for (String word : sentence.split(" ")) {
                for (String key : myMap.keySet()) {
                    if (word.equalsIgnoreCase(key)) {
                        newS = newS.replace(word, myMap.get(word));
                    }
                }
            }
            Random r = new Random();
            int random1 = r.nextInt(2);
            int random2 = r.nextInt(3);


            String[] hedges = {"Please tell me more ", "Many of my patients tell me the same thing ", "It is getting late, maybe we had better quit "};

            String[] qualifiers = {"Why do you say that ", "You seem to think that ", "So, you are concerned that "};
            if (random1 == 1) {
                System.out.println(hedges[random2]);
            } else {
                System.out.println(qualifiers[random2] + newS);
            }


        }
    }
    }

