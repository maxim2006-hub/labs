import java.util.HashMap;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;

    public Student(String firstName, String lastName, int age, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Возраст: " + age + ", Средний балл: " + gpa + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        
        HashMap<String, Student> students = new HashMap<>();

     
        students.put("101", new Student("Иван", "Иванов", 20, 4.5));
        students.put("102", new Student("Анна", "Смирнова", 19, 4.9));
        students.put("103", new Student("Петр", "Васильев", 21, 3.8));

        System.out.println("Все студенты добавлены.");

        
        String zxc1 = "102";
        Student foundStudent = students.get(zxc1);
        System.out.println("Результат поиска по зачетке " + zxc1 + ": " + foundStudent);

       
        String zxc2 = "103";    
        students.remove(zxc2);
        System.out.println("Студент с зачеткой " + zxc2 + " был удален.");

        System.out.println("Оставшиеся студенты в базе: " + students);
    }
}
