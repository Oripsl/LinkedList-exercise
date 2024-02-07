public class Fruit {
    private String fruitName;

    public Fruit(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    @Override
    public String toString() {
        return
                "Fruit: " + fruitName;
    }
}
