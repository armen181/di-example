package net.ddns.armen181.diexample.controllers;

import net.ddns.armen181.diexample.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
