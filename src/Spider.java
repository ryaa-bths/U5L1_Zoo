public class Spider extends Animal{
    public Spider(String name, String species, int age, String habitat, boolean alive) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
    }

    public String makeNoise(){
        return "\\)}]()\\Oo\\/oO/()[{(/";
    }

    public static void main(String[] args){
        Spider joe = new Spider("Joe", "Pelican Spider", 5, "Tree", true);
        System.out.println(joe.makeNoise());
    }
}