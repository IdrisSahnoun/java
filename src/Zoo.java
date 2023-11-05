public class Zoo {
    Animal [] animals;
    String name;
    String city;
    static final int nbrCages=25;
    int nbrAnimals;
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
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
    boolean removeAnimal(Animal animal){
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
    boolean isZooFull(){
        if (nbrAnimals==nbrCages)
            return false;
        else
            return true;
    }
    Zoo comparerZoo(Zoo z1,Zoo z2){
        if (z1.nbrAnimals>z2.nbrAnimals)
        return z1;
        else
            return z2;
    }
    @Override
    public String toString() {
        return "name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages;
    }
}
