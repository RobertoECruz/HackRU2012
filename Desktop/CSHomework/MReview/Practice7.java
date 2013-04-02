public class Practice7{
  public static void main(String[] args){
    
    System.out.println("How many people are attending?");
    double people = IO.readDouble();
    
    System.out.println("How many slices can each person eat?");
    double slices = IO.readDouble();
    
    System.out.println("How many cans of soda can each person drink?");
    double cans = IO.readDouble();
    
    System.out.println("What is the cost of a pie?");
    double piecost = IO.readDouble();
    
    System.out.println("How many slices are in a pie?");
    double slices_inpie = IO.readDouble();
    
    System.out.println("Cost of each case of soda?");
    double cost_ofsoda = IO.readDouble();
    
    System.out.println("How many cans are in a case of soda?");
    double cans_incase = IO.readDouble();

    double slices_needed = (people*slices);
    double pies_needed = (int)Math.ceil(slices_needed/slices_inpie);

    double cans_needed = (people*cans);
    double cases_needed = (int)Math.ceil(cans_needed/cans_incase);

    double cost_ofpizza = (pies_needed*piecost);
    double totalcost_ofsoda = (cases_needed*cost_ofsoda);

    double total = (cost_ofpizza + totalcost_ofsoda);

    IO.outputDoubleAnswer(total);

  }
}
