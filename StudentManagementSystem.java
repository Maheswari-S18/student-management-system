import java.util.*;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        students.add(name);

        System.out.println("Student List:");
        for(String s : students){
            System.out.println(s);
        }
    }
}