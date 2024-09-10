
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // Exercise Day 5
        //No.1

        //No.2
        //changeCurrency();
        // No. 3
        int[] userEvenNum =  getEvenNumber();
        System.out.println("The even number collection consist of: " + Arrays.toString(userEvenNum));
        // No.4

        // No.5

//        int[] userPairNum = getTargetInt();
//        boolean isPairFound = (userPairNum[0] != -1 && userPairNum[1] != -1);
//        if (isPairFound) {
//            System.out.println("Pair found at index: " + Arrays.toString(userPairNum));
//        } else {
//            System.out.println("No pair index found");
//        }

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


    public static int[] getEvenNumber() {
        int count = InputUser.getInt("How many numbers do you want to store as collection number? ");
        int[] userArr = new int[count];
        int evenCount = 0;

        for (int i = 0; i < count; i++) {
            int number = InputUser.getInt("Enter number " + (i + 1) + ": ");
            if (number % 2 == 0) {
                userArr[evenCount] = number;
                evenCount++;
            }
        }
        int[] userEvenArr = new int[evenCount];
        for ( int e = 0 ; e < evenCount; e++){
            userEvenArr[e] = userArr[e];
        }
        return userEvenArr;
//        System.out.println("The even numbers are:");
//        for (int i = 0; i < evenCount; i++) {
//            System.out.print(userArr[i] + " ");
//        }
//        System.out.println();
        //return userArr;
    }

    public static int[] getTargetInt(){
        int target = InputUser.getInt("What numbers do you want to set as target number ? ");
        int count = InputUser.getInt("How many numbers do you want to store that generate the target number? ");
        int[] userArr = new int[count];
        for (int u = 0 ; u < count ; u ++){
            userArr[u] = InputUser.getInt("Enter number " + (u + 1) + ": ");

        }
//        int[] userPairIndex = new int[1];
//        for (int i = 0; i < count; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (userArr[i] + userArr[j] == target) {
//                    userPairIndex[0] = i;
//                    userPairIndex[1] = j;
//
//                }
//                else if (userArr[i] + userArr[j] != target){
//                    userPairIndex[0] = 9999;
//                    userPairIndex[1] = 9999;
//                }
//            }
//        }

        int[] userPairIndex = {-1, -1};
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (userArr[i] + userArr[j] == target) {
                    userPairIndex[0] = i;
                    userPairIndex[1] = j;
                    return userPairIndex;
                }
            }
        }
        return userPairIndex;
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
