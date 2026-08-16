import java.util.Scanner;

class Students {

    String name;
    int age;
    int rollNo;
    int marks;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        System.out.print("Enter roll number: ");
        rollNo = scanner.nextInt();

        System.out.print("Enter marks: ");
        marks = scanner.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Student {
    public static void main(String[] args) {

        Students studentObj = new Students();

        studentObj.input();
        studentObj.display();
    }
}
