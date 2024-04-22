public class CommandLineInput {
    public static void main(String[] args) {
        // Check if any command line arguments were passed
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            // Loop through each argument and print it
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}

