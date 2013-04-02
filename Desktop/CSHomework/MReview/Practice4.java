public class Practice4{
  public static void main(String [] args){
    //x^3 + cx^2 + ax2 + cax + abx + abc
    System.out.println("Please enter root one:");
    int x = IO.readInt(); 
    System.out.println("Please enter root two:");
    int y = IO.readInt();
    System.out.println("Please enter root three:");
    int z = IO.readInt();
    int a = x*z;
    int b = x*y;
    int c = x*y*z;
    System.out.println("x^3 "+ "+"+ z +"x^2 "+ "+"+ a + "x "+ "+"+ b + "x " + "+" + c);
  }
}
