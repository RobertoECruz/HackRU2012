public class Taxes{
  public static void main (String [] args){

    System.out.println("Please input income.");
    double income;
    double a;
    double first_tax;
    double b;
    double second_tax;
    double c;
    double third_tax;
    double fourth_tax;

    income = IO.readDouble();
    first_tax = (.10*income);
    a = (income - 8000);
    second_tax = (a*.15)+(800);
    b = (income - 34000);
    third_tax = (b*.25)+(4700);
    c = (income - 82000);
    fourth_tax = (c*.35)+(16700);

    if (income < 1){
      IO.reportBadInput();
      return;
    }
    else if (income <= 8000) {
      System.out.println("Tax is $"+ first_tax);
      IO.outputDoubleAnswer(first_tax);
    }
    else if (income <= 34000) {
      System.out.println("Tax is $"+ second_tax);
      IO.outputDoubleAnswer(second_tax);
    }
    else if (income <= 82000) {
      System.out.println("Tax is $"+ third_tax);
      IO.outputDoubleAnswer(third_tax);
    }
    else if (income > 82000) {
      System.out.println("Tax is $"+ fourth_tax);
      IO.outputDoubleAnswer(fourth_tax);
    }
  }
}
