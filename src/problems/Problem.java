package problems;

import java.util.ArrayList;

public class Problem {
    private String name;
    private String type;
    private  boolean isSolved;
    private  ArrayList<String> problems = new ArrayList<String>();

    public Problem(String name, String type) {
        this.name = name;
        validateType(type);
        this.isSolved = false;
        addProblem(name);
    }

    public void validateType(String type){
        type = type.toUpperCase();
        if(type.equals("FINANCIAL") || type.equals("SPIRITUAL") || type.equals("EDUCATION") || type.equals("TECHNICAL"))
            this.type = type;
        else
            throw new IllegalArgumentException("Invalid Problem Type");
    }

    public void solve() {
        isSolved = true;
    }

    public void addProblem(String problem) {
        problems.add(problem);
    }

    public void solveProblem(String name) {
        for(int count = 0; count < problems.size(); count++){
            if(name.equals(problems.get(count))){
                solve();
                problems.remove(count);
            }
        }
    }

    public int getUnsolvedProblems(){
        return problems.size();
    }
}
