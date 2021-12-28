package co.com.sofka.kata;

import org.springframework.data.annotation.Id;

public class Person {

    @Id
    private int id;
    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
