package net.ddns.armen181.diexample.controllers;

import net.ddns.armen181.diexample.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
