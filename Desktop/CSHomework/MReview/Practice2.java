public class Practice2{
  public static void main(String[] args){
    //if two consecutive numbers are =, end.output entries
    //use flowchart, but how to turn it into a loop?
int count = 0;
while(true){
  System.out.println("Enter a num nigguh:");
  int num = IO.readInt();
  int lastnum = IO.readInt();
  count+=1;
  System.out.println("Enter AnothA:");
  int num = IO.readInt();
  if(num == lastnum){
    count+=1;
        System.out.println(count);
       return;
  }
  else{
    count+=1;
    continue;
  }
  
}
    }
  }
