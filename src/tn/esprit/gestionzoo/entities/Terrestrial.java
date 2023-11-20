package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    public void eatPlant (Food plant){
        if(plant==Food.PLANT || plant==Food.BOTH){
            System.out.println("The animal is terrestrial");
        }else
            System.out.println("The animal is not terrestrial");
    }
    public void eatMeat(Food meat){
        if(meat == Food.MEAT || meat==Food.BOTH){
            System.out.println("The animal is aquatic");
        }else
            System.out.println("The animal is not aquatic");
    }
    public void eatPlantAndMeet(Food food){
        if (food==Food.BOTH){
            System.out.println("The animal is eating meat and plants");
        }else
            System.out.println("The animal can't be eating just one type of food");
    }
    private int nbrLegs;
    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString()+"nbrLegs :"+nbrLegs;
    }
}
