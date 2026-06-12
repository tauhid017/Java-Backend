public class Manager extends Employee {
    float allowance;

    @Override
    public double calcualtesalar() {
        return getBase()+allowance;
    }

    @Override
    public void displaydetials() {
        System.out.println("The ID is: "+getID());
        System.out.println("The name of the manager is: "+getName());
        System.out.println("The salary is: "+calcualtesalar());
    }
    public static void main (String[] args){

    }
    public Manager(int ID, String name, float base,float allowance){
        super(ID,name,base);
        this.allowance = allowance;
    }
}
