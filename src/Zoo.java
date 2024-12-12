import java.util.LinkedList;
//import java.util.Scanner;

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

    public static void animalNames(){
        String a = "|";
        for (Animal name:animals){
            a = a + name.getName() +"|";
        }
        System.out.println(a);
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
            event = "[OH nO! "+ aniName + " the " + aniSpecies +" wwent on a rage! " + empName + " did not feed them!]";
        }
        else if (num == 1){
            event = "[OH nO! "+ empName + " did not give " + aniName +  " a luxurious bath & spa, so the \n" + aniSpecies + " has plotted their inevitable demise!]";
        }
        else if (num == 2){
            event = "[" + job + " " + empName + " has reported their suspicions and evidence that " + aniName + " \nthe " + aniSpecies + " is running an illegal offshore oil drilling company.]";
        }
        else if (num == 3){ event = "[A " + job + " has turned in a report stating that they accidentally got a " + aniSpecies + " addicted to sugar.]";}
        else if (num == 4){ event = "[ " + job + " " + empName +" says that the " + aniSpecies + " "+ aniName + " attacked and disconnected their ankles. \nThey are now gnawing on it inside their " + animals.get(a).getHabitat() + " habitat. \nThe employee says they would like a refund on that.]";}
        //else if (num == ){ event = "[" + "]";}
        else{
            event = "[ The end is nigh... -" + aniName + ", " + aniSpecies + "]";
        }
        System.out.println(event);
    }

    public static void schedule(Employee employee, Animal animal){
        /* set lines here, is constructor. Might need to make new class*/
        /*public String schedule(<Employee> employed, animals){
            String line1 = "6:00am  |" + emp.get(0).getName() + " \t|" + animals.get(0).getName();
            System.out.println(line1);
        }*/
    }


    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 20000, "Duckkeeper");
        emp.add(bob);


        Animal foot = new Animal("Foot", "Penguin-Rhinoceros Hybrid", 5, " Rainforest", false);
        animals.add(foot);
        animals.add(new Animal("Frank", "Duck-Giraffe Hybrid", 68, "Water", false));
        System.out.println(foot.feelingsNow());
        //System.out.println("ଲ(ⓛ ω ⓛ)ଲ");
        Spider joe = new Spider("Squirrel", "Pelican Spider", 5, "Shoe", true);
        animals.add(joe);
        animals.add(new Animal("Pachika", "Panda-Chinchilla-Cat Hybrid", 2000, "Penguin Terrarium", true));

        //Employee joe = new Employee("Joe",20000,"guide");
        hire(new Employee("Joe",20000,"guide"));
        hire(new Employee("Turtle",20000,"Spa Master"));
        //System.out.println(emp);

        event();
        //employedNames();



    }
}