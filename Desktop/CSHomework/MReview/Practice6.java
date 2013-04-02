public class Practice6{
  public static void main(String[] args){
    System.out.println("Please input income:");
    double income = IO.readDouble();
    if(income <= 0){
      IO.reportBadInput();
    }
    if(income <= 8000){
      income = (8000*.10);
      IO.outputDoubleAnswer(income);
      return;
    }
    if(income <=26000){
      income = (800) + (income-8000)*(0.15);
      IO.outputDoubleAnswer(income);
      return;
    }
    if(income <= 48000){
      income = (4700) + (income - 34000)*(0.25);
      IO.outputDoubleAnswer(income);
      return;
    }
    if(income > 48000){
      income = (16700) + (income - 82000)*(0.35);
      IO.outputDoubleAnswer(income);
      return;

    }
  }
}
