package lesson1;

public class LessonOne {
    public static void main(String[] args) {

    Cat cat1 = new Cat("Barsik","grey",5,2,3);
    Pool pool = new Pool(50);
    Jump jump = new Jump(2);
    cat1.swim(pool);
    cat1.canJump(jump);

    }
}
