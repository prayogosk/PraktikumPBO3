
package com.prayogo.praktikumpbo3.praktikumpbo3.animal;


public class Animal {
    //attribute
    String name;
    int age;
    String color;
    
    //constraktor
    public Animal(String name, int age, String color){
    this.name = name;
    this.age = age;
    this.color = color;
    }
    
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Nama : "+name);
        System.out.println("Age : "+age+" years old");
        System.out.println("Color : "+color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
