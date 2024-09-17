import java.util.Scanner;

public class App {

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }

    /*
     * Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */

    public void printInstructions() {
        System.out.println("Welcome to MadLibs");
        System.out.println("To play, simply fill in all the blanks following the prompt");
        System.out.println("In the end, you will have created a full story");
        System.out.println("It's time to play the game! Have fun!");
    }

    public String getUserName() {
        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    public void printGreeting(String userName) {
        System.out.println("Hello " + userName);
    }

    public void doMadlib() {
        Scanner blank = new Scanner(System.in);

        System.out.println("weather condition");
        String weather = blank.nextLine();
        System.out.println("job/profession");
        String job = blank.nextLine();
        System.out.println("place");
        String place = blank.nextLine();
        System.out.println("object");
        String object = blank.nextLine();
        System.out.println("different place");
        String differentPlace = blank.nextLine();
        System.out.println("vehicle");
        String vehicle = blank.nextLine();
        System.out.println("celebrity");
        String celebrity = blank.nextLine();
        System.out.println("place to sit, exe: couch");
        String sit = blank.nextLine();
        System.out.println("animal");
        String animal = blank.nextLine();
        System.out.println("what " + celebrity + " told you");
        String said = blank.nextLine();
        System.out.println("emotion");
        String emotion = blank.nextLine();
        System.out.println("Today it was " + weather + ",and the " + job + " decided to escape from the " + place
                + " using a " + object + ". Once he escaped, he went to " + differentPlace + " via his " + vehicle
                + ". When he got there, " + celebrity + " was waiting for him on the " + sit + ", playing with his "
                + animal + ". " + celebrity + " said " + said + ", and you left, feeling " + emotion + ".");
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD N`O CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
