package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ZooManagement zm= new ZooManagement();
        Scanner sc= new Scanner(System.in);
        System.out.println("donner le nbr de cages");
        int nbcages=sc.nextInt();
        zm.nbrCages=nbcages;
        System.out.println("le nbr de cages est :"+zm.nbrCages);
        Animal lion=new Animal();
        lion.setName("mohsen");
        lion.setAge(2);
        lion.setFamily("slm");
        lion.setMammal(true);
        System.out.println(lion.getAge()+lion.getName()+lion.getFamily());
        Zoo myZoo=new Zoo();
        myZoo.setName("belvedere");
        myZoo.setCity("tunis");
        myZoo.setAnimals(new Animal[nbcages]);
        /*myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());
        Animal animal=new Animal();*/
        myZoo.addAnimal(lion);
        myZoo.AfficherAnimaux();
        System.out.println(myZoo.searchAnimal(lion));
        Aquatic aquatic=new Aquatic("slm","slm",16,true,"salut");
        Terrestrial terrestrial=new Terrestrial("hi","hi",12,false,3);
        Dolphin dolphin=new Dolphin("salut","salut",2,false,"salut",2);
        Penguin penguin=new Penguin("hola","hola",4,true,"hola",1);
        System.out.println(aquatic.toString());
        System.out.println(terrestrial.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
