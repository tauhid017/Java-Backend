package Basics;

public class Interfaces implements Car1 {

    @Override
    public void start(){
        System.out.println("The car is running ");
    }
    public static void main(String[] args){

    }
}
interface Car1{
    void start();
}
