public class Departement {
    private int id;
    private String nom_departement;
    private int nbr_employes;
    public Departement(){}

    public Departement(int id, String nom_departement, int nbr_employes) {
        this.id = id;
        this.nom_departement = nom_departement;
        this.nbr_employes = nbr_employes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNbr_employes() {
        return nbr_employes;
    }

    public void setNbr_employes(int nbr_employes) {
        this.nbr_employes = nbr_employes;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Departement departement)) return false;
        return getId()==departement.getId() && getNom_departement()==departement.getNom_departement();
    }
    public String toString(){
        return "Departement \nid : "+id+" Nom Departement : "+nom_departement+" nbr employes : "+nbr_employes;
    }
}
