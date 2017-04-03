// https://www.hackerrank.com/challenges/linkedin-practice-nested-logic
import java.util.*;
class NestedLogic{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int date1_day = sc.nextInt();
    int date1_month = sc.nextInt();
    int date1_year = sc.nextInt();
    
    int date2_day = sc.nextInt();
    int date2_month = sc.nextInt();
    int date2_year = sc.nextInt();
    
    int pay=0;
    int diff_day = date1_day-date2_day;
    int diff_month = date1_month-date2_month;
    int diff_year = date1_year-date2_year;
    
    if(diff_year<0){
      pay = 0;
    }
    else if(diff_year>0){
      pay=10000;
    }
    else if(diff_month>0){
      pay = 500*diff_month;
    }
    else if(diff_day>0){
      pay = 15*diff_day;
    }
    System.out.println(pay);
  }
}
