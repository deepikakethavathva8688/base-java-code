public class ClassObject {
    public static void main(String[] args) {
        // ECE student1 = new ECE();
        // student1.SetName("deepika");
        // System.out.println(student1.name); //null
        ECE student1 = new ECE(12, "jhon", 999668768);
        System.out.println(student1.getName());

        // ECE student2 = new ECE();

    }

}

// class , object , method

class ECE {
     private int rollNo;
    private String name;
    private int Moble;


    ECE (int roll , String name, int mobile) {
        this.rollNo = roll;
        this.name = name;
        this.Moble = Moble;

    }

    public void getName(String n) {
        this.name = n;
    }




}