public class Manager extends Employee{
    private int directReports;

    public Manager(String name, int salary, int directReports){
        this.name = name;
        this.salary = salary;
        this.role = "Manager";
        this.directReports = directReports;
    }

    public Manager(int directReports){
        this.directReports = directReports;
    }

    public int getDirectReports() {
        return directReports;
    }

    public String toString() {
        return this.name + " has " + this.directReports + " people working for them.";
    }

    public static void main(String[] args) {
        Manager phil = new Manager("Phil", 200000, 5);
        System.out.println(phil);


    }

}