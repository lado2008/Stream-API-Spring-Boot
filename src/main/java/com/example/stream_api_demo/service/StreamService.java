
package com.example.stream_api_demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.stream_api_demo.model.Person;

@Service
public class StreamService {
    public List<String> getEvenNumbersAsString(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    public List<String> getFilteredPersonNames(List<Person> people) {
        return people.stream()
                .filter(p -> p.getAge() > 20)
                .filter(p -> !p.getName().toLowerCase().startsWith("a"))
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
