public class Developer extends Employee {
    float bonus;
    @Override
    public double calcualtesalar() {
        double salary = bonus + getBase();
        return salary;
    }

    @Override
    public void displaydetials() {
        System.out.println("The ID is "+ getID());
        System.out.println("The developer name is: "+getName());
        System.out.println("Salary: "+calcualtesalar());
    }
    public Developer(float bonus, float base, String name, int ID) {
        super(ID, name, base);
        this.bonus = bonus;
    }
}
