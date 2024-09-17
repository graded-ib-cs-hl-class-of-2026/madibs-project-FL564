import java.util.Scanner;

public class App {

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */
    public static String Blue = "\u001B[34m";
    public static String Reset = "\u001B[0m";
    public static String Red = "\u001B[31m";
    public static String Green = "\u001B[32m";
    public static String Yellow = "\u001B[33m";
    public static String Purple = "\u001B[35m";
    public static String Cyan = "\u001B[36m";

    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
   
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
        System.out.println(Blue + "Welcome to MadLibs" + Reset);
        System.out.println(Cyan + "To play, simply fill in all the blanks following the prompt" + Reset);
        System.out.println(Green + "In the end, you will have created a full story" + Reset);
        System.out.println(Red + "It's time to play the game! Have fun!" + Reset);
    }

    public String getUserName() {
        System.out.println(Purple + "Enter your name" + Reset);
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    public void printGreeting(String userName) {
        System.out.println("Hello " + userName);
    }

    public void doMadlib() {
        Scanner blank = new Scanner(System.in);
       
        System.out.println(Purple + "Weather Condition" + Reset);
        String weather = blank.nextLine();
        System.out.println(Purple + "Job/Profession" + Reset);
        String job = blank.nextLine();
        System.out.println(Purple + "Place" + Reset);
        String place = blank.nextLine();
        System.out.println(Purple + "Object" + Reset);
        String object = blank.nextLine();
        System.out.println(Purple + "Different Place" + Reset);
        String differentPlace = blank.nextLine();
        System.out.println(Purple + "Vehicle" + Reset);
        String vehicle = blank.nextLine();
        System.out.println(Purple + "Celebrity" + Reset);
        String celebrity = blank.nextLine();
        System.out.println(Purple + "Place to Sit, exe: couch" + Reset);
        String sit = blank.nextLine();
        System.out.println(Purple + "Animal" + Reset);
        String animal = blank.nextLine();
        System.out.println(Purple + "What " + celebrity + " told you" + Reset);
        String said = blank.nextLine();
        System.out.println(Purple + "Emotion" + Reset);
        String emotion = blank.nextLine();
        System.out.println(Yellow + "Today it was " + Purple + weather + Yellow + ",and the " + Purple + job +
                Yellow + " decided to escape from the " + Purple + place + Yellow
                + " using a " + Purple + object + Yellow + ". Once he escaped, he went to " + Purple + differentPlace + Yellow + " via his " + Purple + vehicle
                + Yellow + ". When he got there, " + Purple + celebrity + Yellow + " was waiting for him on the " + Purple + sit + Yellow + ", playing with his " + Purple +
                animal + Yellow + ". " + Purple + celebrity + Yellow + " said " + Purple + said + Yellow + ", and you left, feeling " + Purple + emotion + Yellow + "." + Reset);
                System.out.println(Purple + " ______   __  __     ______     __   __     __  __     ______        ______   ______     ______        ______   __         ______     __  __     __     __   __     __   __     ______    \n" + //
                Cyan + "/\\__  _\\ /\\ \\_\\ \\   /\\  __ \\   /\\ \"-.\\ \\   /\\ \\/ /    /\\  ___\\      /\\  ___\\ /\\  __ \\   /\\  == \\      /\\  == \\ /\\ \\       /\\  __ \\   /\\ \\_\\ \\   /\\ \\   /\\ \"-.\\ \\   /\\ \"-.\\ \\   /\\  ___\\   \n" + //
                Green + "\\/_/\\ \\/ \\ \\  __ \\  \\ \\  __ \\  \\ \\ \\-.  \\  \\ \\  _\"-.  \\ \\___  \\     \\ \\  __\\ \\ \\ \\/\\ \\  \\ \\  __<      \\ \\  _-/ \\ \\ \\____  \\ \\  __ \\  \\ \\____ \\  \\ \\ \\  \\ \\ \\-.  \\  \\ \\ \\-.  \\  \\ \\ \\__ \\  \n" + //
                Red + "   \\ \\_\\  \\ \\_\\ \\_\\  \\ \\_\\ \\_\\  \\ \\_\\\\\"\\_\\  \\ \\_\\ \\_\\  \\/\\_____\\     \\ \\_\\    \\ \\_____\\  \\ \\_\\ \\_\\     \\ \\_\\    \\ \\_____\\  \\ \\_\\ \\_\\  \\/\\_____\\  \\ \\_\\  \\ \\_\\\\\"\\_\\  \\ \\_\\\\\"\\_\\  \\ \\_____\\ \n" + //
                Yellow + "    \\/_/   \\/_/\\/_/   \\/_/\\/_/   \\/_/ \\/_/   \\/_/\\/_/   \\/_____/      \\/_/     \\/_____/   \\/_/ /_/      \\/_/     \\/_____/   \\/_/\\/_/   \\/_____/   \\/_/   \\/_/ \\/_/   \\/_/ \\/_/   \\/_____/ \n" + //
                "                                                                                                                                                                                          " + Reset);
        //https://patorjk.com/software/taag/#p=display&f=Sub-Zero&t=THANKS%20FOR%20PLAYING
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD N`O CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
