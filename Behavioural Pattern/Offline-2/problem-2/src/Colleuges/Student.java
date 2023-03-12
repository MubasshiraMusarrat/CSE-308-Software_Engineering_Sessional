package Colleuges;

import ExamScript.ExamScript;
import Mediator.ECOffice;

import java.util.ArrayList;

public class Student implements Colleague{
    private int studentID;
    private ECOffice ecOffice;
    private ExamScript examScript;

    public Student(ECOffice office, int id){
        this.studentID = id;
        this.ecOffice = office;
    }

    public int getStudentID() { return studentID;}

    @Override
    public void receive(ExamScript Script) {
        this.examScript = Script;
        System.out.println("Student ID: " + (studentID+1) + " has received marks: " + examScript.getCorrectedMarks());
    }

    public void recheck(){
        if(examScript == null){
            System.out.println("Student ID: " + (studentID+1) + "Hasn't received any marks yet.");
            return;
        }

        System.out.println("Student ID: " + (studentID+1) + " has applied for recheck.");
        ArrayList<ExamScript> scripts = new ArrayList<ExamScript>();
        scripts.add(examScript);
        ecOffice.notify(this,scripts);
    }
}
