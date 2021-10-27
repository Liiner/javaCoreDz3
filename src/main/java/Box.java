import java.util.ArrayList;
public class Box<T extends Fruit> {
    ArrayList<T> boxes;
    int numbers;
    double a;

    public void addFruitBoxes(T t) {
        boxes.add(t);
    }

    public Box(int numbers) {
        boxes = new ArrayList<>();
        this.numbers = numbers;
    }

    public Box() {
        boxes = new ArrayList<>();
    }

    public void boxWeigth(T t) {
        a = t.getWeigth() * numbers;
        System.out.println(a);

    }
}
