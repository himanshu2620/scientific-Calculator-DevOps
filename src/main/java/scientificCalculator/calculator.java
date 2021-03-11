package scientificCalculator;

import java.util.Scanner;
import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class calculator {
    private static final Logger logger = LogManager.getLogger(calculator.class);
    public calculator(){};

    public static void main(String[] args){

        while(true){
            calculator calc = new calculator();
            System.out.println("Welcome to Scientific calculator");
            System.out.println("Press 1 to find square root of a number");
            System.out.println("Press 2 to find factorial of a number");
            System.out.println("Press 3 to find natural log (base e) of a number");
            System.out.println("Press 4 to compute power ");
            System.out.println("Press any other key to exit !!!");
            Scanner sc = new Scanner(System.in);

            int curr_choice;
            try {
                curr_choice = sc.nextInt();
            }
            catch (InputMismatchException error){
                logger.error("an error occurred!!!!");
                return;
            }
            if(curr_choice==1){
                System.out.println("enter the number for which you want to compute square root");
                double num;
                try {
                    num = sc.nextDouble();
                }catch (InputMismatchException error){
                    logger.error("The input entered is not a supported type, enter a valid type!!!");
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
                    logger.error("The input entered is not a supported type, enter a valid type!!!");
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
                    logger.error("The input entered is not a supported type, enter a valid type!!!");
                    return;
                }
                if(num<=0){
                    System.out.println("enter a positive value");
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
                    logger.error("The input entered is not a supported type, enter a valid type!!!");
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
        logger.info("[SQUAREROOT] - " + num);
        double res =  Math.sqrt(num);
        logger.info("[RESULT - SQUAREROOT] - " + res);
        return res;
    }

    public long getFactorial(int num){
        logger.info("[FACTORIAL] - " + num);
        long res=1;
        if(num>=1) {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }

    public double getNaturalLog(double num){
        logger.info("[NATURALLOG] - " + num);
        double res = Math.log(num);
        logger.info("[RESULT - NATURALLOG] - " + res);
        return res;
    }

    public double getPower(double x,double b){
        logger.info("[POWER] - " + x + " " + b);
        double res = Math.pow(x,b);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }
}
