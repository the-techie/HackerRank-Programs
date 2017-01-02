import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class 2DArraysDemo {
  public static void main(String[] args) {
    int sum[] = new int[16];
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
  int z=0;
  int maxTotal = 0;
    for(int a=0; a < 6; a++){
      for(int b=0; b < 6; b++){
        arr[a][b] = in.nextInt();
      }
    }
    for(int i=0; i < 4; i++){
      for(int j=0; j < 4; j++){
        sum[z] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        //System.out.println(z+" = "+sum[z]);
        z++;
      }
    }
  for(int p=1; p < 16; p++){
    if(sum[maxTotal] < sum[p]){
      //System.out.println(sum[maxTotal]+" "+sum[p]);
      maxTotal = p;
    }
  }
  //System.out.println(maxTotal);
  System.out.println(sum[maxTotal]);
  }
}
