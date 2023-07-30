import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a name to the hedgehog:");
        String hedgehogName = sc.nextLine();
        Hedgehog hedgehog = new Hedgehog(hedgehogName);
        hedgehog.speak1();

        while (true) {
            System.out.println("What should the hedgehog say?");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;

            } else {
                try {
                    int number = Integer.parseInt(input);
                    hedgehog.speak2(number);

                } catch (NumberFormatException e) {
                    hedgehog.speak3(input);
                }
            }
        }
    }
}
