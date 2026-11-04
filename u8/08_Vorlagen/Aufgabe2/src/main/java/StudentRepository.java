import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StudentRepository {

    private final List<Student> students = List.of(
            new Student("Anna", "anna@example.com"),
            new Student("Ben", "ben@example.com"),
            new Student("Clara", "clara@example.com"),
            new Student("David", "david@example.com")
    );

    public Optional<Student> findByName(String name) {

        return students.stream()
                .filter((student) -> Objects.equals(name, student.getName()))
                .findAny();
    }

    public Optional<String> findEmailByName(String name) {
        return findByName(name).map(Student::getEmail);
    }

    static void main() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.findEmailByName("Anna").ifPresent(IO::println);
        studentRepository.findByName("Eva").ifPresentOrElse(
                IO::println,
                () -> IO.println("Student 'Eva' not found!")
        );
        
    }
}