public class WordCount{
  public static void main(String[] args){
    System.out.println("Please input string:");
    String sentence = IO.readString();
    System.out.println("Please input min word length for each word in sentence:");
    int limit = IO.readInt();
    int wordlength = 0;
    int wordcount = 0;
    //like an infinite series!
    //if equal to space, if not, ignore it
    for(int i = 0; i < sentence.length(); i++){

      if(Character.isLetter(sentence.charAt(i))){
        wordlength++;
      }
      else{
        if(sentence.charAt(i) == ' ' || i+1 == sentence.length()){
          if(wordlength >= limit){
            wordcount++;
          }
        }
      }
    }
    if(Character.isLetter(sentence.charAt(sentence.length()-1))){
      wordcount+=1;
    }
    IO.outputIntAnswer(wordcount);
  }
}
//see if each character is a letter
//see if a space is seen 
// once space is met, wordcount is reset
// does this until condition is met
