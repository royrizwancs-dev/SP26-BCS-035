public class Demo1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 101;
        s1.name = "Rizwan";
        s1.completeCredits = 18;
        s2.id=115;
        s2.name="Ali";
        s2.completeCredits=20;

        s1.printSummary();
        s2.printSummary();
        s1.name="Sami";
        s1.completeCredits=25;
        s1.printSummary();
        

        
    }
}