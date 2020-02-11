public class Algea extends AquariumContent {
    public void display() {
        System.out.println("Value of algea: = " + value);
    }

    public void AddValue(int val) {
        value = val;
    }

    protected int value;
}
