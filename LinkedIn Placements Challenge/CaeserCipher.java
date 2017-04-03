// https://www.hackerrank.com/challenges/linkedin-practice-caesar-cipher
import java.util.*;

class CaeserCipher{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // we are typecasting here because if we use nextInt() instead, the string input is expected in the same line. Otherwise, we can also shoot an empty nextLine() after nextInt() if you like
    // input 1
    int len = Integer.parseInt(sc.nextLine());

    int arr1[] = new int[len];

    // input 2
    String str = sc.nextLine();

    // input 3
    int shft = sc.nextInt();

    // storing the statement into an array of characters and in ascii format
    for(int i=0; i<len; i++){
      arr1[i] = (int)(char)str.charAt(i);
    }

    for(int i=0; i<shft; i++){
      for(int j=0; j<len; j++){
        if(arr1[j]>64 && arr1[j]<91){
          if(arr1[j]==90){
            arr1[j] = 65;
          }
          else{
            arr1[j] = arr1[j]+1;
          }
        }else if(arr1[j]>96 && arr1[j]<123){
          if(arr1[j]==122){
            arr1[j] = 97;
          }else{
            arr1[j] = arr1[j]+1;
          }
        }else{
          // do nothing
        }
      }
    }

    for(int i=0; i<len; i++){
      System.out.print((char)arr1[i]);
    }
  }
}

