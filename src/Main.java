import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println("Good Morning? what is your problem today?Enter your response here or press q to quite.");
        String answer = myVar.nextLine();
        System.out.println(answer);
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
            System.out.println(input);

        }
        quit();
    }
        public static void quit () {

            System.out.println("Bye bye!!! See you next time.");

        }
    }

