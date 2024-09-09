import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // Exercise Day 5
        //No.1
        changeCurrency();
        //No.2
        getEvenNumber();
        // No. 3

        // No.4


        // No.5


        // Self Exercise
        //showPriceMenu();

    }



        public static void changeCurrency() {
            String[] currencyCodes = {"EUR", "GBP", "JYP"};
            double[] exchangeRates = {0.92, 0.79, 147.65};
            System.out.println("Please input the number to the currency you would like to exchange:");
            for (int i = 0; i < currencyCodes.length; i++) {
                System.out.println((i + 1) + ". " + currencyCodes[i]);
            }
            int option = InputUser.getInt("Your choice: ");

            if (option < 1 || option > currencyCodes.length) {
                System.out.println("Invalid option selected.");
                return;
            }
            double amount = InputUser.getDouble("Please input the amount of money you would like to exchange: ");

            int selectedIndex = option - 1;
            double result = amount * exchangeRates[selectedIndex];
            System.out.println(amount + " in USD is equal to: " + result + " in " + currencyCodes[selectedIndex]);
        }


    public static void getEvenNumber() {
        int count = InputUser.getInt("How many numbers do you want to enter? ");
        int[] userArr = new int[count];
        int evenCount = 0;

        for (int i = 0; i < count; i++) {
            int number = InputUser.getInt("Enter number " + (i + 1) + ": ");
            if (number % 2 == 0) {
                userArr[evenCount] = number;
                evenCount++;
            }
        }

        System.out.println("The odd numbers are:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(userArr[i] + " ");
        }
        System.out.println();
    }


    //////Exercise
    public static void showPriceMenu() {
        int option = InputUser.getInt("Please input the menu number you would like to order:\n" +
                "1. Fried Chicken\n" +
                "2. Pasta\n" +
                "3. Bulgogi\n" +
                "Your choice: ");

        if (option == 1) {
            System.out.println("The price is: 30000 IDR");
        } else if (option == 2) {
            System.out.println("The price is: 40000 IDR");
        } else if (option == 3) {
            System.out.println("The price is: 50000 IDR");
        } else {
            String optionOther = InputUser.getString("You entered an invalid number. Would you like to order something not available in the menu?\n" +
                    "Type 'Yes' or 'No': ");
            if (optionOther.equalsIgnoreCase("Yes")) {
                showNewRequestMenu();
            } else {
                System.out.println("Thank you! Please choose from the available menu.");
            }
        }
    }

    public static void showNewRequestMenu() {
        String newOption = InputUser.getString("Please tell us what food you would like to order (e.g., Kimchi, Sushi, Rujak): ");

        switch (newOption.toLowerCase()) {
            case "kimchi":
                System.out.println("Kimchi price is 34000 IDR");
                break;
            case "sushi":
                System.out.println("Sushi price is 39000 IDR");
                break;
            case "rujak":
                System.out.println("Rujak price is 25000 IDR");
                break;
            default:
                System.out.println("Sorry, we don't serve " + newOption + " right now.");
                showNewDiscountMenu();
                break;
        }
    }

    public static void showNewDiscountMenu() {
        String[] discMenu = {"Siomay", "Asinan", "Ramen"};
        for (int menuD = 0; menuD < discMenu.length; menuD++) {
            System.out.println("We have discount for " + discMenu[menuD] + " right now.");
        }
    }

//    public static void getOrderMenu() {
//        int countMenu  = InputUser.getIntArray()
//    }

    //





}
