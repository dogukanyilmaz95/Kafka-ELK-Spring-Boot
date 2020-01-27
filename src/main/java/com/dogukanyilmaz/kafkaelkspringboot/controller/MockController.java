package com.dogukanyilmaz.kafkaelkspringboot.controller;

import com.dogukanyilmaz.kafkaelkspringboot.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dogukanyilmaz
 * Created 27.01.2020
 */
@RestController
@RequestMapping("api")
public class MockController {
    private KafkaService kafkaService;

    @Autowired
    public MockController(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @GetMapping
    public ResponseEntity<?> mock() {
        kafkaService.sendMessage("myTopic", "Message for Rest API");
        return ResponseEntity.ok("myTopic");
    }
}
