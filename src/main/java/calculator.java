
import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator {

    public calculator(){};

    public static void main(String[] args){

        while(true){
            calculator calc = new calculator();
            System.out.println("Welcome to Scientific calculator");
            System.out.println("Press 1 to find square root of a number");
            System.out.println("Press 2 to find factorial of a number");
            System.out.println("Press 3 to find natural log (base e) of a number");
            System.out.println("Press 4 to find compute power ");
            System.out.println("Press any other key to exit !!!");
            Scanner sc = new Scanner(System.in);

            int curr_choice;
            try {
                curr_choice = sc.nextInt();
            }
            catch (InputMismatchException error){
                return;
            }
            if(curr_choice==1){
                System.out.println("enter the number for which you want to compute square root");
                double num;
                try {
                    num = sc.nextDouble();
                }catch (InputMismatchException error){
                    return;
                }
                if(num<0){
                    System.out.println("Square root can't be computed, enter a positive number");
                }
                else {
                    System.out.println("Square root of " + num + " is " + calc.getSquareRoot(num));
                }
            }
            else if (curr_choice==2){
                System.out.println("enter the number for which you want to compute Factorial");
                int num;
                try{
                    num = sc.nextInt();
                }catch (InputMismatchException error){
                    return;
                }
                if(num<0){
                    System.out.println("Factorial not defined for negative numbers, enter a positive number");
                }
                else {
                    System.out.println("Factorial of " + num + " is " + calc.getFactorial(num));
                }
            }
            else if(curr_choice==3){
                System.out.println("enter the number for which natural logarithm is to be computed ");
                double num;
                try {
                    num = sc.nextDouble();
                }catch (InputMismatchException error){
                    return;
                }
                if(num<=0){
                    System.out.println("enter a postive value");
                }
                else{
                    System.out.println("Natural logarithm of " + num + " is " + calc.getNaturalLog(num));
                }
            }
            else if(curr_choice==4){
                System.out.println("enter base (x) and exponent (b) for computing power");
                double x;
                double b;
                try{
                    x = sc.nextDouble();
                    b = sc.nextDouble();
                }catch(InputMismatchException error){
                    return;
                }
                System.out.println("Result is " + calc.getPower(x,b));
            }
            else{
                break;
            }
        }
    }

    public double getSquareRoot(double num){
        return Math.sqrt(num);
    }

    public long getFactorial(int num){
        long res=1;
        if(num>=1) {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }
        return res;
    }

    public double getNaturalLog(double num){
        return Math.log(num);
    }

    public double getPower(double x,double b){
        return Math.pow(x,b);
    }

}
