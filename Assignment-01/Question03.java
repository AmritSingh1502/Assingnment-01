import java.util.Scanner;


public class Question03 {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a new string:");

            try{
            String str = sc.nextLine();

            String testString = "Sdmcet";

            boolean check = str.toLowerCase().contains(testString.toLowerCase());

            if(check){
                
                System.out.println("Substring is present.");
            }else{
                throw new SubStringNotFoundException("Substring is not present.");
            }


    }catch(SubStringNotFoundException e){}
        }
    }
}

    //subStringNotFound user defined exception
class  SubStringNotFoundException  extends Exception{

    public SubStringNotFoundException(String str){

        System.out.println(str);
    }
}
