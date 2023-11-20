package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;
enum Food{MEAT,PLANT,BOTH}
public class Main {
    public static void main(String[] args){
        ZooManagement zm= new ZooManagement();
        Scanner sc= new Scanner(System.in);
        System.out.println("donner le nbr de cages");
        int nbcages=sc.nextInt();
        zm.nbrCages=nbcages;
        System.out.println("le nbr de cages est :"+zm.nbrCages);
        Animal lion=new Animal();
        lion.setName("Lion");
        lion.setAge(2);
        lion.setFamily("slm");
        lion.setMammal(true);
        Animal tiger=new Animal();
        tiger.setName("Tiger");
        tiger.setAge(4);
        tiger.setFamily("slmmmm");
        tiger.setMammal(true);
        //System.out.println(lion.getAge()+lion.getName()+lion.getFamily());
        Zoo myZoo=new Zoo();
        myZoo.setName("belvedere");
        myZoo.setCity("tunis");
        myZoo.setAnimals(new Animal[nbcages]);
        System.out.println("donner le nbr des animaux aquatiques :\n");
        int nbaquatics= sc.nextInt();
        myZoo.setNbAquaticAnimals(nbaquatics);
        System.out.println("le nbr des animaux aquatiques est :"+nbaquatics);
        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        //System.out.println(lion);
        //System.out.println(lion.toString());
        try {
            myZoo.addAnimal(lion);
        } catch (Exception z){
            System.out.println("Error "+z.getMessage());
        }
        try {
            myZoo.addAnimal(tiger);
        }catch (Exception z){
            System.out.println("Error "+z.getMessage());
        }
        finally {
            System.out.println("passed");
        }

        //myZoo.removeAnimal(lion);
       /*    myZoo.AfficherAnimaux();
     System.out.println(myZoo.searchAnimal(lion));
        System.out.println(aquatic.toString());
        System.out.println(terrestrial.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());*/
        Dolphin dolphin=new Dolphin("d","salut",2,false,"salut",2);
        Penguin penguin=new Penguin("p","hola1",4,true,"hola",41.2f);
        Penguin penguin1=new Penguin("pp","hola2",4,true,"hola",51.3f);
        Penguin penguin2=new Penguin("pp","hola3",4,true,"hola",54.3f);
        Penguin penguin3=new Penguin("pp","hola4",4,true,"hola",33.3f);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);
        penguin.swim();
        dolphin.swim();
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        Aquatic aquatic= new Aquatic("a1", "a2", 3, false, "salut") {
            @Override
            public void swim() {
            }
        };
        Penguin penguin4=new Penguin("d3","dd",5,true,"hh",5.4f);
        Terrestrial terrestrial=new Terrestrial("hi","hi",12,false,3);
        aquatic.eatMeat(tn.esprit.gestionzoo.entities.Food.MEAT);
        penguin4.eatMeat(tn.esprit.gestionzoo.entities.Food.MEAT);
        terrestrial.eatMeat(tn.esprit.gestionzoo.entities.Food.MEAT);
        terrestrial.eatPlant(tn.esprit.gestionzoo.entities.Food.MEAT);
        terrestrial.eatPlantAndMeet(tn.esprit.gestionzoo.entities.Food.MEAT);
    }
}
