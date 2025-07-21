package com.example.stream_api_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stream_api_demo.model.Person;
import com.example.stream_api_demo.service.StreamService;

@RestController
@RequestMapping("/api/stream")
public class StreamController {

    @Autowired
    private StreamService streamService;

    @PostMapping("/even")
    public List<String> getEvenNumbers(@RequestBody List<Integer> numbers) {
        return streamService.getEvenNumbersAsString(numbers);
    }

    @PostMapping("/persons")
    public List<String> getFilteredNames(@RequestBody List<Person> people) {
        return streamService.getFilteredPersonNames(people);
    }
}
