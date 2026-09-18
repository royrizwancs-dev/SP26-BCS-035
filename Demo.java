public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        // s1 ki values
        s1.id = 1;
        s1.name = "Ali";
        s1.completedCredits = 20;

        // s2 ki values
        s2.id = 2;
        s2.name = "Sara";
        s2.completedCredits = 30;

        // Dono objects print
        s1.printStudent();
        s2.printStudent();

        // Sirf s1 ko change karna
        s1.name = "Ahmed";
        s1.completedCredits = 25;

        System.out.println("After changing s1:");

        s1.printStudent();
        s2.printStudent();

        // Sirf s1 ke credits increase
        s1.addCredits(5);

        System.out.println("After addCredits on s1:");

        s1.printStudent();
        s2.printStudent();
    }
}