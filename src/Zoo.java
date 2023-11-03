public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimals;
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    void displayZoo(){
        System.out.println("name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages);
    }
    boolean addAnimal(Animal animal){
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
    int searchAnimal(Animal animal){
        int x=-1;
        for(int i=0;i<nbrAnimals;i++){
            if(animal.name==animals[i].name)
                return i;
        }
        return x;
    }
    void AfficherAnimaux(){
        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i]);
        }

    }
    @Override
    public String toString() {
        return "name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages;
    }
}
