import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 names (press Enter after each name):");
        
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();
        
        System.out.println("\nThe 5 names you entered are:");
        
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        
        
        scanner.close();
    }
}
