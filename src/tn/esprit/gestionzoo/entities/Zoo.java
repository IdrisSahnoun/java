package tn.esprit.gestionzoo.entities;

public class Zoo extends Animal {
    private Animal [] animals;
    private String name;
    private String city;
    private static final int nbrCages=25;
    private int nbrAnimals;
    private int nbAquaticAnimals;
    private Animal []aquaticAnimals=new Animal[10];

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name=="")
            System.out.println("ne doit pas etre vide");
        else
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public int getNbAquaticAnimals() {
        return nbAquaticAnimals;
    }

    public void setNbAquaticAnimals(int nbAquaticAnimals) {
        this.nbAquaticAnimals = nbAquaticAnimals;
    }

    public Animal[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Animal[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public Zoo() {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }
    void displayZoo(){
        System.out.println("name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages);
    }
    public boolean addAnimal(Animal animal){
        boolean b= isZooFull();
        if (b==false)
        System.out.println("zoofull");
        else
        if(searchAnimal(animal)!=-1){
            return false;
        }
        if(nbrAnimals==nbrCages){
            return false;
        }
        animals[nbrAnimals]=animal;
        nbrAnimals++;
        return true;
    }
    public int searchAnimal(Animal animal){
        int x=-1;
        for(int i=0;i<nbrAnimals;i++){
            if(animal.getName()==animals[i].getName())
                return i;
        }
        return x;
    }
    public void AfficherAnimaux(){
        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i]);
        }

    }
    public boolean removeAnimal(Animal animal){
        int x=searchAnimal(animal);
        if (x==-1)
            return false;
        else
            for (int i = x; i <nbrAnimals ; i++) {
                animals[i]=animals[i+1];
                animals[nbrAnimals]=null;
                this.nbrAnimals--;
                System.out.println("success");
            }
            return true;
    }
    public boolean isZooFull(){
        if (nbrAnimals==nbrCages)
            return false;
        else
            return true;
    }
    public Zoo comparerZoo(Zoo z1,Zoo z2){
        if (z1.nbrAnimals>z2.nbrAnimals)
        return z1;
        else
            return z2;
    }
    public void addAquaticAnimal(Aquatic aquatic){
     if (nbAquaticAnimals>10)
         System.out.println("tableau complet");
     else
             aquaticAnimals[nbAquaticAnimals]=aquatic;
        System.out.println("the aquatic animals are : "+aquatic.getName());
        nbAquaticAnimals++;
    }
    public float maxPenguinSwimmingDepth(){
        float maxdepth=0f;
        for (int i = 0; i < nbAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxdepth < penguin.getSwimmingDepth())
                    maxdepth=penguin.getSwimmingDepth();
            }
        }
        return maxdepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrDauphins=0;
        int nbrPenguins=0;
        for (int i = 0; i < nbAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin)
                    nbrPenguins++;
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDauphins++;
            }
        }
        System.out.println("nbr des penguins : "+nbrPenguins);
        System.out.println("nbr des dauphins : "+nbrDauphins);
    }
    @Override
    public String toString() {
        return "name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages;
    }
}
