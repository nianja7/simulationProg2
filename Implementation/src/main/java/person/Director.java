package person;

import enums.Function;

public class Director extends Employee{
    public Director(String name, Function function) {
        this.name=name;
    this.function=Function.DIRECTOR;
    }
}
