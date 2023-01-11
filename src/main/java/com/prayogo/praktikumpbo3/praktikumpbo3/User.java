/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo3.praktikumpbo3;

/**
 *
 * @author PRAYOGO
 */
import java.util.Scanner;
public class User {
 //variabel untuk menginput nilai dan method
  static final Scanner in = new Scanner(System.in);
  static String userlogin, pwlogin;
 
  static String userLogin(){
    System.out.print("Username = ");
    userlogin = in.nextLine();
    return userlogin;
  }
 
  static String pwLogin(){
    System.out.print("Password = ");
    pwlogin = in.nextLine();
    return pwlogin;
  }

  public static void main(String[] args) {
// Variabel untuk menyimpan nama, username, password, dan konfirmasi password
      String nama, username, pass, ulangi_pass;
      boolean regist = true;
// Struktur perulangan while untuk registrasi akun
      while(regist){
         System.out.print("Nama Lengkap = ");
         nama = in.nextLine();

         System.out.print("Username = ");
         username = in.nextLine();

         System.out.print("Password = ");
         pass = in.nextLine();
 
         System.out.print("Ulangi Password = ");
         ulangi_pass = in.nextLine();
 //Pengkondisian untuk registrasi pada password
         if(ulangi_pass.equals(pass)){
            regist = false;
            System.out.println("Registrasi Berhasil\nLoginUser");
          
// Perulangan untuk membatasi kesalahan inputan user sebanyak 3x
            for(int i = 3;i >= 1; i-- ){
 
            if(userLogin().equals(username) && pwLogin().equals(pass)){
              System.out.println("Selamat Datang ADMIN");
              break;
            } 
            else if( i == 1 ){
              System.out.println("Anda sudah 3x salah, tunggu 5 menit untuk login kembali");
            }
            else {
              System.out.println("Username atau password salah, silakan login kembali " + "(kesempatan login "+(i-1)+"x lagi)");
            }
         }
      } else {
          System.out.println("Gagal");
    } 
   }
  }
}

