public class Practice12{
  public static void main(String[] args){
    System.out.println("Input string that you wish to be converted into PigLatin:");
    String str = IO.readString();
    String str2 = str.toLowerCase();
    String hey = "way";
    String ay = "ay";
    char x = str2.charAt(0);
    String consonant = str2.substring(1);

    if(x == 'a' || x == 'e' || x == 'u' || x == 'i' || x == 'o'){
      IO.outputStringAnswer(str2 + hey);
    }
    else{
      IO.outputStringAnswer(consonant + x + ay);
    }
  }
}
