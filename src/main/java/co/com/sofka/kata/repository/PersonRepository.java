package co.com.sofka.kata.repository;

import co.com.sofka.kata.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveMongoRepository<Person,String> {

    Mono<Person> findByName(String name);
}

