import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter index: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Element value with index " + index + " is: " + arr[index]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Index exceeded array limit");
        }
    }
}
