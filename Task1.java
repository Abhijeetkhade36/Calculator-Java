//--Task 1--(Basic Calculator)//
import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int choice;
        double num1,num2,result;
        System.out.println("*****BASIC CALCULATOR*****");
        System.out.println("-----Avalible Operations-----");
        System.out.println("1. Adiition (+)");
        System.out.println("2. Substraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Select any Operation (1/2/3/4):");
        choice=sc.nextInt();

        System.out.print("---Enter a first Number :");
        num1=sc.nextDouble();

        System.out.print("---Enter a Second Number :");
        num2=sc.nextDouble();

        switch (choice) {
            case 1: result=num1+num2;
                    System.out.println("Result : "+result);
                    break;
            case 2: result=num1-num2;
                    System.out.println("Result : "+result);
                    break; 
            case 3: result=num1*num2;
                    System.out.println("Result : "+result);
                    break;        
            case 4: result=num1/num2;
                    System.out.println("Result : "+result);
                    break;
            default: System.out.println("You have Entered incorrect input ! Please Enter correct input.");

        }
sc.close();
    }
}