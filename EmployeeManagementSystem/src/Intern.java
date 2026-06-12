public class Intern  extends Employee {

    @Override
    public double calcualtesalar() {
        return getBase();
    }

    @Override
    public void displaydetials() {
        System.out.println("The ID is: "+getID());
        System.out.println("The name is: "+getName());
        System.out.println("Salary is: "+calcualtesalar());
    }
    public Intern(int ID, String name, float base){
        super(ID,name,base);
    }
}
