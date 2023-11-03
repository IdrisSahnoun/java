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
        Zoo myZoo=new Zoo();
        lion.name="mohsen";
        lion.age=2;
        lion.family="slm";
        lion.isMammal=true;
        System.out.println(lion.age+lion.name+lion.family+lion.isMammal);
        myZoo.name="belvedere";
        myZoo.city="tunis";
        myZoo.nbrCages=25;
        myZoo.animals=new Animal[25];

    }
}
