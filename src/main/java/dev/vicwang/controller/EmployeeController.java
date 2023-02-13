package dev.vicwang.controller;

import dev.vicwang.event.EmailEvent;
import dev.vicwang.publisher.EmailPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmailPublisher emailPublisher;

    @GetMapping("/notify/event")
    public void publishEvent(){
        emailPublisher
                .publishEmailEvent
                    (new EmailEvent("Employee added."));

        emailPublisher
                .publishMsgEvent
                        ("Exception occurred.");
    }
}
