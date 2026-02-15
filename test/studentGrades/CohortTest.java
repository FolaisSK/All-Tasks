package studentGrades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CohortTest {

    private Cohort cohort;

    @BeforeEach
    public void startsWith(){
        int numberOfStudents = 3;
        int numberOfSubjects = 2;
        cohort = new Cohort(numberOfStudents,numberOfSubjects);
        int[][] grades = {{56,42}, {77,90}, {43,55}};
        cohort.setAllGrades(grades);
    }

    @Test
    public void testToGetStudentGrades(){
        int[][] grades = {{56,42}, {77,90}, {43,55}};
        assertArrayEquals(cohort.getGrades(), grades);
    }

    @Test
    public void testToSetStudentOneSubjectOneScore(){
        int[][] grades = {{56,42}, {77,90}, {43,55}};
        assertArrayEquals(cohort.getGrades(), grades);
        cohort.setStudentGrade(0,0,99);
        int [] [] expectedGrades = {{99,42}, {77,90}, {43,55}};
        assertArrayEquals(cohort.getGrades(), expectedGrades);
    }

    @Test
    public void testToForEachStudentTotalScore(){
        assertEquals(cohort.getTotalScore(0), 98);
        assertEquals(cohort.getTotalScore(1), 167);
        assertEquals(cohort.getTotalScore(2), 98);
    }

    @Test
    public void getEachStudentAverage(){
        assertEquals(cohort.getAverageScore(0), 49.0);
        assertEquals(cohort.getAverageScore(1), 83.5);
        assertEquals(cohort.getAverageScore(2), 49);
    }

    @Test
    public void getPositionsOfStudents(){
        int[] positions = {2,1,2};
        assertArrayEquals(cohort.getStudentPositions(), positions);
    }

}