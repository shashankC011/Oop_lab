class Students{
    int regNo;
    String name;
    int age;
    private static int ugCount = 0;
    private static int pgCount = 0;
    Students(){
        regNo = -1;
        age= -1;
        name = null;
    }
    Students(int regNo, String name, int age){
        this.regNo = regNo;
        this.name = name;
        this.age = age;
    }
    static void incrementUGCount() {
        ugCount++;
    }

    static void incrementPGCount() {
        pgCount++;
    }
    static void displayCounts() {
        System.out.println("Total UG admissions: " + ugCount);
        System.out.println("Total PG admissions: " + pgCount);
    }
    
}
class UG extends Students{
    int semester;
    int fees;
    UG(){
        semester = -1;
        fees = -1;
        Students.incrementUGCount();

    }
    UG(int regNo, String name, int age, int semester,int fees){
        super(regNo, name,age);
        this.semester =semester;
        this.fees= fees;
        Students.incrementUGCount();
    }
    public void display(){
        System.out.println("Name of UG student is: "+name+ "    Reg No: "+regNo+ "  Age: "+age+"  Semester: "+semester+"  Fees: "+fees);
    }

}
class PG extends Students{
    int semester;
    int fees;
    PG(){
        semester = -1;
        fees = -1;
        Students.incrementPGCount();

    }
    PG(int regNo, String name, int age, int semester,int fees){
        super(regNo, name,age);
        this.semester =semester;
        this.fees= fees;
        Students.incrementPGCount();

    }
    public void display(){
        System.out.println("Name of PG student is: "+name+" Reg No: "+regNo+ "  Age: "+age+"  Semester: "+semester+"  Fees: "+fees);
    }
}

public class Q2 {
    public static void main(String[] args) {

        UG ugStudent1 = new UG(230953402, "Shashnk", 20, 3, 1500);
        UG ugStudent2 = new UG(230953403, "Parth", 21, 4, 1600);

        PG pgStudent1 = new PG(230953404, "ABC", 24, 2, 2500);
        PG pgStudent2 = new PG(230953405, "XYZ", 25, 3, 2700);
        ugStudent1.display();
        ugStudent2.display();
        pgStudent1.display();
        pgStudent2.display();

        Students.displayCounts();
    }
}
