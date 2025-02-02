public class Animal {

    //he added a static int variable for counting animal types, included variable in constructor tp count each new object
    //static int countAnimal = 0;
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

    protected static int lives = 0;        //counters
    protected static int dead = 0;
    protected static int resurrect = 0;
    protected static int kill = 0;


    protected static int countAnimal = 0;
    //protected boolean hungry;



    //do I need to fill all instance variables for a class?
    public Animal(String name, String species, int age, String habitat, boolean alive) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
        this.alive = alive;

        if (isAlive()){ //if is alive == true
            lives++;
        }
        else{
            dead++;
        }
        countAnimal++;
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
        lives++;
        countAnimal++;
    }


//the muffin... It. won't. get. any. CLOSER!!
    public String toString(){
        return "Our animal " + this.name + " is currently alive??: " + alive;
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
        return this.habitat;
    }

    public static int getLives(){ return lives;}   //static variable/instance variable, does not need a this. keyword because it does not apply to individuals

    public int getDead(){ return dead;}

    public int getResurrect(){ return resurrect;}

    public int getKill(){ return kill;}
/*
    public static int getCount() {
        return countAnimal;
    }

    public static void setCount(int count) {
        Animal.countAnimal = count;
    }
  */

    ///getters = "looking up" animal information



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
        System.out.println("The " + this.species + "... It......It's alive!!!");
        dead--;
        lives++;
        resurrect++;
        return this.alive;
    }

    public boolean kill(){
        this.alive = false;
        System.out.println("The " + this.species + "... It......WHAT HAVE YOU DONE??!");
        lives--;
        dead++;
        kill++;
        return this.alive;
    }

    public String makeNoise(){
        String n;
        int i = (int)(Math.random() * 5);
        if (i == 0){n = "qwuack waonkks Qwouank awnke quack";}
        else if (i == 1){ n = "fbrrrrrrRRRrLllll";}
        else if (i == 2){ n = "skkkkkkshhhhwwrl";}
        else if (i == 3){ n = "SKREEEiii";}
        else if (i == 4){ n = "ee";}
        else if (i == 5){ n = "ark! rk! wRkIWantBloodARK! awrk!";}
        else if (i == 6){ n = "wwwww sk ssk hhsshhh";}
        else{ n = "Mooo";}
        return n;
    }
    public String reaction(){
        String s;
        int x = (int)((Math.random())*17);
        if (x == 1){ s = "ଲ(ⓛ ω ⓛ)ଲ";}   //❀.❀  ˶⍤⃝˶  ꧁꧂
        else if (x == 0){ s = "⪩(ᐢᗜᐢ)⪨";}
        else if (x == 2){ s = "(･ - ･)??";}
        else if (x == 3){ s = "(o- ⃝  )" ;}
        else if (x == 4){ s = "ptw! ( >=<)-≈  ◎==||::::::::::::>  Σ(°ロ°)";}
        else if (x == 5){ s = "(◎ _ ◎)";}
        else if (x == 6){ s = "(╭ರ_•́)";}
        else if (x == 7){ s = "(๑•̀ᗝ•́)૭";}
        else if (x == 8){ s = "(◉ _ ◉) ";}
        else if (x == 9){ s = "Σ(°ロ°)";}
        else if (x == 10){ s = "(  -᷅ ⤙ -᷄ )=3";}
        else if (x == 11){ s = "( •̀ ᴖ •́ )";}
        else if (x == 12){ s = "(¬⤙¬ )";}
        //else if (x == ){ s = "";}
        else{ s = "(ꐦ･`▱´･)";}
        return s;
    }

    public String feelingsNow(){
        return "Current expression of " + this.name + ":\t" + reaction();
    }

    public String status(){
        return "Name: " + this.name + "\t| Species: " + this.species + "\t| Age: " + this.age + "\t| " +toString();
    }

    public static String whoDied() { return "~ Total Animals...~\n|\tAlive: " + lives + "\t\t\t\t\tDead: " + dead;}

    public static String messUpTracker(){ return "| \tTotal Resurrections: " + resurrect + "\t\tTotal Killed Under Care: "+ kill;}

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
