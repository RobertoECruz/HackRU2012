public class Run{
  public static void main(String args []){
    boolean doloop = true;
    int decision = 0;
    double annualRate = 0;
    int time = 0;
    double principal = 0;

    do{
      System.out.println("Whats on the agenda today?");
      System.out.println("(1) Find APY?");
      System.out.println("(2) Find loan payment?");
      System.out.println("(3) Quit?");
      do{
        decision = IO.readInt();
      }while(decision > 3 || decision < 1);
      if(decision == 1){
        decision = 0;
        System.out.println("Input AR");
        annualRate = IO.readDouble();
        System.out.println("Select:");
        System.out.println("(1) Every day");
        System.out.println("(2) Every month");
        System.out.println("(3) Every year");
        do{
          decision = IO.readInt();
        }while(decision > 3 || decision < 1);
        Finance.computeApy(annualRate,decision);
      }
      if(decision == 2){
        decision = 0;
        System.out.println("Select:");
        System.out.println("(1) Two times a week");
        System.out.println("(2) Every month");
        System.out.println("(3) Every quarter");
        do{
          decision = IO.readInt();
        }while(decision > 3 || decision < 1);
        System.out.println("Annual Rate?");
        annualRate = IO.readDouble();
        System.out.println("Years?");
        do{
          time = IO.readInt();
        }while(time < 1);
        System.out.println("Principal Loan?");
        principal = IO.readDouble();
        Finance.computeLoanPayment(principal, annualRate, time, decision);
      }
      if(decision == 3){
        doloop = false;
      }
    }while(doloop == true);
  }
}
