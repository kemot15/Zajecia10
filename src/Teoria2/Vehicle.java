package Teoria2;

public class Vehicle {
    private int speed;

    public void increaseSpeed (int value){
         speed += value;
    }
    public int getSpeed() {
        return speed;
    }

    public String toString (){
        return "" + speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
