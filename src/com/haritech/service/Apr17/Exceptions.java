package com.haritech.service.Apr17;

//try, catch, finally, throw, throws
// errors, exceptions(checked exceptions, unchecked exceptions)
//checked exceptions => compile time exceptions
//unchecked exceptions => runtime exceptions
public class Exceptions {
    public static void main(String args[]){
        int a = 0;
        if(a==0){

        }
        //3 combinations
        //try, catch
        try{
            System.out.println("Hello world::" + 10 / 0);
        }catch (NullPointerException ne){
            System.out.println("Handle exception");
        }catch (ArrayIndexOutOfBoundsException ae){

        }catch (ArithmeticException ai){

        }catch(Exception e){

        }
        System.out.println("today is holiday");

        //try, catch, finally
        //try, finally
        try{
            System.out.println("Hello world::");
        }finally {//even exception occurs or may not occur. finally block will executes.
            try{
                System.out.println("today is Apr17");
                System.out.println("this is new line:: "+ 10/0);
                System.out.println("after exception raised");
            }catch (Exception e){
                System.out.println("handle exception in finally block");
            }
            System.out.println("this is finally block");
        }
        System.out.println("this is exception handling code");
    }
}
