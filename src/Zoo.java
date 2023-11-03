public class Zoo {
    Animal []animals;
    String name;
    String city;
    int nbrCages;
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    void displayZoo(){
        System.out.println("name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages);
    }
    @Override
    public String toString() {
        return "name : "+name+"\ncity : "+city+"\nnbr Cages: "+nbrCages;
    }
}
