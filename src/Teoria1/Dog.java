package Teoria1;

public class Dog extends Animal {
    double tail;

    public Dog(String name, String color, double tail) {
        super(name, color);
        this.tail = tail;
    }

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    public String getInfo() {
        return "nazwa " + name + " kolor " + getColor() + " ogon ma dlugosc " + tail;
    }
}
