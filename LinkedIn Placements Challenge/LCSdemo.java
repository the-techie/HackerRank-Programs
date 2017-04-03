// https://www.hackerrank.com/challenges/linkedin-practice-dynamic-programming-lcs

import java.util.*;
class LCSdemo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // take length of arrays as input
    int n = sc.nextInt();
    int m = sc.nextInt();

    // create two arrays of lengths 'n' and 'm'
    int arr1[] = new int[n];
    int arr2[] = new int[m];
    
    // add values to the arrays
    for(int i=0; i<n; i++){
      arr1[i] = sc.nextInt();
    }
    for(int j=0; j<m; j++){
      arr2[j] = sc.nextInt();
    }
    
    int count1 = 0;
    int count2 = 0;
    String arr3 = "";
    String arr4 = "";
    int p=0;
    int q=0;
    // comparing elements of both arrays
    for(int c=0; c<n; c++){
      for(int i=q; i<n; i++){
        System.out.println("i = "+i);
        for(int j=p; j<m; j++){
          System.out.println("j = "+j);
          if(arr1[i]==arr2[j] && j!=m-1){
            arr4 += arr1[i]+" ";
            if(arr3.length()<arr4.length()){
              arr3 = arr4;
              System.out.println(arr3);
              p=j+1;
            }
            break;
          }
          if(j==m-1){
            arr4 += arr1[i]+" ";
            if(arr3.length()<arr4.length()){
              arr3 = arr4;
              System.out.println(arr3);
              p=j+1;
            }
            p=0;
            break;
          }
        }
        q=i+1;
      }
    }
    System.out.println(arr3);
  }
}
