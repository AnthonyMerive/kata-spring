package co.com.sofka.kata.service;

import co.com.sofka.kata.Person;
import co.com.sofka.kata.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Flux<Person> listAll(){
        return repository.findAll();
    }
}
