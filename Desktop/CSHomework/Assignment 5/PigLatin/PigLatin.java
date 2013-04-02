public class PigLatin{
  public static void main(String[] args){
  System.out.println("Please input English word");
  String E_input = IO.readString();
  String E_lowcase = E_input.toLowerCase();
  String vowel = "way";
  String consonant = "ay";
  String P_cvrt = E_lowcase.substring(1);
  char x = E_lowcase.charAt(0);
  if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
  IO.outputStringAnswer(E_lowcase + vowel);
  }
  else{
  IO.outputStringAnswer(P_cvrt + x + consonant);
  }

  }
}
