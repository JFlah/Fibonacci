import java.io.*;
import java.util.*;


//out: 0 1 1 2 3 5 8 
//n:   0 1 2 3 4 5 6

class Solution {
  public static class Fib {
    public static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
    
    public int compute(int element) {
      if (element == 0) {
        memo.put(0, 0);
        return 0;
      }
      if (element == 1) {
        memo.put(1, 1);
        return 1;
      }

      int result = 0;
      
      if (memo.containsKey(element)) {
        return memo.get(element);
      }        
      result = compute(element-1) + compute(element-2);
      memo.put(element, result);
        
      return result;
    }
  }
  
  public static void main(String[] args) {
    Fib fib = new Fib();
    
    // System.out.println(fib.compute(0) == 0);
    System.out.println(fib.compute(1) == 1);
    // System.out.println(fib.compute(2) == 1);
    // System.out.println(fib.compute(3) == 2);
    System.out.println(fib.compute(4) == 3);
    // System.out.println(fib.compute(5) == 5);
    System.out.println(fib.compute(6) == 8);
    
    System.out.println(fib.compute(256));
  }
}
