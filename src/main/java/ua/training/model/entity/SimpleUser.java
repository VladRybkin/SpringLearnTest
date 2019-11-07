package ua.training.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "simpleusers")
public class SimpleUser {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String name;

    public SimpleUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
