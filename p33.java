
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollNumber = rollno;
        this.name = name;
        this.city = city;
    }

    // Search function
    public static void search(Student[] arr, String nam, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].name.equals(nam)) {
                printFound(arr, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("404:Data-not-found/databaseInvalidError");
        }
    }

    public static void search(Student[] arr, int roll, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].rollNumber == roll) {
                printFound(arr, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("404:Data-not-found/databaseInvalidError");
        }
    }

    public static void search(Student[] arr, int roll, String cit, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].rollNumber == roll && arr[i].city.equals(cit)) {
                printFound(arr, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("404:Data-not-found/databaseInvalidError");
        }
    }

    public static void printFound(Student arr[], int i) {
        System.out.print(arr[i].rollNumber + ", ");
        System.out.print(arr[i].name + ", ");
        System.out.println(arr[i].city);
    }

    public static void printWholearray(Student arr[], int n) {
        System.out.println();
        System.out.println("The provided database is;");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].rollNumber + " ");
            System.out.print(arr[i].name + " ");
            System.out.println(arr[i].city);
        }
        System.out.println();
    }
}

class p33 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        Student arr[] = new Student[n];

        System.out.println("Enter rollno, name and city of students;");
        for (int i = 0; i < n; i++) {
            arr[i] = new Student(sc.nextInt(), sc.next(), sc.next());
        }

        Student.printWholearray(arr, n);
        System.out.println("(N/n) for name.search,");
        System.out.println("(R/r) for rollno.search,");
        System.out.println("(C/c) for rollno&city.search,");
        System.out.println("(E/e) to exit.");
        char choice;
        do {
            System.out.println();
            choice = sc.next().toLowerCase().charAt(0);
            switch (choice) {
                case 'n':
                    System.out.print("Enter name of student to be searched : ");
                    String name = sc.next();
                    Student.search(arr, name, n);
                    break;
                case 'r':
                    System.out.print("Enter rollnumber of student to be searched : ");
                    int roll = sc.nextInt();
                    Student.search(arr, roll, n);
                    break;
                case 'c':
                    System.out.print("Enter rollnumber and city of student to be searched : ");
                    int rollno = sc.nextInt();
                    String city = sc.next();
                    Student.search(arr, rollno, city, n);
                    break;
                default:
            }
        } while (choice != 'e');
        sc.close();
    }
}