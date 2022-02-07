package newswitch;



/**
 * from java 12
 */
public class NewSwitch {

    public static void main(String[] args) {
        String player = "Yoo";
//        oldSwitch(player);
        newSwitch(player);
    }

    private static void oldSwitch(String player) {
        switch (player) {
            case "Ko":
            case "Kim":
            case "Park":
                System.out.println("Seoul");
                break;
            case "Lee":
                System.out.println("Pusan");
                break;
            case "Yoo":
                System.out.println("Incheon");
                break;
            default:
                System.out.println("I don't Know.");
        }
    }

    private static void newSwitch(String player){
        switch (player) {
            case "Ko", "Kim", "Park" -> System.out.println("Seoul");
            case "Lee" -> System.out.println("Pusan");
            case "Yoo" -> System.out.println("Incheon");
            default -> System.out.println("I don't Know");
        }
    }
}
