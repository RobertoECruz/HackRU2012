public class OrderCost{
  public static void main (String [] args){

    System.out.println("DVD Program:");
    System.out.println("How many DVD's would you like to purchase?");
    double DVD;
    double superfast;
    double standard;
    double free_standard;

    DVD = IO.readDouble();
    superfast = (DVD*4.99)+(12.99)+(DVD*14.99);
    standard = (DVD*0.99)+(DVD*14.99)+(3.99);
    free_standard = (DVD*14.99);

    if(DVD < 1 ) {
      IO.reportBadInput();
      return;
    }
    else{
      System.out.println("Would you like to purchase Superfast shipping?");
      boolean a = IO.readBoolean();
      // if they do want Superfast shipping, print the following line
      if(a){
        System.out.println("The total cost is $"+ superfast);
        IO.outputDoubleAnswer(superfast);
        //if must end before else begins!
      } else if (DVD > 6) {
        System.out.println("The total cost is $"+ free_standard);
        IO.outputDoubleAnswer(free_standard);
      } else {
        System.out.println("The total cost is $"+ standard);
        IO.outputDoubleAnswer(standard);
      }
    }
  }
}
