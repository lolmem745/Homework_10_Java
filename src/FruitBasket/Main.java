package FruitBasket;

public class Main {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(4));
        orangeBox.add(new Orange(7));
        System.out.println(appleBox.getWeight() + " kg in appleBox");
        System.out.println(orangeBox.getWeight() + " kg in orangeBox");
        System.out.println(goldenAppleBox.getWeight() + " kg in goldenAppleBox");
        System.out.println();

        goldenAppleBox.add(new GoldenApple(2));
        System.out.println(appleBox.getWeight() + " kg in appleBox");
        System.out.println(orangeBox.getWeight() + " kg in orangeBox");
        System.out.println(goldenAppleBox.getWeight() + " kg in goldenAppleBox");
        System.out.println();

        goldenAppleBox.moveTo(appleBox);
        System.out.println(appleBox.getWeight() + " kg in appleBox");
        System.out.println(orangeBox.getWeight() + " kg in orangeBox");
        System.out.println(goldenAppleBox.getWeight() + " kg in goldenAppleBox");
        System.out.println();

        for (GoldenApple apple: goldenAppleBox) {
            System.out.println(apple);
        }
    }

}