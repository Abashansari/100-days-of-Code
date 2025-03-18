import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of  the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to search for: ");
        int x = scanner.nextInt();
        
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Number " + x + " found at index: " + index);
        } else {
            System.out.println("Number " + x + " not found in the array.");
        }
        
        scanner.close();
    }
}
