public class Grad extends Student {
    private final double ASSIGNWT = 0.40;
    private final double DISCWT = 0.15;
    private final double MIDWT = 0.15;
    private final double THESISWT = 0.30;
    private double grade;
    private double finalGrade;

    public Grad() {
    }

    public void weightedGrade() {
        studentGrades();
        double faAvg = (getAssignAvg()) * ASSIGNWT;
        double fdAvg = (getDiscAvg()) * DISCWT;
        double fmAvg = (getMidAvg()) * MIDWT;
        grade = faAvg + fdAvg + fmAvg;
    }

    public void FinalGrade(double t, String i) {
        double ftAvg = t * THESISWT;
        grade += ftAvg;
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
