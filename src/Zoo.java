import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {
    //store animals & employees
    //arrays fix size, always &reserve space
    //linkedlist reserve node space, then point to next node
    //managements, schedulinhg,
    //program used to sho wpolymorphism
    //benefit employee manage task, care of animal
    //what aspect of zoo do want it serve
    //spend week explore trying & meshing
    //zoo show mess w/ both animals and employees
    //store animal & employee, keep track of them. (need methos or animal from zoo subclass idk context)


    //put this in class, not in main
    static LinkedList<Employee> emp = new LinkedList<Employee>();   //employed
    static LinkedList<Animal> animals = new LinkedList<Animal>();

    static int day = 0;

    public static void hire(Employee employee){
        emp.add(employee);
    }

    public static void intakeAnimal(Animal animal){
        animals.add(animal);
    }

    public static void firing(Employee employee){
        emp.remove(employee);
    }

    public static void releaseAnimal(Animal animal){
        animals.remove(animal);
    }

    public static int getDay(){
        return day;
    }

    public static LinkedList<Employee> getEmployed() {
        return emp;
    }

    /*
    public static void employedNames(){
        String e = "|";
        for (Employee name:emp){
            e = e + name.getName() +"|";
        }
        System.out.println(e);
    }
*/

    public static void event(){
        String event;
        int e = (int)(Math.random() * emp.size());
        int a = (int)(Math.random() * animals.size()); //animalRandomNumberedIndex
        int num = (int)(Math.random() * 10);
        String empName = emp.get(e).getName();
        String job = emp.get(e).getRole();
        String aniName = animals.get(a).getName();
        String aniSpecies = animals.get(a).getSpecies();

        //random events
        if (num == 0){
            event = "\t[ OH nO! "+ aniName + " the " + aniSpecies +" wwent on a rage! " + empName + " did not feed them!]";
        }
        else if (num == 1){
            event = "\t[ OH nO! "+ empName + " did not give " + aniName +  " a luxurious bath & spa, so the \n\t" + aniSpecies + " has plotted their inevitable demise!]";
        }
        else if (num == 2){
            event = "\t[ " + job + " " + empName + " has reported their suspicions and evidence that " + aniName + " \n\tthe " + aniSpecies + " is running an illegal offshore oil drilling company.]";
        }
        else if (num == 3){ event = "\t[ A " + job + " has turned in a report stating that they accidentally got a " + aniSpecies + " addicted to sugar.]";}
        else if (num == 4){ event = "\t[ " + job + " " + empName +" says that the " + aniSpecies + " "+ aniName + " attacked and disconnected their ankles. \n\tThey are now gnawing on it inside their " + animals.get(a).getHabitat() + " habitat. \n\tThe employee says they would like a refund on that.]";}
        else if (num == 5){ event = "\t[ " + empName + " had been observing " + aniName +",  and has created a doodle on their report with the following dialogue for them: \n\t \" The muffin... It never comes any closer, why, why, why... it...looks SO delicious! AAA\n\t\t*pounces*\n\tCurses! It has escaped yet again! I, " + aniName + ", The Great " + aniSpecies +", refuse to be defeated by this puny prey!\"]";}
        else if (num == 6){ event = "\t[ "  + job + " " + empName + " has reported that their escape from " + aniSpecies + " fluff ]";}
        else if (num == 7){ event = "\t[ " + aniName + " the " + aniSpecies + " has spontaneously combusted! ]";}
        else if (num == 8){ event = "\t[ " + aniName + " has decided that they will become the Great Christmas " + aniSpecies + ",\n\t and promptly ambushed " + empName + " and gave them their ankles as a gift.]";}
        //else if (num == ){ event = "\t[ " + "]";}
        else{
            event = "\t[ The end is nigh... -" + aniName + ", " + aniSpecies + "]";
        }
        System.out.println(event);
        // detour explore other ways to program event; what would be efficient? To be discovered.
        /*
        String[] events = {
                "\t[ OH nO! "+ aniName + " the " + aniSpecies +" wwent on a rage! " + empName + " did not feed them!]",
                "\t[ OH nO! "+ empName + " did not give " + aniName +  " a luxurious bath & spa, so the \n\t" + aniSpecies
                        + " has plotted their inevitable demise!]",
                "\t[ " + job + " " + empName + " has reported their suspicions and evidence that " + aniName + " \n\tthe "
                        + aniSpecies + " is running an illegal offshore oil drilling company.]",
                "\t[ A " + job + " has turned in a report stating that they accidentally got a " + aniSpecies + " addicted to sugar.]",
                "\t[ " + job + " " + empName +" says that the " + aniSpecies + " "+ aniName + " attacked and disconnected their ankles. \n\tThey are now gnawing on it inside their "
                        + animals.get(a).getHabitat() + " habitat. \n\tThe employee says they would like a refund on that.]",
                "\t[ " + empName + " had been observing " + aniName +",  and has created a doodle on their report with the following dialogue for them: "
                        + "\n\t \" The muffin... It never comes any closer, why, why, why... it...looks SO delicious! AAA\n\t\t*pounces*\n\tCurses! It has escaped yet again! I, "
                        + aniName + ", The Great " + aniSpecies +", refuse to be defeated by this puny prey!\"]",
                "\t[ "  + job + " " + empName + " has reported that their escape from " + aniSpecies + " fluff ]",
                "\t[ " + aniName + " the " + aniSpecies + " has spontaneously combusted! ]",
                "\t[ " + aniName + " has decided that they will become the Great Christmas " + aniSpecies + ",\n\t and promptly ambushed "
                        + empName + " and gave them their ankles as a gift.]",
                "\t[ The end is nigh... -" + aniName + ", " + aniSpecies + "]"
        };
        System.out.println("\t[ " + events[num] + "]");
        */
    }

    public static void toKillOrNot(Animal animal){
        int r = (int)(Math.random()*3);
        if (!(animal.isAlive()) && r ==0){  //animal is currently dead/false, random number will resurrect it
            animal.resurrection();
        }
        else if (animal.isAlive() && r == 0){  //animal is currently alive, random number decides to kill it
            animal.kill();
        }
    }

    public static void schedule(){
        /* set lines here, is constructor. Might need to make new class*/
        /*public String schedule(<Employee> employed, animals){
            String line = "6:00am  |" + emp.get(0).getName() + " \t|" + animals.get(0).getName();
            System.out.println(line1);
        }*/
        //[emp] is taking care of: 2 or 4 animals today (depending on list:  1:1 of 1, 1:2 of
        int p = animals.size() / emp.size(); //num animals counter //needs separate counter to get animal index. Then, when runs out animals, leave emp assigned blank
        int i = 0; //counter for animal index
        System.out.println("~~~~~~~");
        System.out.println(" Assigned animals to Employees: ");
        //System.out.println("~~~");
        for (Employee person:emp){  //maybe animals in schedule could be in rows, matrix style. How to avoid managers.
            String line = "| " + person.getRole() + " " +  person.getName() + " : \t";   //is the row, style |emp: animal, animal|
            if (!(person.getRole().indexOf("keeper")==-1) || !(person.getRole().equals("Manager"))){  //trying to avoid manager
                if (p+i < animals.size()) {//can assign a certain number of animals to each emp without going out of bounds
                    for (int j = 0; j <= p; j++) {      //creates a row of animals for employee.
                        line += animals.get(i).getName();
                        if (j != p){
                            line +=", ";
                        }
                        i++;
                    }
                }
                else if (i < animals.size()){
                    line += animals.get(i).getName();
                    i++;
                }
            }
            else{
                line += ("\"[Insert employee names]\"");
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println("~~~~~~~");
    }

    public static void today(){
        System.out.println("\t\t\t\t~~~~~Day #" + day +": ~~~~~");
        System.out.println("==========");
        System.out.println();
        for (int i = 0; i < 2;i++) {  //maybe not all of them. probably a random one
            Animal animal = animals.get((int)(Math.random() * animals.size()));
            System.out.println(animal.status());
            System.out.println(animal.feelingsNow());
            System.out.println(animal.makeNoise());
            //System.out.println(animal.toString());
            Zoo.toKillOrNot(animal);

            System.out.println("-------");
        }
        Animal animal = animals.get((int)(Math.random() * animals.size()));
        Zoo.toKillOrNot(animal);
        System.out.println("-------");
        event();
        System.out.println("-------");
        System.out.println("\t"+Animal.whoDied());
        System.out.println("" + Animal.messUpTracker());
        System.out.println("=======");
        System.out.println();
        day++;

    }

    public static Animal create(){
        Scanner scan = new Scanner(System.in);
        System.out.println("please input a [name], [species], [age], [habitat] and either [true] or [false]");
        System.out.print("name: ");
        String name = scan.nextLine();
        System.out.print("species: ");
        String species = scan.nextLine();
        System.out.print("age: ");
        int age = Integer.parseInt(scan.nextLine());
        System.out.print("habitat: ");
        String habitat = scan.nextLine();
        System.out.print("true/false: ");
        boolean alive = scan.nextBoolean();
        return  new Animal(name, species, age, habitat, alive);
        //return (scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextLine(), scan.nextBoolean());
    }

    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 20000, "Duckkeeper");
        emp.add(bob);


        Animal foot = new Animal("Foot", "Penguin-Rhinoceros Hybrid", 5, " Rainforest", false);
        animals.add(foot);
        animals.add(new Animal("Frank", "Duck-Giraffe Hybrid", 68, "Water", false));
        Spider joe = new Spider("Squirrel", "Pelican Spider", 5, "Shoe", true);
        animals.add(joe);
        animals.add(new Animal("Pachika", "Panda-Chinchilla-Cat Hybrid", 2000, "Penguin Terrarium", true));
        animals.add(new Spider("Lori","Peacock Spider-Parakeet Hybrid",20,"Cafeteria Salad Bowl", false));
        animals.add(new Animal("Fuu","Lion-Fish Hybrid",7,"Ice Tundra", false));
        animals.add(new Animal("Thanksgiving Dinner","Headless Sea Chicken",5,"Underwater Cave", true));
        animals.add(new Animal("Edgar","Damascus Goat",4,"Manager's Office/Desert", true));
        animals.add(new Animal("Snowman","Elephant-Capybara-Elf Hybrid",23,"Riverbank Shelf", false));
        animals.add(new Animal("Roe","Capybara-Dog-Chicken Hybrid", 17,"Paris Ocean Forest", true));
        animals.add(new Animal("Ben","Goat-Bird Hybrid",84,"Coral Reef", false));
        animals.add(new Animal("Fluffy","Giant Mantis-Tiger-Carnivorous Caterpillar Hybrid", 57,"Nightmare Forest", true));
        intakeAnimal(new Animal());
        //animals.add(new Animal("","",,"", false));
        //Employee joe = new Employee("Joe",20000,"guide");
        hire(new Employee("Joe",20000,"guide"));
        hire(new Employee("Turtle",20000,"Spa Master"));
        hire(new Employee("Alex",20000,"Capitalism Overseer"));
        hire(new Manager("Phil", 200000, 5));
        hire(new Employee("Bob", 14000, "duck keeper"));
        hire(new Employee("Eve",14000,"Zookeeper"));
        hire(new Employee("Mistake",14000,"Zookeeper"));
        hire(new Employee("Okami",14000,"Zookeeper"));
        //hire(new Employee("",,""));
        //System.out.println(emp);

        /*
    //can be converted into a method for user input animals
        Scanner scan = new Scanner(System.in);
        System.out.println("please input a [name], [species], [age], [place/setting] and either [true] or [false]. Press (enter) for each entry.");
        String aName = scan.nextLine();
        String aSpecies = scan.nextLine();
        int age = scan.nextInt();
        String habitat = scan.nextLine();
        boolean alive = scan.nextBoolean();

        //individualize it, so can reuse scnners for names or something
*/

        intakeAnimal(Zoo.create());
        System.out.println();
        schedule();  //can be separated
        System.out.println();
        //today();
        //System.out.print("You have " + Animal.getCount() + " animalks");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days should the zoo be run for?");
        int term = scan.nextInt();
        while (getDay() < term){
            today();
            scan.nextLine();
        }

    }
}