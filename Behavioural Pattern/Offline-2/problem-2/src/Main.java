import Colleuges.Student;
import Colleuges.Teacher;
import ExamScript.ExamScript;
import Mediator.ECOffice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ECOffice ecOffice = new ECOffice();
        ArrayList<Teacher> examiners = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<ExamScript> examScripts = new ArrayList<>();

        examiners.add(new Teacher(ecOffice,0));

        for(int j=0 ; j<5; j++){
            students.add(new Student(ecOffice,j));
        }

        ecOffice.addTeacherList(examiners);
        ecOffice.addStudentList(students);

        for(int i=0; i<students.size(); i++){
            examScripts.add(new ExamScript(students.get(i).getStudentID(),examiners.get(0).getTeacherID()));
        }

        Random random = new Random();
        for(int i=0 ; i< examScripts.size(); i++){
            int marks = random.nextInt(100-40)+40;
            examScripts.get(i).setPrevMarks(marks);
        }

        examiners.get(0).scrutinize(examScripts);  //check exam scripts

        Scanner sc = new Scanner(System.in);
        String s;

        while(true){  //recheck
            System.out.println("Enter student id to apply for recheck:");
            System.out.println("Press Q to exit.");

            s=sc.nextLine();
            if(s.equalsIgnoreCase("Q"))
                break;
            else {
                int id = Integer.parseInt(s);
                if(id<1 || id>5){
                    System.out.println("Invalid Student ID.");
                }
                else {
                    students.get(id-1).recheck();
                }
            }
        }
    }
}
