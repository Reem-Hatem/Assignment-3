package assignment3_2;

public class Mammal implements Animal {
    private int NoOfLegs;
    private String FavFood="leaves";
    public Mammal(int NoOfLegs,String FavFood){
        this.NoOfLegs=NoOfLegs;
        this.FavFood=FavFood;
    }
    public void eat(){
         System.out.println("This function declares what this mammal eats ");
     }
    public void travel(){
        System.out.println("This function declares where this mammal travel ");
    }
    public int getNoOfLegs(){
        return NoOfLegs;
    }
    public String FavFood(){
        return FavFood;
    }
}
