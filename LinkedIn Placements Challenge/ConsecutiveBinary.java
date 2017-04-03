// https://www.hackerrank.com/challenges/linkedin-practice-binary-numbers
import java.util.*;
class ConsecutiveBinary{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String binary = Integer.toBinaryString(num);
    int binary_len = binary.length();
    int count1 = 0;
    int count2 = 0;

    for(int i=0; i<binary_len; i++){
      if(binary.charAt(i)=='1'){
        count1++;
      if(count1>count2){
        count2=count1;
      }
      }
      else{
      count1 = 0;
      }
    }
    System.out.println(count2);
  }
}