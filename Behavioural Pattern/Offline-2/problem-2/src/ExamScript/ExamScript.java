package ExamScript;

public class ExamScript {
    private int studentID;
    private int teacherID;
    private int prevMarks;
    private int correctedMarks;
    private boolean checkFlag;

    public ExamScript(int id1, int id2){
        this.studentID = id1;
        this.teacherID = id2;
        prevMarks = 0;
        correctedMarks = 0;
        checkFlag = false;
    }

    public int getStudentID() { return studentID;}

    public int getTeacherID() { return teacherID;}

    public void setPrevMarks(int marks) { this.prevMarks = marks; }
    public int getPrevMarks() { return prevMarks; }

    public void setCorrectedMarks(int marks) { this.correctedMarks = marks; }
    public int getCorrectedMarks() { return correctedMarks; }

    public void setCheckFlag(boolean check) { this.checkFlag = check; }
    public boolean getCheckFlag() { return checkFlag; }
}
