package co.com.sofka.kata.controller;

import co.com.sofka.kata.Person;
import co.com.sofka.kata.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping
    public Mono<Void> post(@RequestBody Mono<Person> personMono){
        return personMono.flatMap(personService::insert);
    }

    @GetMapping("/{id}")
    public Mono<Person> getPerson(@PathVariable("id") String id){
        return Mono.just(new Person());
    }

    @PutMapping
    public Mono<Void> update(@RequestBody Mono<Person> personMono){
        return Mono.empty();
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return Mono.empty();
    }

    @GetMapping
    public Flux<Person> list(){
        return personService.listAll();
    }
}
