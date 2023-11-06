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
    }
}
