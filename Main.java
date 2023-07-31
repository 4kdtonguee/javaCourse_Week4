import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        while (true) {
            System.out.println("1) Add a hedgehog, 2) Let them speak, 3) List hedgehogs, 0) Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Give a name to the hedgehog:");
                    String name = sc.nextLine();
                    Hedgehog hedgehog = new Hedgehog(name);
                    zoo.addAHedgehog(hedgehog);
                    hedgehog.speak1();
                    break;

                case 2:
                    System.out.println("What should hedgehogs say?");
                    String say = sc.nextLine();
                    try {
                        int number = Integer.parseInt(say);
                        zoo.hedgehogSpeak2(number);
                    } catch (NumberFormatException e) {
                        zoo.hedgehogSpeak1(say);
                    }
                    break;

                case 3:
                    zoo.hedgehogList();
                    break;


                case 0:
                    System.exit(0);
                default:
                    System.out.println("");
                    break;
            }
        }
    }
}
