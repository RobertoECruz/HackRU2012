public class TwoSmallest{
  public static void main (String [] args){
    System.out.println("Please enter a value that will terminate the program:");
    double sentinel = IO.readDouble();
    double x = Double.POSITIVE_INFINITY;
    // x does not need a value because it is being read, just initialize it
    double min = Double.POSITIVE_INFINITY;
    double min2 = Double.POSITIVE_INFINITY;
    // check to see if terminal value has been entered
    // if it has, end for x, if it has for y, check x and compare to min/min2
    // output min1 min2 after that
    // if sentinel not entered, keep checking for min/min2
    // once sentinel is entered, output min1/min2
    while(x != sentinel){
      System.out.println("Please enter number:");
      x = IO.readDouble();
      if(x == sentinel){
        System.out.println("Ending it already?");
        break;
      }
      //start of program if true
      if(x < min){
        min2 = min;
        min = x;
      }
      // start of program if true
      else if(x < min2){
        min2 = x;
      }      
      //start of program if true
    }
    if(min == Double.MAX_VALUE){
      return;
    }
    if(min2 == Double.MAX_VALUE){
      IO.outputDoubleAnswer(min);
      return;
    }
    IO.outputDoubleAnswer(min);
    IO.outputDoubleAnswer(min2);
  }
}
