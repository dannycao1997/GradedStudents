package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


// TESTING USING EXISTING CODE GIVEN IN READ ME
// TEST WAS ALMOST IMPOSSIBLE TO PASS
public class ClassroomTest {


    @Test
    public void testGetAverageExamScore() {
        // Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(125.0, output, 0.001);
    }


    @Test
    public void testAddStudent() {
        // Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        classroom.addStudent(student);
        Student[] students = classroom.getStudents();

        // Then
        assertEquals("Leon", students[0].getFirstName());
        assertEquals("Hunter", students[0].getLastName());
    }


    @Test
    public void testRemoveStudent() {
        // Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        classroom.removeStudent("student", "one");
        Student[] updatedStudents = classroom.getStudents();

        // Then
        assertNull(updatedStudents[0]);
    }


    @Test
    public void testGetStudentsByScore() {
        // Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        Student[] sortedStudents = classroom.getStudentsByScore();

        // Then
        assertEquals(s2, sortedStudents[0]); // s2 should have higher average score
        assertEquals(s1, sortedStudents[1]);
    }


    @Test
    public void testGetGradeBook() {
        // Given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        String gradeBook = classroom.getGradeBook().toString();

        // Then
        String expectedGradeBook =
                "{" + s2.toString() + "=A, " + s1.toString() + "=D" + "}";
        assertEquals(expectedGradeBook, gradeBook);
    }

}
