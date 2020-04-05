package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "virus")
public class Virus {
    @Id
    public int id;
    @Column(name = "Name")
    public String name;
    @Column(name = "Description")
    public String description;
    @Column(name = "Symptoms")
    public String symptoms;
    @Column(name = "Duration")
    public String duration;
    @Column(name = "Mortalityrate")
    public double mortalityrate;
    @Column(name = "Image")
    public String image;


    public Virus(String name, String description,String symptoms, String duration,double mortalityrate, String image) {
        this.name = name;
        this.description = description ;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
        this.image = image;
    }
    public Virus()
    {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {

        this.duration = duration;
    }

    public double getMortalityrate() {

        return mortalityrate;
    }

    public void setMortalityrate(double mortalityrate) {

        this.mortalityrate= mortalityrate;
    }

    public String getImage(){
        return image;}

    public void setImage(String image){
        this.image = image;}


}
