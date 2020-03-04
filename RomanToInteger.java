//Cole Constantino | Roman to Integer
import java.util.*;
public class RomanToInteger{
  
  public static int convert(String s){
    int sum = 0, last = 0, j = s.length()-1;
    Hashtable<Character,Integer> table = new Hashtable<>(); 
    
    //make hashtable dictionary
    table.put('I',1);
    table.put('V',5);
    table.put('X',10);
    table.put('L',50);
    table.put('C',100);
    table.put('D',500);
    table.put('M',1000);
    
    //loop
    while(j >= 0){
      
      //if value is greater than temp, add to sum else subtract from sum
      int current = table.get(s.charAt(j));
      if(current >= last){
        sum = sum + current;
      } 
      else{
        sum = sum - current;
      } 
      last = current;
      j--;
    }
    return sum;
  }
  
  public static void main(String[] args){
    String str = "MDMXLIII"; //1543
    System.out.println(convert(str));
   
    
    
  }
}