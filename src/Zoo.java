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
    public static void hire(Employee employee){
        emp.add(employee);
    }

    public void intakeAnimal(Animal animal){
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

    public static void employedNames(){
        for (Employee name:emp){
            System.out.print(name.getName() +"|");
        }
        //return ":)";
    }

    public static void event(){
        String event;
        int e = (int)(Math.random() * emp.size());
        int a = (int)(Math.random() * animals.size());
        int num = (int)(Math.random() * 3);

        //random events
        //OH nO! [] wwent on a rage! [] did not feed them!
        //[]did not give [] a luxurious bath & spa, so []has plotted their demise!
        //[role][name] has discovered evidence for/reports their suspicions of [] running an offshore drilling farm
        if (num == 0){
            System.out.println("[OH nO! "+ animals.get(a).getName() + " the " + animals.get(a).getSpecies() +" wwent on a rage! " + emp.get(e).getName() + " did not feed them!]");
        }
        else if (num == 1){
            System.out.println("[OH nO! "+ emp.get(e).getName() + " did not give " + animals.get(a).getName() +  " a luxurious bath & spa, so the \n" + animals.get(a).getSpecies() + " has plotted their inevitable demise!]");
        }
        else if (num == 2){
            System.out.println("[" + emp.get(e).getRole() + " " + emp.get(e).getName() + " has reported their discoveries and suspects that " + animals.get(a).getName() + " \nthe " + animals.get(a).getSpecies() + " is running an illegal offshore oil drilling company.]");
        }
    }

    public static void schedule(Employee employee, Animal animal){

    }


    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 20000, "Duckkeeper");
        emp.add(bob);
        System.out.println(emp.get(0).getName());


        Animal foot = new Animal("Foot", "Penguin-Rhinoceros", 5, " Rainforest", false);
        animals.add(foot);
        animals.add(new Animal("Frank", "Duck-Giraffe Hybrid", 68, "Water", false));
        System.out.println(foot.feelingsNow());
        //System.out.println("ଲ(ⓛ ω ⓛ)ଲ");

        //public String schedule(<Employee> employed, animals){
            String line1 = "6:00am  |" + emp.get(0).getName() + " \t|" + animals.get(0).getName();
            System.out.println(line1);
        //}

        //Employee joe = new Employee("Joe",20000,"guide");
        hire(new Employee("Joe",20000,"guide"));
        System.out.println(emp);

        event();

    }
}