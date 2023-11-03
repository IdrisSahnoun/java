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
}
