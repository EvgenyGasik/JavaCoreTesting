package lesson1;

public class Cat extends Animals implements CanSwim, Jumpable {

    //private boolean isWild;
    private int swimmingSpeed;
    private int jumpLimit;

    public Cat(String name, String color, int age, int swimmingSpeed, int jumpLimit) {
        super(name, color, age);
        this.swimmingSpeed = swimmingSpeed;
        this.jumpLimit = jumpLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(int jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    public int getSwimmingSpeed() {

        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {

        this.swimmingSpeed = swimmingSpeed;
    }

    public void voice() {
        System.out.println("Cat make may");
    }

    public int swim(Pool pool) {
        System.out.println(" I can swim");

        int timeToSwim = pool.getLength()/swimmingSpeed;
        return timeToSwim;

    }


    @Override
    public void canJump(Jump jump) {
        if(jump.getHeight() >= jumpLimit){
            System.out.println("I cant jump");
        }
        else {
            System.out.println(" I can jump this " + jump.getHeight() + " height");
        }
    }
}