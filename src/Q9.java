/*
* In the case of creating an exception where no stack trace is needed we need to create an exception using the Exception class .
* this custom exception  will make use of fillInStackTrace method of the throwable class which is used by jvm internally to
* populate the stack trace for the exception at the point where it is created .
* Once we have once we have overridden that we can make use of our custom Exception without a stack trace.
*
* example method usage :
*
                * public synchronized Throwable fillInStackTrace() {
                    return this;
                }
                * In this case the function is returning the current object and therefore we can achieve the desired
                * output of creating an exception without a stack trace
* */


public class Q9 {
    public static void main(String [] args)
    {
        
    }
}
