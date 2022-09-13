import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            boolean flag = false;

    
            try{

                
               int num = sc.nextInt();
             

                if(num < 0)
                throw new NegativeNumberNotAllowedException("Number is negative");


            

             for (int i = 2; i <= num / 2; ++i) {
            
                if (num % i == 0) {
                    flag = true;
                    break;
                }   
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                throw new NumberNotPrimeException("Number is not prime");

            }catch(NegativeNumberNotAllowedException | NumberNotPrimeException e){

            }
        }
  }
}

  //NegativeNumberNotAllowed  User defined Exception

class  NegativeNumberNotAllowedException extends Exception{

    public NegativeNumberNotAllowedException(String str){

        System.out.println(str);
    }
}

  //NumberNotPrime User defined Exception


class  NumberNotPrimeException  extends Exception{

    public NumberNotPrimeException(String str){

        System.out.println(str);
    }
}
