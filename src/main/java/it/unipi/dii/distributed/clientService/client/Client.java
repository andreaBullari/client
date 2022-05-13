package it.unipi.dii.distributed.clientService.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Client {
    @Id
    private String email;
    private String name;
    private String surname;
    private Date dateBirth;
    private int age;

    public Client(String name, String surname, String email, Date dateBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateBirth = dateBirth;
        this.age = 25;
    }

    public Client(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateBirth=" + dateBirth +
                ", age=" + age +
                '}';
    }
}
