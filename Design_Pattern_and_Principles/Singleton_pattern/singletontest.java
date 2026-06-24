package Design_Pattern_and_Principles.Singleton_pattern;

public class singletontest {
    public static void main(String[] args) {

        logger logger1 = logger.getInstance();
        logger logger2 = logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Logged In");

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple instances created.");
        }
    }
}
