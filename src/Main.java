import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        DepartementHashSet departementHashSet = new DepartementHashSet();
        Departement dep1 = new Departement(1, "slm", 50);
        Departement dep2 = new Departement(2, "slm1", 100);
        Departement dep3 = new Departement(3, "slm2", 75);
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);
        System.out.println("List of departements:");
        departementHashSet.displayDepartement();
        String r = "slm2";
        if (departementHashSet.rechercherDepartement(r)) {
            System.out.println(" Department " + r + " Found ");
        } else {
            System.out.println("Department " + r + " Not found");
        }

        departementHashSet.supprimerDepartement(dep2);

        System.out.println("\nList of departments after the delete :");
        departementHashSet.displayDepartement();

        System.out.println("\nList of departments triees :");
        TreeSet<Departement> departementsTries = departementHashSet.trierDepartementById();
        for (Departement departement : departementsTries) {
            System.out.println(departement);
        }
    }
}
