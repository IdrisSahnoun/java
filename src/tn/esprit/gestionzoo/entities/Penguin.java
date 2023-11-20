package tn.esprit.gestionzoo.entities;
public class Penguin extends Aquatic implements Carnivor<Food>{
    public void eatMeat(Food meat){
        if(meat == Food.MEAT || meat==Food.BOTH){
            System.out.println("The animal is aquatic");
        }else
            System.out.println("The animal is not aquatic");
    }
    private float swimmingDepth;
    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public void swim(){
        System.out.println("this penguin is swimming");
    }
    @Override
    public String toString() {
        return super.toString()+"swimming depth :"+swimmingDepth;
    }
}
