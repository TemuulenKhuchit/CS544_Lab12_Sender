package edu.miu.cs544.temuulen.lab12_sender.controller;

import edu.miu.cs544.temuulen.lab12_sender.service.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

    @Autowired
    Sender sender;

    @GetMapping(path = "/hello")
    public String hello() {
        sender.send("Hello World!");
        return "Hello World!";
    }

    edu.miu.cs544.temuulen.lab12_sender.entity.Student student = new edu.miu.cs544.temuulen.lab12_sender.entity.Student(1l, "Temuulen");

    @GetMapping(path = "/hello/{student}")
    public String helloStudent(@PathVariable edu.miu.cs544.temuulen.lab12_sender.entity.Student student) {
        sender.send("Hello " + student);
        return "Hello " + student;
    }

}