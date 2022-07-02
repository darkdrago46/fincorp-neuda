package com.example.udemynew;

import javax.validation.constraints.Size;
import java.util.Date;

public class Client {

    private int id;
    private String name;
    private String gender;
    private int age;
    private int creditScore;
    private boolean loansDefaulted;

    public Client() {
        super();
    }

    public Client(int id, String name, String gender, int age, int creditScore, boolean loansDefaulted) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.creditScore = creditScore;
        this.loansDefaulted = loansDefaulted;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isLoansDefaulted() {
        return loansDefaulted;
    }

    public void setLoansDefaulted(boolean loansDefaulted) {
        this.loansDefaulted = loansDefaulted;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj==null){
            return false;
        }
        Client other = (Client) obj;
        if (id != other.id){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "Client [id=%s, name=%s, gender=%s, age=%s, creditScore=%s, loansDefaulted=%s]", id, name, gender, age, creditScore, loansDefaulted
        );
    }
}
