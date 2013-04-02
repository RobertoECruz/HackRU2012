public class Practice1{
  public static void main(String[] args){
    
    System.out.println("How long has the book been overdue?");
    double input = IO.readDouble();
    if(input <= 0){
      IO.reportBadInput();
    }
    
    System.out.println("Is the book lost?");
    boolean lost = IO.readBoolean();
    double mult1 = (.70);
    double mult2 = (18.70);
    double output = 0;
    double inputlost = 10;
    
 
    if(input < 8){
      if(lost == true){
        output = (.10*input);
        output = (output + 10);
        System.out.println(output);
        return;
      }
      else{
        output = (.10*input);
        System.out.println(output);
        return;
      }
    }
    if(input <= 90){
    output = (.70) + (.20*(input-7));
    }
    if(input > 90){
    output = mult2 + (.25*(input-90));
    }
    if(lost == true){
      output = output + inputlost;
      System.out.println("Cost of book + $"+ output);
    }
    else{
      System.out.println(output);
    }
  }
}
