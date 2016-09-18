package org.redbasin.exception1;

/**
 * Created by jtanisha-ee on 7/17/16.
 */
public class ExceptionHandler {

    public static float divide(int x, int y) throws  DivideByZeroException, NegativeParametersException {
        if (y == 0) {
            throw new DivideByZeroException("You cannot divide by zero");
        }
        if ( (x < 0) || (y < 0) ) {
            throw new NegativeParametersException("You cannot provide negative numbers");
        }
        return (float)x / y;
        // return x / (float)y;
        // return (float)x/(float)y;  // casting both num and den is redundant
        //return (float) (x/y);  invalid will cast 0 to a float
    }

    public static void main(String[] args)  {

        float f = -100;
        try {
            f = divide(7, 11);
            System.out.println(f);
        } catch (DivideByZeroException e) {
           System.out.println(e.getMessage());
        } catch (NegativeParametersException e) {
            System.out.println(e.getMessage());
        }

        System.out.println((float)7/11);
        System.out.println(7.0/11);

        try {
            f = divide(7, 0);

        }   catch (DivideByZeroException e) {
                System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("LETS SEE IF YOU CAME HERE " + f);
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class NegativeParametersException extends Exception {
    public NegativeParametersException(String message) {
        super(message);
    }
}
