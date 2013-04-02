public class Practice10{
  public static void main(String[] args){
    System.out.println("Please enter the Nth prime number.");
    int nth_prime = IO.readInt();
    int count = 0;
    int count2 = 1;
    int i;
      while(nth_prime < 1){
        IO.reportBadInput();
        nth_prime = IO.readInt();
      }
    while(count < nth_prime){
      count2+=1;
        for(int i = 2; i <= count2; i++){
          if(count2 % i == 0){
            break;
          }
        }
      if(i == count2){
        count+=1;
      }
    }
    IO.outputIntAnswer(count2);
  }
}

