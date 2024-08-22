import java.util.Scanner;

     public class IT24102377Lab4Q1 {
           public static void main(String[] args) {
            Scanner input = new Scanner(System.in);



            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            System.out.print("Enter third number: ");
            int num3 = input.nextInt();
            System.out.print("user Entered number are:"+ num1);

int smallest, largest;


         if (num1 < num2 && num1 < num3) {
             smallest = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

         
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        } 



        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
 }

