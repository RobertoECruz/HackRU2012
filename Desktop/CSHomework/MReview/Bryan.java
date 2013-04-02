public class Bryan{
  public static void main(String[] args){
    int count = 0;
    System.out.println("Please enter #:");
    int y = IO.readInt();
    count+=1;
    System.out.println("Please enter #:");
    int x = IO.readInt();
    count+=1;
    while(true){
      if(y == x){
        System.out.println(count);
        return;
      }
      else{
        y = 0;
        System.out.println("Enter #:");
        y += IO.readInt();
        count+=1;
          if(y == x){
          System.out.println(count);
          return;
          }
          else{
          x = 0;
          System.out.println("Enter #");
          x += IO.readInt();
          count+=1;
          continue;
          }
      }
     
    }
      }
  }
