import java.util.LinkedList;

public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();

        fruitList.add(new Fruit("Pear"));
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Banana"));

        System.out.println("Original linked fruit list:");
        System.out.println(fruitList);

        fruitList.addFirst(new Fruit("Mango"));
        fruitList.addLast(new Fruit("Strawberry"));

        System.out.println("Updated linked fruit list");
        System.out.println(fruitList);
    }
}
