class Question01 {
public static void main(String args[])
    {
        //Arithmetic Exception
        try {
            int a = 19, b = 0;
            int c = a / b; 
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
            System.out.println("Arithmetic Exception caught.");
        }finally{
            System.out.println();
            System.out.println("next exception --->");
            System.out.println();
        }

        //ArrayIndexOutOfBounds Exception
        
        try {
            int a[] = new int[2];
            a[3] = 19;
            
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
            System.out.println("ArrayIndexOutOfBounds Exception caught.");
        }finally{
            System.out.println();
            System.out.println("next exception--->");
            System.out.println();
        }


        //nullPointer Exception
        try {
            String str= null; 
            System.out.println(str.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException..");
            System.out.println("NullPointerException caught.");
        }finally{

            System.out.println();
            System.out.println("END");
            System.out.println();
        }
    }
}