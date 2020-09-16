
public class Fibonacci {

  public static void main(String[] args) {
    for(int i=0; i<15; i++) System.out.print(Fibonacci(i) + "\t");
    System.out.println();
    
  }

  public static int Fibonacci(int inNum) {
    // base cases
    //if(inNum == 0) return 0;
    //if(inNum == 1) return 1;
    if(inNum <= 1) return inNum;
    
    // figure out the recursive calls
    // do something with the recursive returns
    return Fibonacci(inNum - 1) + Fibonacci(inNum - 2);
    
  }
}
