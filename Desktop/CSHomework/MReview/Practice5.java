public class Practice5{
  public static void main(String [] args){
    
    System.out.println("How many DVD's would you like to purchase?");
    double DVDs = IO.readDouble();
    if(DVDs <= 0){
      IO.reportBadInput();
    }
    System.out.println("Would you like to purchase SuperFast shipping?");
    boolean t = IO.readBoolean();
    double total = 0;
    double superfast = (12.99) + (14.99*DVDs);
    double lesstandard = (14.99*DVDs) + (0.99*DVDs) + (3.99);
    double greatstandard = (14.99*DVDs);

    if(t == true){

      if(DVDs >= 7){
      total+=superfast;
      IO.outputDoubleAnswer(total);
      }

    }
    else{

      if(DVDs < 7){
      total+=lesstandard;
      IO.outputDoubleAnswer(total);
      }

      if(DVDs >= 7){
      total+=greatstandard;
      IO.outputDoubleAnswer(total);
      }
  
    }
  }
}
