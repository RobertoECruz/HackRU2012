public class Finance
{
  public static double computeApy(double annualRate, int compoundingOption)
  {
    double a = 0;
    if(annualRate < 0 || compoundingOption < 1 || compoundingOption > 3){
      return(-1);
    }
    if(compoundingOption == 1){
      a = 365;
    }
    if(compoundingOption == 2){
      a = 12;
    }
    if(compoundingOption == 3){
      a = 1;
    }
    annualRate = annualRate/100;
    double APY = (annualRate/a);
    APY = 1 + APY;
    APY = Math.pow(APY,a);
    APY = APY - 1;
    APY = APY * 100;
    int b = (int)(APY*100);
    APY = ((double)b)/100;
    System.out.println(APY);
    return(APY);
  }

  public static double computeLoanPayment(double principal, double annualRate, double yearsDuration, int paymentOption){
    annualRate = (annualRate/100);
    double a = 0;
    if(paymentOption > 3 || paymentOption < 1 || annualRate <= 0 || paymentOption < 1 || yearsDuration <= 0 || principal <= 0){
      return(-1);
    }else{
      if(paymentOption == 1){
        a = (26*yearsDuration);
        annualRate = (annualRate/26);
      }
      if(paymentOption == 2){
        a = yearsDuration*12;
          annualRate = (annualRate/12);
      }
      if(paymentOption == 3){
        a = (yearsDuration*4);
      }
      double c = (Math.pow((1+annualRate),a));
      double d = ((annualRate*c)/(c-1))*principal;
      int b = (int)(d*100);
      d = ((double)b)/100;
      System.out.println(d);
      return(d);
    }
  }
}

