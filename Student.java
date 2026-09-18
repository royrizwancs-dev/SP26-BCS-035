class Student {
    int id;
    String name;
<<<<<<< HEAD
    int completedCredits;

    void addCredits(int amount) {
        completedCredits += amount;
    }

    void printStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Credits: " + completedCredits);
        System.out.println();
=======
    int completeCredits;

    void printSummary() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Complete Credits: " + completeCredits);
>>>>>>> 6418f28be66b21bdd62adefc0cd609ae85c615e4
    }
}