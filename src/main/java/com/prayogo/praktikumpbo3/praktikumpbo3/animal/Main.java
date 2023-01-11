
package com.prayogo.praktikumpbo3.praktikumpbo3.animal;


public class Main {
    public static void main(String[] args) {
       //Membuat object dari class animal
       Animal cat = new Animal("Miyu", 2, "Black \n");
       Animal dog = new Animal("Pit Bull", 2, "White \n");
       
       /*Mengisi nilai attribute object 'cat'
       cat.name = "Miyu";
       cat.age = 3;
       cat.color = "Black";
       
       //Mengisi nilai attribute object 'dog'
       dog.name = "Pit Bull";
       dog.age = 2;
       dog.color = "White";*/
       
       //memanggil method
       cat.showProfile();
       dog.showProfile();
       System.out.println("Dog's name (before) : "+ dog.getName());
       dog.setName("Doggy");
       System.out.println("Dog's name (After) : "+ dog.getName());
    }
}
