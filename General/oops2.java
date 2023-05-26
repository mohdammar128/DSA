package General;

public class oops2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2=new Student("Ammar");
        // Student s3=new Student("Ammar",82);
        s1.name = "Ammar";
        s1.rollNo = 2182;
        s1.marks[0] = 100;
        s1.marks[1] = 52;
        s1.marks[2] = 78;
        Student s2 = new Student(s1);
        s2.password = 12082003;
        s1.marks[1] = 90;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    int password;
    int marks[];
//shallow copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.password = s1.password;
    //     this.marks = s1.marks;// yaha per refernce assign hua ---array copy nhi hua
    // }

    //Deep copy
    Student(Student s1){
     marks=new int[3];
     this.name=s1.name;
     this.rollNo=s1.rollNo;
     for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
     }
    }

    // non parametrized constructor
    Student() {
        marks = new int[3];

        System.out.println("constructor is created");
    }

    // parametrized Constructor
    Student(String name) {
        this.name = name;
    }
    // parametrized Constructor

    Student(String name, int roll) {
        this.name = name;
        this.rollNo = roll;
        this.rollNo = roll;
    }
}
