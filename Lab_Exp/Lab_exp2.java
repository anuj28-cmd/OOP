package OOP.Lab_Exp;
import java.util.Scanner;

class Adder {
    public int[] arr;
    public int targetSum;

    // Function to get data from the user
    public void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter distinct integers for the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            for (int j=i-1;j>=0;j--){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate entry not allowed");
                    i--;
                    break;

                }
                else {
                    continue;
                }
            }
        }

        System.out.print("Enter the target sum: ");
        targetSum = sc.nextInt();

    }

    // Function to find and return a pair of elements that sum up to the target sum
    public int[] numsum() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[]{arr[i], arr[j]};   // Found a pair will return a new pair array
                }
            }
        }
        // No pair found, return an empty array
        return new int[0];
    }

}

public class Lab_exp2 {
    public static void main(String[] args) {
        Adder adder = new Adder();  // Create an instance of the Adder class

        adder.getdata();    // Get data from the user

        int[] result = adder.numsum();    // Find and display the pair of elements that sum up to the target sum

            if (result.length == 0) {
                System.out.println("No pair found.");
            } else {
                System.out.println("Pair found: {" + result[0] + ", " + result[1] + "}");
            }
    }
}