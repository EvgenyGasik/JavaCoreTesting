package lesson1;

import java.util.Objects;

public class Cat extends Animals implements CanSwim{

    private boolean isWild;
    private int swimmingSpeed;

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public boolean isWild() {
        return isWild;
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice(){
        System.out.println("Cat make may");
    }

    public double swim(Pool pool){
        System.out.println(" I can swim");

        double timeToSwim = pool.getLength()/swimmingSpeed;
        return timeToSwim;

    }
}
