import java.util.Scanner;

public class UnderGrad extends Student {
    private final double ASSIGNWT = 0.65;
    private final double DISCWT = 0.25;
    private final double MIDWT = 0.10;
    private double grade;
    private double finalGrade;

    public void WeightGrade() {
        studentGrades();
        double fassignAvg = (getAssignAvg()) * ASSIGNWT;
        double fdiscAvg = (getDiscAvg()) * DISCWT;
        double fmidAvg = (getMidAvg()) * MIDWT;
        grade = fassignAvg + fdiscAvg + fmidAvg;
    }

    public void FinalGrade(String i) {
        double newGrade;
            newGrade = grade + 1;
            setFinalGrade(newGrade);
    }

    public void setFinalGrade(double f) {
        finalGrade = f;
    }

    public double getFinalGrade() {
        return finalGrade;
    }


}
