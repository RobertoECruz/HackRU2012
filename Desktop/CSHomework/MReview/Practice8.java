public class Practice8{
  public static void main(String[] args){
    System.out.println("Please enter # of judges:");
    //int judges must be set before loop so that it exists outside of the loop
    //judges must be greater than 3 because lowest and highest are dropped.
    int judges = 0;
    while(judges < 3){
      judges = IO.readInt();
      if(judges < 3){
        IO.reportBadInput();
        continue;
      }
    }
    //continue is used to go back to the beginning of the while loop so that
    //the user can input a correct input.

    double total = 0;
    double count = 0;
    double x = 0;
    double y = 0;
    double z = 0;
    double lowest = 10;
    double highest = 0;

    //all variables set as doubles, except judges, to make it easier.
    // do while loop used to 
    do{
      System.out.println("Judge " + (count + 1));
      double score = IO.readDouble();
      if(score <= 10 && score >= 0){
        if(score < lowest){
          lowest = score;
        }
        if(score > highest){
          highest = score;
        }
        count+=1;
        total+=score;
      }
      else{
        System.out.println("Nope, score is either too high or too low. Try again.");
        IO.reportBadInput();
        continue;
      }
      if(count == judges){
        break;
      }
    }while(count <= judges - 1);
    x = total - highest;
    y = judges - 2;
    z = x - lowest;
    IO.outputDoubleAnswer(z/y);

  }
}
