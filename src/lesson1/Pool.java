package lesson1;

public class Pool {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Pool(int length) {
        this.length = length;
    }

    public double getTimeToSwim(CanSwim animals){
        return animals.swim(this);
    }
}
