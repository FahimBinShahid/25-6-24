import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter the length of the array:");
        int arrayLength = s.nextInt();


        int[] inputArray = getInteger(arrayLength);


        int[] sortedArray = sortInteger(inputArray);


        printArray(sortedArray);

        s.close();
    }

    public static int[] getInteger(int arrayLength) {
        Scanner s = new Scanner(System.in);
        int[] inputArray = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integers:");
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = s.nextInt();
        }
        return inputArray;
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Element " + i + " contains " + inputArray[i]);
        }
    }

    public static int[] sortInteger(int[] inputArray) {
        Arrays.sort(inputArray);
        int[] copiedArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = copiedArray[inputArray.length - 1 - i];
        }
        return inputArray;
    }
}
