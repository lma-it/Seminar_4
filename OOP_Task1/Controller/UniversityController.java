package OOP_Task1.controller;

import OOP_Task1.service.UniversityService;


public class UniversityController {

    public void start(){
        new UniversityService().menu();
    }
}
