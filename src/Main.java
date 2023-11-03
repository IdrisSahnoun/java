import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ZooManagement zm= new ZooManagement();
        Scanner sc= new Scanner(System.in);
        System.out.println("donner le nbr de cages");
        int nbcages=sc.nextInt();
        zm.nbrCages=nbcages;
        System.out.println("le nbr de cages est :"+zm.nbrCages);
        Animal lion=new Animal("slm","mohsen",2,true);
        Animal cat=new Animal("slm","ohsen",2,true);
        lion.name="mohsen";
        lion.age=2;
        lion.family="slm";
        lion.isMammal=true;
        System.out.println(lion.age+lion.name+lion.family+lion.isMammal);
        Zoo myZoo=new Zoo("belvedere","tunis",25);
        myZoo.name="belvedere";
        myZoo.city="tunis";
        myZoo.animals=new Animal[nbcages];
        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        //System.out.println(lion);
        //System.out.println(lion.toString());
       // Animal animal=new Animal();
        myZoo.addAnimal(lion);
        myZoo.addAnimal(cat);
        myZoo.AfficherAnimaux();
        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(cat));
        System.out.println(myZoo.removeAnimal(cat));
    }
}
