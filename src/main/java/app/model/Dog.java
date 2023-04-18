package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    void say() {

    }
    public Dog() {
    }

    @Override
    public String toString() {
        return "I'm a dog";
    }
}