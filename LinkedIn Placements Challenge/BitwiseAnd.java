// https://www.hackerrank.com/challenges/linkedin-practice-bitwise-and
import java.util.*;
class BitwiseAnd{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int a, b, c;
    int tmp[]= new int[t];
    for(int m=0; m<t; m++){
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for(int p=1; p<=n; p++){
        arr[p-1]=p;
      }
      tmp[m]=0;
      for(int i=0; i<n-1;i++){
        for(int j=i+1; j<n; j++){
          a=arr[i];
          b=arr[j];
          c = a&b;
          if(c<k){
            if(c>tmp[m]){
              tmp[m]=c;
            }
          }
        }
      }
    }
    for(int f=0; f<t; f++){
      System.out.println(tmp[f]);      
    }
  }
}