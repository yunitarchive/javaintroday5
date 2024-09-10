import java.util.Scanner;

public class InputUser {
    private static Scanner scanner = new Scanner(System.in);



    public static int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }


    public static double getDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }


    public static String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int[] getIntArray(String message, int size) {
        int[] numbers = new int[size];
        System.out.println(message);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }
//    public static String[] getStringArray(String message, int size) {
//        int[] numbers = new int[size];
//        System.out.println(message);
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        return numbers;
//    }
}

