
public class convertBinary {
   
  public static void main(String[] args) {
    System.out.println(binaryStringToInt("1010"));
    System.out.println(binaryStringToInt("1111"));
    System.out.println(binaryStringToInt("0"));
    System.out.println(binaryStringToInt(""));
    System.out.println(binaryStringToInt("00000"));
    System.out.println(binaryStringToInt("000001010"));
    System.out.println(binaryStringToInt("3"));
    System.out.println(binaryStringToInt("300000101010101"));
    System.out.println(binaryStringToInt("B"));
    System.out.println(binaryStringToInt("*"));
    
    for(int i=0; i<=10; i++) {
      System.out.println("i:" + i + "\t" + intToBinaryString(i) + "\t" + binaryStringToInt(intToBinaryString(i)));
    }
  }
  
  // Given an binary number as a string returns 
  //  the value in base 10 as an integer using recursion. 
  // If the string contains a character that is invalid the method returns 
  //  -9999
  public static int binaryStringToInt(String numString) {
    if(numString.length() == 0) return 0;
    
    int rtn = binaryStringToInt(numString.substring(0, numString.length()-1));
    if(rtn < 0) {
      return rtn;
    }
    rtn *= 2;
    if(numString.charAt(numString.length()-1) == '1') {
      rtn++;
    }else if(numString.charAt(numString.length()-1) != '0'){
      return -9999;
    }
    return rtn;
  }

  public static String intToBinaryString(int numInt) {
    if(numInt == 1) return "1";
    if(numInt == 0) return "0";
    
    String rtn = intToBinaryString(numInt/2);
    if(numInt%2 == 1) {
      return rtn + "1";
    }else {
      return rtn + "0";
    }
  }

}
