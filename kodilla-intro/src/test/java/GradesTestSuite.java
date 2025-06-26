import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    private Grades grades;

    @BeforeEach
    void setUp() {
        grades = new Grades();
    }

    @Test
    void testAddAndGetLastAddGrade() {
        assertEquals(0, grades.getLastAddGrade()); //nie dodano oceny

        grades.add(5);
        assertEquals(5, grades.getLastAddGrade());

        grades.add(3);
        assertEquals(3, grades.getLastAddGrade());
    }

    @Test
    void testAddDoesNotExceedSize() {
        for (int i = 1; i <= 15; i++) {
            grades.add(i);
        }
        assertEquals(10, grades.getLastAddGrade());
    }

    @Test
    void testGetAverageGradeEmpty() {
        assertEquals(0.0, grades.getAverageGrade());
    }

    @Test
    void testGetAverageGrade() {
        grades.add(4);
        grades.add(2);
        grades.add(3);

        assertEquals(3.0, grades.getAverageGrade());
    }

}