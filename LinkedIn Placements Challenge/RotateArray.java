// https://www.hackerrank.com/challenges/linkedin-practice-array-left-rotation

import java.util.*;
class RotateArray{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int shft = sc.nextInt();
    int arr1[] = new int[len];
    int tmp;

    for(int i=0; i<len; i++){
      arr1[i] = sc.nextInt();
    }

    for(int j=0; j<shft; j++){
      tmp = arr1[0];
      for(int k=1; k<len;k++){
        arr1[k-1] = arr1[k];
        if(k==len-1){
          arr1[k]=tmp;
        }
      }
    }
    for(int m=0; m<len; m++){
      System.out.print(arr1[m]+" ");
    }
  }
}

