public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String NomDepartement;
    private int grade;
    public Employe(){};

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        NomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return NomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        NomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Employe employe)) return false;
        return getId()==employe.getId() && getNom()==employe.getNom();
    }
    public String toString(){
        return "Employe \nid : "+id+" Grade : "+grade+" nom : "+nom+" prenom : "+prenom+" departement : "+NomDepartement;
    }

}
