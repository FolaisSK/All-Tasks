package problems;

import org.junit.jupiter.api.Test;

public class ProblemTest {
    @Test
    public void testForValidProblemType(){
        Problem problem = new Problem("School Fees", "financial");
        problem.addProblem("No Fuel");
        System.out.println(problem.getUnsolvedProblems());

        problem.solveProblem("No Fuel");
        System.out.println(problem.getUnsolvedProblems());
        problem.solveProblem("School Fees");
        System.out.println(problem.getUnsolvedProblems());
    }
}
