//https://www.hackerrank.com/challenges/linkedin-practice-bigger-is-greater
// look from right to left of the given string to get the closest lexographically greater string

import java.util.*;
import java.io.*;

class LexGreaterString{
  public static boolean LexShift(char[] arr) {
    // Find non-increasing suffix
		int i = arr.length-1;
		while (i>0 && arr[i-1]>=arr[i]){
			i--;
    }
    if(i<=0){
      return false;
    }

		// Find successor to pivot
		int j = arr.length - 1;
		while (arr[j]<=arr[i-1]){
			j--;
    }
		int tmp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = (char)tmp;

		// Reverse suffix
		j = arr.length-1;
		while(i<j){
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = (char)tmp;
			i++; j--;
		}
		return true;
	}

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    while(N-- > 0){
      String s = sc.next();
      char[] arr = s.toCharArray();
      // if you are using c++ to solve this problem, there is a predefined function called next_permutation(BidirectionalIterator first, BidirectionalIterator last)
      if(LexShift(arr)){
        System.out.println(String.valueOf(arr));
      }
      else
        System.out.println("no answer");
    }
  }
}

/*
public  static void lexo(String s)
{
   int largestI=-1;
   int largestJ= 0;

//Finding largest I
for(int i=0;i<s.length()-1;i++)
 {
  if(s.charAt(i) < s.charAt(i+1))
   largestI=i;

 }
 if(largestI==-1)
 {
 System.out.println("no answer");
 return;
 }

// finding  Largest J
 for(int j=0;j<s.length();j++)
 {
  if(s.charAt(j) > s.charAt(largestI))
   largestJ=j;
 }

 //Swap the characters at largestI and LargestJ
 char[] characters=s.toCharArray();
 characters[largestI]=s.charAt(largestJ);
 characters[largestJ]=s.charAt(largestI);
 s=String.valueOf(characters);

 //reverse the string from largestI+1 to end
 String s1=s.substring(largestI+1);
 s=s.substring(0,largestI+1);
 StringBuilder sb= new StringBuilder(s1);
 sb=sb.reverse();
 System.out.println(s.concat(sb.toString()));

}
*/