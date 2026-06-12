abstract class Employee {
    private int ID;
    private String name;
    private  float base;
    public abstract double calcualtesalar();
    public abstract void displaydetials();
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getBase() {
        return base;
    }
    public Employee(int ID, String name, float base) {
        this.ID = ID;
        this.name = name;
        this.base = base;
    }
}
