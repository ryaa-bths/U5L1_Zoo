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

    public static void schedule(Employee employee, Animal animal){

    }


    public static void main(String[] args) {
        Employee bob = new Employee("Bob", 20000, "Duckkeeper");
        emp.add(bob);
        System.out.println(emp.get(0).getName());


        Animal foot = new Animal("Foot", "Penguin-Rhinoceros", 5, " Rainforest", false);
        animals.add(foot);
        System.out.println(foot.feelingsNow());
        //System.out.println("ଲ(ⓛ ω ⓛ)ଲ");

        //public String schedule(<Employee> employed, animals){
            String line1 = "6:00am  |" + emp.get(0).getName() + " \t|" + animals.get(0).getName();
            System.out.println(line1);
        //}

        //Employee joe = new Employee("Joe",20000,"guide");
        hire(new Employee("Joe",20000,"guide"));
        System.out.println(emp);


    }
}