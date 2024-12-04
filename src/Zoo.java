import java.util.LinkedList;
//import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
        Employee bob = new Employee("Bob", 20000, "Zookeeper");
        employed.add(bob);
        System.out.println(employed);
    }
}