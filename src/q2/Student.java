package Q2;

import java.util.Objects;

 record Student(Integer id, String name, Integer standard ) {

    Student
    {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(standard);

    }
 }
