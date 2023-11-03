import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ZooManagement zm= new ZooManagement();
        Scanner sc= new Scanner(System.in);
        System.out.println("donner le nbr de cages");
        int nbcages=sc.nextInt();
        zm.nbrCages=nbcages;
        System.out.println("le nbr de cages est :"+zm.nbrCages);
    }
}
