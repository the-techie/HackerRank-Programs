import java.io.*;
import java.util.*;

public class ArraysDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    int[] arr2 = new int[n];
    int j=0;
    for(int i=0; i < n; i++){
      arr[i] = in.nextInt();
      arr2[j] = arr[i];
      //System.out.print(arr[i]+" ");
      j++;
    }        
    for(int k=j; k>0; k--){
      System.out.print(arr2[k-1]+" ");
    }
    in.close();
  }
}
