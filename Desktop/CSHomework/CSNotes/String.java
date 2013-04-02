public class String{
  public static void main(String[] args){
    System.out.println("Please input a string!");
    String x = IO.readString();
    int i;
    for(i = 0; i < x.length() ; i++){
      System.out.println(x.charAt(i));

    }
  }
}
