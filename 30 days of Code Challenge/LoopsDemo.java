import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i=1;
        int sum;
        while(i>=1 && i<=10){
            sum = N*i;
            System.out.println(N+" x "+i+" = "+sum);
            i++;
        }
    }
}
