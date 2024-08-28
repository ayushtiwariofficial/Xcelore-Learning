import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    double salary;

    // Constructor
    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    // public String getName() { return name; }
    // public int getAge() { return age; }
    // public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class Assesment1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 35, 45000));
        people.add(new Person("Bob", 28, 60000));
        people.add(new Person("Charlie", 40, 30000));
        people.add(new Person("David", 25, 40000));

        List<Person> filteredPeople = people.stream()
            .filter(person -> person.age > 30 && person.salary < 50000)
            .collect(Collectors.toList());

        filteredPeople.forEach(System.out::println);
    }
}
