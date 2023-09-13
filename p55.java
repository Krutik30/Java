import java.util.Scanner;

class RollNoException extends Exception {
    long rollNo;

    RollNoException(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String returnString() {
        return rollNo + " is not in given range of rollNumber.";
    }
}

class Student {
    int rollNo;
    long phoneNo;
    String name, address, course;

    Student(int rollNo, long phoneNo, String name, String address, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.course = course;
    }

    void printStudentInformation() {
        System.out.println("Name : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Address : " + address);
        System.out.println("PhoneNO : " + phoneNo);
        System.out.println("Course : " + course);
        System.out.println();
    }
}

public class p55 {
    public static void ThrowRollNoException(long rollNo) throws RollNoException {
        System.out.println();
        System.out.println("Called for check and throw exception");
        if (rollNo < 100 || rollNo > 999) {
            throw new RollNoException(rollNo);
        }
        System.out.println("Normal Exit");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students to enter : ");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        int rollNo;
        long phoneNo;
        String name, address, course;
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter values for student[" + (i + 1) + "];");
                System.out.print("Enter the name : ");
                name = sc.next();
                System.out.print("Enter the rollno : ");
                rollNo = sc.nextInt();
                ThrowRollNoException(rollNo);
                System.out.print("Enter the address : ");
                address = sc.next();
                System.out.print("Enter the phoneno : ");
                phoneNo = sc.nextLong();
                System.out.print("Enter the course : ");
                course = sc.next();
                s[i] = new Student(rollNo, phoneNo, name, address, course);
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                s[i].printStudentInformation();
            }
        } catch (RollNoException e) {
            System.out.println(e + " " + "Either the rollNo you entered is <100 or >999.");
        }
        sc.close();
    }
}