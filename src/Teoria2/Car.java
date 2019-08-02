package Teoria2;

public class Car extends Vehicle {
    @Override
    public void increaseSpeed (int valuse){
        super.increaseSpeed(2*valuse);
    }

    public String toString(){
        return "";
    }
}
