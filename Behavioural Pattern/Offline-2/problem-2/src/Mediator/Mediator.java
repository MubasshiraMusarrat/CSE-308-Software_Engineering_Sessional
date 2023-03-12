package Mediator;

import Colleuges.Colleague;
import ExamScript.ExamScript;

import java.util.ArrayList;

public interface Mediator {
    public void notify(Colleague colleague, ArrayList<ExamScript> examScripts);
}
