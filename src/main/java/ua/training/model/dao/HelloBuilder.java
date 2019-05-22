package ua.training.model.dao;

public class HelloBuilder {
    private int age;
    private String name;
    private String adress;

    public HelloBuilder() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public HelloBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public HelloBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HelloBuilder withAdress(String adress) {
        this.adress = adress;
        return this;
    }

    @Override
    public String toString() {
        return "HelloBuilder{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
