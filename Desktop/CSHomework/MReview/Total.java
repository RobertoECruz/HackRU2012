public class Total{
  public static void main (String [] args){
    System.out.println("How much does the customer owe?");
    double charge = IO.readDouble();
    System.out.println("What did the customer give?");
    double customer = IO.readDouble();
    double change = 0;
    double difference = charge - customer;
    if(customer%charge == 0){
    IO.outputDoubleAnswer(change);
    }
    else{
      double change = customer%charge;
    }
    //check to see if custome charge % 0
    //if 0, print 0
    // else check to see if remainder is < 
    for 
  }
}
