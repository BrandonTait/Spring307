package com.example.demo;


import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int passportnumber;
    private String ExpirationDate;

    @OneToOne(mappedBy = "passport")
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassportnumber() {
        return passportnumber;
    }

    public void setPassportnumber(int passportnumber) {
        this.passportnumber = passportnumber;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
