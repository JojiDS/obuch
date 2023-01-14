package entities;

import org.springframework.stereotype.Component;

public class Dog {
    private String name = "Бобка";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
