class ECE {
    private String name;

    // Constructor
    public ECE(String name) {
        this.name = name;
    }
    ECE(){
        this.name = "empty";
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Class_CSE {
    public static void main(String[] args) {
        ECE student1 = new ECE("Deepika");
        System.out.println(student1.getName());
    }
}
