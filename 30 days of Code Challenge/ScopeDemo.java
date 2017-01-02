import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	// Add your code here
    int min, max;
    Difference(int[] a){
        min = getMin(a);
        max = getMax(a);
    }
    int getMin(int[] a){
        int minValue = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]<minValue){
                minValue = a[i];
            }
        }
        return minValue;
    }
    int getMax(int[] a){
        int maxValue = a[0];
        for(int j=1; j<a.length; j++){
            if(a[j]>maxValue){
                maxValue = a[j];
            }
        }
        return maxValue;
    }
    int computeDifference(){
        maximumDifference = max-min;
        return maximumDifference;
    }
 } // End of Difference class

public class ScopeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}
