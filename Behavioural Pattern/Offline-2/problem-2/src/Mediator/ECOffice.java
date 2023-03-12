package Mediator;

import Colleuges.*;
import ExamScript.ExamScript;

import java.util.ArrayList;

public class ECOffice implements Mediator{
    private ArrayList<Teacher> examiners;
    private ArrayList<Student> students;

    public ECOffice(){
    }

    public void addTeacher(Teacher t) { examiners.add(t); }
    public void addTeacherList(ArrayList<Teacher> t) { this.examiners = t; }

    public void addStudent(Student s) { students.add(s); }
    public void addStudentList(ArrayList<Student> s) { this.students = s; }

    public void removeTeacher( Teacher t) {
        int i = examiners.indexOf(t);
        if (i >= 0) {
            System.out.println("Teacher ID: "+ (t.getTeacherID()+1) +" removed.");
            examiners.remove(i);
        } else {
            System.out.println("No teacher with this ID.");
        }
    }

    public void removeStudent( Student s){
        int i = students.indexOf(s);
        if (i >= 0) {
            System.out.println("Student ID: "+ (s.getStudentID()+1) +" removed.");
            students.remove(i);
        } else {
            System.out.println("No student with this ID.");
        }
    }

    @Override
    public void notify(Colleague colleague, ArrayList<ExamScript> examScripts) {
        if(colleague instanceof Teacher){
            if(!examScripts.get(0).getCheckFlag()){
                publish(examScripts);
            }
            else {
                rechecked(examScripts);
            }
            for(int i=0 ; i<examScripts.size(); i++){
                int index = examScripts.get(i).getStudentID();
                students.get(index).receive(examScripts.get(i));
            }
        }

        else if(colleague instanceof Student){
            System.out.println("Script of student ID: "+ (examScripts.get(0).getStudentID()+1) +" has been sent to Teacher ID: "+ (examScripts.get(0).getTeacherID()+1));
            int index = examScripts.get(0).getTeacherID();
            examiners.get(index).receive(examScripts.get(0));
        }

        else {
            System.out.println("Something went wrong.");
        }
    }

    public void publish(ArrayList<ExamScript> examScripts){
        System.out.println("Scripts checked by Teacher ID: "+ (examScripts.get(0).getTeacherID()+1));
        for(int i=0; i<examScripts.size();i++){
            System.out.println("Student ID: " + (examScripts.get(i).getStudentID()+1) + " marks: " +examScripts.get(i).getCorrectedMarks());
        }
        System.out.println("Mistakes:");
        for(int i=0; i<examScripts.size();i++){
            if(examScripts.get(i).getPrevMarks() != examScripts.get(i).getCorrectedMarks()){
                System.out.println("Student ID: " + (examScripts.get(i).getStudentID()+1) + " marks: " +examScripts.get(i).getCorrectedMarks());
                System.out.println("Actual marks: "+examScripts.get(i).getPrevMarks());
                examScripts.get(i).setCorrectedMarks(examScripts.get(i).getPrevMarks());
            }
        }
    }

    public void rechecked(ArrayList<ExamScript> examScripts){
        System.out.println("Scripts checked by Teacher ID: "+ (examScripts.get(0).getTeacherID()+1));
        for(int i=0; i<examScripts.size(); i++){
            System.out.print("Student ID: "+ (examScripts.get(i).getStudentID()+1));
            int prev = examScripts.get(i).getPrevMarks();
            int curr = examScripts.get(i).getCorrectedMarks();
            if( prev < curr){
                System.out.println(": marks have increased.");
            }
            else if(prev > curr){
                System.out.println(": marks have decreased.");
            }
            else {
                System.out.println(": marks are unchanged.");
            }
            System.out.println("Previous marks: "+prev);
            System.out.println("Current marks: "+curr);
        }
    }
}
