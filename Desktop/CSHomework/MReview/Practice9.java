public class Practice9{
  public static void main(String[] args){
    System.out.println("Please enter sentinel");
    double sentinel = IO.readDouble();

    double min = Double.MAX_VALUE;
    double min2 = Double.MAX_VALUE;
    double x = Double.MAX_VALUE;

      while(x != sentinel){
        System.out.println("Please enter #'s:");
        x = IO.readDouble();
        if(x == sentinel){
          System.out.println("So soon?");
          break;
        }
        if(x < min){
          min2 = min;
          min = x;
        }
        else if(x < min2){
            min2 = x;
        }
      }
        if(min == Double.MAX_VALUE){
          return;
        }
        if(min2 == Double.MAX_VALUE){
          IO.outputDoubleAnswer(min);
          return;
        }
        IO.outputDoubleAnswer(min);
        IO.outputDoubleAnswer(min2);
  }
}
