import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RecursionDemo {
    static Scanner scan = new Scanner(System.in);
    static int n = scan.nextInt();
    public static int Factorial(int n){
        if(n<=0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {      
        System.out.println(Factorial(n));
    }
}
