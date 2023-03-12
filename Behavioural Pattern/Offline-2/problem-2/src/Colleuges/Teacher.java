package Colleuges;

import ExamScript.ExamScript;
import Mediator.ECOffice;

import java.util.ArrayList;
import java.util.Random;

public class Teacher implements Colleague{
    private int teacherID;
    private ECOffice ecOffice;
    private ArrayList<ExamScript>unchecked;
    private ArrayList<ExamScript>checked;

    public Teacher(ECOffice office, int id){
        this.teacherID = id;
        this.ecOffice = office;
        checked = new ArrayList<ExamScript>();
    }

    public int getTeacherID() { return teacherID; }

    @Override
    public void receive(ExamScript examScript) {
       checked.add(examScript);
        System.out.println("Examiner ID: " + (teacherID+1) + " has received exam script to recheck.");
        recheck();
    }

    public void scrutinize(ArrayList<ExamScript> u){
        this.unchecked = u;

        //probability 60% of mistake
        Random random = new Random();
        for(int i=0 ; i< unchecked.size() ; i++){
            int marks = unchecked.get(i).getPrevMarks();
            int r = random.nextInt(10000000);
            int m = r % 10;
            if(m < 4){
                unchecked.get(i).setCorrectedMarks(marks);
            }
            else {
                unchecked.get(i).setCorrectedMarks(marks - 2);
            }
        }

        //must mistake
        int index = random.nextInt(unchecked.size());
        int marks = unchecked.get(index).getCorrectedMarks();
        unchecked.get(index).setCorrectedMarks(marks + 2);

        ecOffice.notify(this,unchecked);

        unchecked.clear();
    }

    public void recheck(){
        if(checked.size()==0){
            System.out.println("Examiner ID: " + (teacherID+1) + " has no script to recheck.");
            return;
        }

        Random random = new Random();
        for(int i=0 ; i< checked.size() ; i++){
            int marks = checked.get(i).getCorrectedMarks();
            int r = random.nextInt(10000000);
            int m = r % 10;
            if(m < 1 && marks < 95){  //10% case of mark increase
                checked.get(i).setPrevMarks(marks);
                checked.get(i).setCorrectedMarks(marks + 5);
            }
            else if(m < 4 && marks > 40){  //30% case of mark decrease
                checked.get(i).setPrevMarks(marks);
                checked.get(i).setCorrectedMarks(marks - 5);
            }
            else {
                checked.get(i).setPrevMarks(marks); //60% case of marks unchanged
                checked.get(i).setCorrectedMarks(marks);
            }
            checked.get(i).setCheckFlag(true);
        }

        ecOffice.notify(this,checked);
        checked.clear();

    }
}
