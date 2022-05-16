package lesson1;

public class Turtle extends Animals implements CanSwim{

    private int swimmingSpeed;

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(int jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    private int jumpLimit;


    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public void voice(){
        System.out.println("Turtle make may");
    }

    public int swim(Pool pool){
        System.out.println(" I can swim - Turtle");

        int timeToSwim = pool.getLength()/swimmingSpeed;
        return timeToSwim;

    }
}
