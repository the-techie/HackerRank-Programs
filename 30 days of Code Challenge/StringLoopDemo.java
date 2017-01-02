import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringLoopDemo {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0; i<T; i++){
    String input = (String)sc.next();
    char[] letter = input.toCharArray();
    String oddString = "";
    String evenString = "";
      for(int j=0; j<input.length(); j++){
        if(j%2==0){
          evenString += letter[j];
        }
        else{
          oddString += letter[j];
        }
      }
      System.out.println(evenString+" "+oddString);
    }
  }
}
