package studentGrades;

public class Cohort {
    private int[][] grades;
    private final int noOfSubjects;
    private final int noOfStudents;

    public Cohort(int noOfStudents, int noOfSubjects){
        this.noOfStudents = noOfStudents;
        this.noOfSubjects = noOfSubjects;

        grades = new int[noOfStudents][noOfSubjects];
    }

    public void setStudentGrade(int studentIndex, int subjectIndex, int score){
        grades[studentIndex][subjectIndex] = score;
    }

    public void setAllGrades(int[][] grades){this.grades = grades;}

    public int[][] getGrades(){
        return grades;
    }

    public int getTotalScore(int studentIndex){
        int total = 0;
        for(int count = 0; count < noOfSubjects; count++){
            total += grades[studentIndex][count];
        }
        return total;
    }

    public double getAverageScore(int studentIndex){
        return (double) getTotalScore(studentIndex) / noOfSubjects;
    }

    public int [] getAllTotalScores(){
        int[] totals = new int[noOfStudents];
        for(int count = 0; count < noOfStudents; count++){
            totals[count] = getTotalScore(count);
        }
        return totals;
    }

    public int[] getStudentPositions(){
        int[] positions = new int[noOfStudents];
        int[] totals = getAllTotalScores();

        for(int count = 0; count < noOfStudents; count++){
            int position = 1;

            for(int index = 0; index < noOfStudents; index++){
                if(totals[count] < totals[index]){
                    position++;
                }
            }
            positions[count] = position;
        }
        return positions;
    }

    public int getHighestStudentScore(int subjectIndex){
        int highestScore = 0;
        for(int count = 0; count < noOfSubjects; count++){
            if(grades[count][subjectIndex] > highestScore){
                highestScore = grades[count][subjectIndex];
            }
        }
        return highestScore;
    }

    public int getHighestStudent(int subjectIndex){
        int highestScore = getHighestStudentScore(subjectIndex);
        int highestStudent = 0;

        for(int count = 0; count < noOfSubjects; count++){
            if(grades[count][subjectIndex] == highestScore){
                highestStudent = count + 1;
            }
        }
        return highestStudent;
    }

    public int getLowestStudentScore(int subjectIndex){
        int lowestScore = 100;
        for(int count = 0; count < noOfSubjects; count++){
            if(grades[count][subjectIndex] < lowestScore){
                lowestScore = grades[count][subjectIndex];
            }
        }
        return lowestScore;
    }

    public int getLowestStudent(int subjectIndex){
        int lowestScore = getLowestStudentScore(subjectIndex);
        int lowestStudent = 0;

        for(int count = 0; count < noOfSubjects; count++){
            if(grades[count][subjectIndex] == lowestScore){
                lowestStudent = count + 1;
            }
        }
        return lowestStudent;
    }

    public int getSubjectTotal(int subjectIndex){
        int total = 0;
        for(int count = 0; count < noOfSubjects; count++){
            total += grades[count][subjectIndex];
        }
        return total;
    }

    public double getSubjectAverage(int subjectIndex){
        return (double) getSubjectTotal(subjectIndex) / noOfStudents;
    }

    public int getNumberOfSubjectPasses(int subjectIndex){
        int passCounter = 0;
        for(int count = 0; count < noOfSubjects; count++){
            if(grades[count][subjectIndex] >= 45){
                passCounter++;
            }
        }
        return passCounter;
    }

    public int getNumberOfSubjectFailures(int subjectIndex){
        return noOfStudents - getNumberOfSubjectPasses(subjectIndex);
    }


}
