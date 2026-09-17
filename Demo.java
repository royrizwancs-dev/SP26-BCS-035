public class Demo {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.setRadius(5);

        System.out.println("Before: " + c.getRadius());

        c.setRadius(-5);

        System.out.println("After: " + c.getRadius());
    }
}