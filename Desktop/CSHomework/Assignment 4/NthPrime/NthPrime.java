public class NthPrime{
  public static void main (String [] args){
    System.out.println("Please enter the Nth prime number.");
    int a = IO.readInt();
    int ct = 0;
    int b;
    int nth_prime = 1;
    while(a < 1){
      IO.reportBadInput();
      a = IO.readInt();
    }
    while(ct < a){
      nth_prime = nth_prime + 1;
      for(b = 2; b <= nth_prime; b++){
        if(nth_prime % b == 0){
          break;
        }
      }
      if(b == nth_prime){
        ct++;
      }
    }
    IO.outputIntAnswer(nth_prime);
  }
}
