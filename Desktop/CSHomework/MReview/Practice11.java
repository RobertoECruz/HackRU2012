public class Practice11{
  public static void main(String[] args){
    System.out.println("Please input a number:");
    int input = IO.readInt();
    if(input < 1){
      IO.reportBadInput();
      System.out.println("No such thing as a 0 or negative prime #");
    }
    if(input == 2){
      IO.outputBooleanAnswer(true);
    }
    if(input == 1){
      IO.outputBooleanAnswer(false);
    }
    for(int i = 2; i <= input - 1; i++){
      if(input % i == 0){
        IO.outputBooleanAnswer(false);
      }
      else{
        IO.outputBooleanAnswer(true);
      }
    }
  }
}
