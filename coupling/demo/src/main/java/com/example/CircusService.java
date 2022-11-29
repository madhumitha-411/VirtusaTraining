package com.example;

public class CircusService {
    
    private AnimalHandler handler = null;    //coded to an interface
    
    public CircusService(AnimalHandler handler) {
        this.handler = handler;
        System.out.println("cs1st");
    }
    
    public void process() {
        System.out.println("cs2");
        handler.handle();
    }
 
    public static void main(String[] args) {
        AnimalHelper helper = new LionHelper();
        System.out.println("3");
        AnimalHandler handler = new LionHandler(helper);
        System.out.println("4");
        CircusService service = new CircusService(handler);
        System.out.println("5");
        service.process();    
    }
}