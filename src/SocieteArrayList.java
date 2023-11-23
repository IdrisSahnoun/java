import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{
    List <Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        if (employes.contains(employe))
        return true;
        else
            return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
        Comparator<Employe> comparator_Id=new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getId() - o2.getId());
            }
        };
        Collections.sort(employes, comparator_Id);
    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparator_Nom=new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getNomDepartement().compareTo(o2.getNomDepartement()));
            }
        };
        Comparator<Employe> comparator_Grade=new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return (o1.getGrade() - o2.getGrade());
            }
        };
        Collections.sort(employes,comparator_Nom.thenComparing(comparator_Grade));
    }
}
