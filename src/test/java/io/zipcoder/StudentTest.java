package io.zipcoder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TESTING USING EXISTING CODE GIVEN IN READ ME
// TEST WAS ALMOST IMPOSSIBLE TO PASS
public class StudentTest {

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScoresString();

        // Then
        String expectedOutput =
                                        "Exam Scores:\n" +
                                        "\tExam 1 -> 100.0\n" +
                                        "\tExam 2 -> 95.0\n" +
                                        "\tExam 3 -> 123.0\n" +
                                        "\tExam 4 -> 96.0\n";
        assertEquals(expectedOutput, output);
    }


    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScoresString();

        // Then
        String expectedOutput = "Exam Scores:\n" + "\tExam 1 -> 100.0\n";
        assertEquals(expectedOutput, output);
    }


    @Test
    public void testSetExamScore() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScoresString();

        // Then
        String expectedOutput = "Exam Scores:\n" + "\tExam 1 -> 150.0\n";
        assertEquals(expectedOutput, output);
    }


    @Test
    public void testGetAverageExamScore() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        double average = student.getAverageExamScore();

        // Then
        assertEquals(125.0, average, 0.001);
    }

}
