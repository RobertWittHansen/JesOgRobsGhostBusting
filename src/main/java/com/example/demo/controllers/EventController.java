package com.example.demo.controllers;

import com.example.demo.EventService.Event1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class EventController
{
    private ArrayList<String> events;

    @GetMapping("/event")
    public String event()
    {
        return "event";
    }

    @PostMapping("/sign-up")
    public String cerateNewUser(@RequestParam("fname") String fname, @RequestParam("lname") String lname,@RequestParam("date") String date)
    {
        Event1 event = new Event1(fname, lname, date);
        events.add(event.date);
        return "redirect:/event"; // sender det til en anden URL
    }

    // Showing how to create a form using thymeleaf
    @GetMapping(value = "/submit")
    @ResponseBody
    public String renderForm() {
        return "submit";
    }




}
