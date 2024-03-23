package behavioral.template_method;

import behavioral.template_method.model.CarWorkshop;
import behavioral.template_method.model.ElectronicWorkshop;
import behavioral.template_method.model.MeetWorkshop;
import behavioral.template_method.model.ToyWorkshop;

/*
* Pattern Template Method define skeleton of algorithm in super class
* but allow to redefine it in subclasses
*/
public class Main {
    public static void main(String[] args) {
        new CarWorkshop().create();
        new ElectronicWorkshop().create();
        new MeetWorkshop().create();
        new ToyWorkshop().create();
    }
}
