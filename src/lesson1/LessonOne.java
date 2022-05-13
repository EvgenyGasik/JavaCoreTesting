package lesson1;

public class LessonOne {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom","grey",5);

        System.out.println(cat1);

        Cat cat2 = new Cat("Moris","yellow", 3);

        Cat cat3 = new Cat("Moris","black", 3);

        System.out.println(cat2.equals(cat3));

        Wolf wolf =new Wolf("Beo","gray",4);




    }
}
