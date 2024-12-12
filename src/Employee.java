public class Employee {
    //public static void main(String[] args) {


    //    System.out.println("Hello world!");
    //public class Employee {
    //    //TODO: create employee class variables
    //
    protected String name;
    protected int salary;
    protected String role;//position

    //
    //
    //    //TODO: create constructors
    //
    public Employee(String name, int salary, String role){
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
    //
    public Employee(){

    }
    //
    //    //TODO: create getters and setters
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //
    //    //TODO: any other methods?
    //
    public String toString(){
        return this.name + " has a salary of $" + this.salary + " and a job as the " + this.role;
    }
    //
    //
    //    //TODO: create main method test
    //
    //
    public static void main(String[] args){
        Employee bob = new Employee("Bob", 14000, "duck keeper");
        Employee test = new Employee();
        System.out.println(bob);
        System.out.println(test);

        //System.out.println("/     \\\n\\◎ _ ◎/");
    }
    //
    //}
    //
    ////EOC: get out development logs, what did you learn? what did you build? what needs to be done?
    ////Day two will be building basic functionality of a zoo}
}
