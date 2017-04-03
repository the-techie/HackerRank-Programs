// https://www.hackerrank.com/challenges/linkedin-practice-divisible-sum-pairs
import java.util.*;
class DivPairSum{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr1[]=new int[n];
    int count = 0;
    for(int i=0; i<n; i++){
      arr1[i] = sc.nextInt();
    }
    for(int i=0; i<n-1;i++){
      for(int j=i+1; j<n; j++){
        if((arr1[i]+arr1[j])%k==0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}