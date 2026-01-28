package holidayTasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentGradesTest{


	@Test
	public void testForTotalScoreOfStudents(){

		int[][] scores = {{60, 70, 90}, {80, 40, 50}, {12, 0, 104}};
		int[] actual = {220, 170, 116};
		int[] expected = StudentGrades.totalOfScores(scores);

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testForAverageOfStudents(){

		int[][] scores = {{60, 70, 90}, {80, 40, 50}};
		double[] actual = {73.0, 56.0};
		double[] expected = StudentGrades.averageOfScores(scores);

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testForPositionOfStudents(){

		int[][] scores = {{60, 70, 90}, {80, 40, 50}};
		int[] actual = {1, 2};
		int[] expected = StudentGrades.positionOfStudents(scores);

		assertArrayEquals(expected, actual);		

	}


	@Test
	public void testForHighestStudentScoreInEachSubject(){

		int[][] scores = {{60, 70, 90}, {80, 40, 50}};
		int[] actual = {80, 70, 90};
		int[] expected = StudentGrades.highestStudentScore(scores);

		assertArrayEquals(expected, actual);		

	}


	@Test
	public void testForHighestScoringStudentInEachSubject(){

		int[][] scores = {{60, 70, 90}, {80, 40, 50}};
		int[] actual = {2, 1, 1};
		int[] expected = StudentGrades.highestStudent(scores);

		assertArrayEquals(expected, actual);		

	}







}