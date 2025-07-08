import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                byte value = scanner.nextByte();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Byte expected.");
                scanner.next();
            }
        }

    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Int expected.");
                scanner.next();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.println(message);
            try {
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Float expected.");
                scanner.next();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Double expected.");
                scanner.next();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String text = scanner.nextLine();
            try {
                if (text.length() == 1) {
                    return text.charAt(0);
                }
                throw new WrongInputTypeException();
            } catch (WrongInputTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            String text = scanner.nextLine();
            try {
                if (text.length() > 1) {
                    return text;
                }
                throw new WrongInputTypeException();
            } catch (WrongInputTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.println(message);
            String text = scanner.nextLine();
            try {
                if (text.equals("y")) {
                    return true;
                } else if (text.equals("n")) {
                    return false;
                }
                throw new WrongInputTypeException();
            } catch (WrongInputTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

