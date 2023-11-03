public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    void displayAnimal(){
        System.out.println("family : "+family+"\nname : "+name+"\nage: "+age+"\nisMammal"+isMammal);
    }
    @Override
    public String toString() {
        return "family : "+family+"\nname : "+name+"\nage: "+age+"\nisMammal"+isMammal;
    }
}

