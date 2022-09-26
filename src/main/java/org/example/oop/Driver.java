package org.example.oop;

public class Driver {
    private String name;
    private String age;

    public void drive(){
        System.out.println("I am driving very fast");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
