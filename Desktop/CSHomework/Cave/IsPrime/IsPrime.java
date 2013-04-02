public class IsPrime{
  public static void main (String[] args){
    System.out.println("Please enter number to determine whether or not it is prime:");
    int count = 2;
    int input = IO.readInt();
    if(input < 2){
     System.out.println("False.");
     return;
    }
    if(input == 2){
      System.out.println("True.");
    }
    for(int p = 2; p < input; p++){
      if(input % p == 0){
        System.out.println("False");
        return;
      }
      if(input % p != 0){
        count+=1;
      }
      if(input == count){
        System.out.println("True.");
        return;
      }
    }
  }
}
