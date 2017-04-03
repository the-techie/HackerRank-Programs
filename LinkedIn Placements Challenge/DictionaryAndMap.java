// https://www.hackerrank.com/challenges/linkedin-practice-dictionaries-and-maps

import java.util.*;
import java.io.*;
class DictionaryAndMap{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    Map<String, Integer> map = new HashMap<String, Integer>();
    String name;
    int phone;
    for(int i=0; i<len; i++){
      name = sc.next();
      phone = sc.nextInt();
      map.put(name, phone);
    }
    String nam;
    while(sc.hasNext()){
      nam = sc.next();
      if(map.containsKey(nam)){
        System.out.println(nam+"="+map.get(nam));
      }
      else{
        System.out.println("Not found");
      }
    }
  }
}


