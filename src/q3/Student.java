package q3;

import java.util.Objects;

record Student(Integer id, String name, Integer standard ) {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(standard, student.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }
}
