package lesson1;

public class Wolf extends Animals implements CanSwim, Jumpable{

    private int swimmingSpeed;
    private int jumpLimit;

    public Wolf(String name, int swimmingSpeed, int jumpLimit) {
        super(name);
        this.swimmingSpeed = swimmingSpeed;
        this.jumpLimit = jumpLimit;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(int jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    public int  swim(Pool pool){
        System.out.println(" I can swim - Wolf");

        int timeToSwim = pool.getLength()/swimmingSpeed;
        return timeToSwim;
    }


    public void canJump(Jump jump) {
        if(jump.getHeight() >= jumpLimit){
            System.out.println("I cant jump");
        }
        else {
            System.out.println(" I can jump this height - " + jump.getHeight());
        }
    }

}
