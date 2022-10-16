import java.util.Scanner;

/**
 *
 * @author sayeed-codes
 */
public class simple_calculator_02 {

    public static void main(String[] args) {
        
        operation();
    }

    static Scanner sc = new Scanner (System.in);
    public static int num1, num2;
    
    public static void operation (){

        System.out.println("1. Addition       | +");
        System.out.println("2. Subtraction    | -");
        System.out.println("3. Multiplication | *");
        System.out.println("4. Division       | /");
        System.out.println("5. Exit.");
        System.out.print("Enter operator menu number 1-5(ex 4) : ");
        int user_menu_num_input = sc.nextInt();
        
        switch (user_menu_num_input ) {
            case 1:
                calculation_two_num_input_from_user ();
                System.out.println("The Result is: "+addition(num1,num2));
                break;
            case 2:
                calculation_two_num_input_from_user ();
                System.out.println("The Result is: "+subtraction(num1,num2));
                break;
            case 3:
                calculation_two_num_input_from_user ();
                System.out.println("The Result is: "+multiplication(num1,num2));
                break;
            case 4:
                calculation_two_num_input_from_user ();
                System.out.println("The Result is: "+division(num1,num2));
                break;
            case 5: 
                    System.out.println("Thanks for using");
                    System.exit(0);
                    break;
            default:
                System.out.println("Invalid operator menu number, enter valid menu number.");
                System.out.println("---------------------------------------------------");
                break;
        }
        
        System.out.println("--------------------------------------------");
        operation ();
    }
    
    
    public static void calculation_two_num_input_from_user (){
        System.out.println(" ");
        System.out.println("-------- Calculation of two numbers --------");
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
    
    
        public static int addition (int a, int b){
        return a+b;

    }
        
     
        public static int subtraction (int a, int b){
        return a-b;
        

    }    
    
     
        public static int multiplication (int a, int b){
        return a*b;

    }    
   
        public static int division (int a, int b){
        return a/b;

    }       


}