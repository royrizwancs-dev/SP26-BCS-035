class Student {
    String name;
    int completedCredits;

    void rename(String name) {
        this.name = name;
    }

    void addCredits(int amount) {
        this.completedCredits += amount;
    }
}