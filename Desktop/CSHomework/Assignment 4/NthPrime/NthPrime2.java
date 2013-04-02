public class IsPrime{
  public static void main (Static[] args){
    System.out.println("Please enter number to determine whether or not it is prime:);
    int count = 2;
    int p = 2;
    int input = IO.readInt();
    if(p < 2){
      IO.outputBooleanAnswer(False);
      return;
    }
    for(p; p < input; p++){
      if(input % p == 0){
       IO.outputBooleanAnswer(False);
       return;
      }
      if(input % p != 0){
        count+=1
      }
      if(input == count){
        IO.outputBooleanAnswer(True);
      }
  }
}
