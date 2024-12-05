import java.util.LinkedList;
//import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
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

        LinkedList<Employee> employed = new LinkedList<Employee>();
        Employee bob = new Employee("Bob", 20000, "Duckkeeper");
        employed.add(bob);
        System.out.println(employed.get(0).getName());

        LinkedList<Animal> animals = new LinkedList<Animal>();
        Animal foot = new Animal("Foot", "Penguin-Rhinoceros", 5, " Rainforest", false);
        animals.add(foot);
        System.out.println(foot.feelingsNow());
        //System.out.println("ଲ(ⓛ ω ⓛ)ଲ");

        //public String schedule(<Employee> employed, animals){
            String line1 = "6:00am  |" + employed.get(0).getName() + " \t|" + animals.get(0).getName();
            System.out.println(line1);
        //}

    }
}