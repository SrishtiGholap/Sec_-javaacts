import java.util.Scanner;

public class prime {
   public prime() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      boolean var3 = true;
      if (var2 <= 1) {
         var3 = false;
      } else {
         for(int var4 = 2; (double)var4 <= Math.sqrt((double)var2); ++var4) {
            if (var2 % var4 == 0) {
               var3 = false;
               break;
            }
         }
      }

      if (var3) {
         System.out.println(var2 + " is a prime number.");
      } else {
         System.out.println(var2 + " is not a prime number.");
      }

      var1.close();
   }
}

