import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private int number;
    private static Scanner scanner = new Scanner(System.in);

    // Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":
    //
    //public static byte llegirByte(String missatge);
    //
    //public static int llegirInt(String missatge);
    //
    //public static float llegirFloat(String missatge);
    //
    //public static double llegirDouble(String missatge);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
