public class Spider extends Animal{
    public Spider(String name, String species, int age, String habitat, boolean alive) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
    }
/*
    public Spider(String name, String species, int age, String habitat, boolean alive, boolean hungry) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
        this.hungry = hungry;
    }*/
    public String makeNoise(){
        return "\\)}]()\\Oo\\/oO/()[{(/";
    }

    public String funFact(){
        String fact = "Pelican spiders, peacock spiders; we have both the hybrid and the spider!";
        return fact;
    }


    public static void main(String[] args){
        Spider joe = new Spider("Joe", "Pelican Spider", 5, "Tree", true);
        System.out.println(joe.makeNoise());
    }
}