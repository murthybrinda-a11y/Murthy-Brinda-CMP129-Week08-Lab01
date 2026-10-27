public class SimpleExceptionDemo 
{
    public static void main (String args [])
    {
        safeDivide(20,4);
        safeDivide(15, 0);
        safeDivide(-30, 5);


    }
    public static void safeDivide(int numerator, int denominator) 
    
    {
        System.out.println("");   

        try 
        {
            int result = numerator/denominator ;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error : Cannot divide by zero");
        }
        finally
        {
            System.out.println("Division complete");
        }
    }


}
