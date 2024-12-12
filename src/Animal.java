public class Animal {

    //he added a static int variable for counting animal types, included variable in constructor tp count each new object
    static int countAnimal = 0;
    /* can make a static counter that exists outside any instanceof a class.
     purpose, sometimes want to know how many aanimals have,
     and using a stati cmethod can help determine that.
     Static variable like lbueprint info.
      Ifo class . Class doesn't refer to any indiv
     sctatuc blueprint for any instance, indiv all types and versions
    */

    //what information does each animal need?
    protected String name;
    protected String species;
    protected int age;
    protected String habitat;
    protected boolean alive;
    //protected boolean hungry;



    //do I need to fill all instance variables for a class?
    public Animal(String name, String species, int age, String habitat, boolean alive) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
        //countAnimal++;
    }

/*
    public Animal(String name, String species, int age, String habitat, boolean alive, boolean hungry) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;
        this.hungry = hungry;
    }

 */
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


//the muffin... It. won't. get. any. CLOSER!!
    public String toString(){
        return "Our animal " + this.name + " is currently alive?: " + alive;
    }


    //parameter and default constructors
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

    public String getHabitat() {
        return habitat;
    }

    //getters = "looking up" animal information



    //isHungry vs. getHungry

/*
    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void feed(){
        this.hungry = true;
    }
*/
    public boolean isAlive(){
        return alive;
    }

    public boolean resurrection(){
        this.alive = true;
        System.out.println("It...It's alive!!!");
        return this.alive;
    }

    public boolean kill(){
        this.alive = false;
        System.out.println("It...WHAT HAVE YOU DONE??!");
        return this.alive;
    }

    public String makeNoise(){
        String n;
        int i = (int)(Math.random() * 5);
        if (i == 0){n = "qwuack waonkks Qwouank awnke quack";}
        else if (i == 1){ n = "fbrrrrrrRRRrLllll";}
        else{ n = "Mooo";}
        return n;
    }
    public String reaction(){
        String s;
        int x = (int)((Math.random())*10);
        if (x == 1){ s = "ଲ(ⓛ ω ⓛ)ଲ";}   //❀.❀  ˶⍤⃝˶  ꧁꧂
        else if (x == 0){ s = "⪩(ᐢᗜᐢ)⪨";}
        else if (x == 2){ s = "(･ - ･)??";}
        else if (x == 3){ s = "(o - ⃝  )" ;}
        else if (x == 4){ s = "ptw! ( >=<)-≈  ◎==||::::::::::::>   (ง ◉ _ ◉)ง ";}
        else if (x == 5){ s = "(◎ _ ◎)";}
        else if (x == 6){ s = "(╭ರ_•́)";}
        else if (x == 7){ s = "(๑•̀ᗝ•́)૭ ";}
        //else if (x == ){ s = "";}
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
        foot.resurrection();

        frank.kill();


    }
}
