package co.com.sofka.kata.repository;

import co.com.sofka.kata.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PersonRepository extends ReactiveMongoRepository<Person,String> {


}

