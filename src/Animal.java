public class Animal {



    //what information does each animal need?
    protected String name;
    protected String species;
    protected int age;
    protected String habitat;
    protected boolean alive;
    protected boolean hungry;



    //do I need to fill all instance variables for a class?
    public Animal(String name, String species, int age, String habitat, boolean alive) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
    }


    public Animal(String name, String species, int age, String habitat, boolean alive, boolean hungry) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
        this.hungry = hungry;
    }
    // one static var that serves all instances
    //is a Q or A about a whole class or obj, not any specific ones
    //global variable, for that classhaave diff banana obj, will update number of obj even if delete clas??




    public Animal() {
        this.name = "Pauly";
        this.species = "Turtle";
        this.age = 5000;
        this.habitat = "Mars";
        this.alive = true;

    }



    public String toString(){
        return "Our animal " + this.name + " is currently alive?: " + alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age){return this.age;}
    //parameter and default constructors



    //getters = "looking up" animal information



    //isHungry vs. getHungry


    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void feed(){
        this.hungry = true;
    }

    public boolean isAlive(){
        return alive;
    }



    public String makeNoise(){
        return "Mooo";
    }
    public String reaction(){
        String s;
        int x = (int)((Math.random())*3);
        if (x == 1){ s = "ଲ(ⓛ ω ⓛ)ଲ";}   //❀.❀  ˶⍤⃝˶  ꧁꧂
        else if (x == 0){ s = "⪩(ᐢᗜᐢ)⪨";}
        else{ s = "(ꐦ･`▱´･)";}
        return s;
    }

    public String feelingsNow(){
        return "Current expression of " + this.name + ":\t" + reaction();
    }



    //publicly accessible methods?
    public static void main(String[] args) {
        Animal frank = new Animal("Frank", "Duck-Giraffe Hybrid", 68, "Water", false);
        System.out.println(frank);
        Animal deflt = new Animal();
        System.out.println(deflt);
        System.out.println(frank.makeNoise());
        System.out.println(deflt.makeNoise());




        Animal foot = new Animal("Foot", "Penguin-Rhinoceros", 5, " Rainforest", false);
        System.out.println(foot);
        System.out.println(foot.makeNoise());




    }
}
