import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, String> function = s -> s.substring(0,3);
        Function<List<Student>, List<Student>> students = li -> {
            List<Student> result = new ArrayList<>();
            for(Student s : li) {
                if(function.apply(s.getName()).equalsIgnoreCase("ayu")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student("ayush", 1);
        Student s2 = new Student("ayush", 1);
        Student s3 = new Student("ayush", 1);

        List<Student> studentList = Arrays.asList(s1,s2,s3);
    }

    
}

public static class Student {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}