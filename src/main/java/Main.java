import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box(40);
        Box<Orange> box2 = new Box(50);
        Box<Apple> box3 = new Box(45);

        Apple apple1 = new Apple(1.0f);
        Orange orange1 = new Orange(1.5f);
        Apple apple2 = new Apple(1.6f);

        box1.addFruitBoxes(apple1);
        box2.addFruitBoxes(orange1);
        box3.addFruitBoxes(apple2);

        box1.boxWeigth(apple1);
        box2.boxWeigth(orange1);
        box3.boxWeigth(apple1);
    }
}