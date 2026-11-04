import java.util.List;
import java.util.Optional;

public class StudentRepository {

    private final List<Student> students = List.of(
            new Student("Anna", "anna@example.com"),
            new Student("Ben", "ben@example.com"),
            new Student("Clara", "clara@example.com"),
            new Student("David", "david@example.com")
    );

    public Optional<Student> findByName(String name) {

        // TODO

        return Optional.empty();
    }

    public Optional<String> findEmailByName(String name) {
        // TODO

        return Optional.empty();
    }

    static void main() {

        // TODO
    }
}