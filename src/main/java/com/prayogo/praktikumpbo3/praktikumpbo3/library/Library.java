
package com.prayogo.praktikumpbo3.praktikumpbo3.library;


public class Library {
    private String name;
    private int visitsToday;
    private int yearsBuild;

    public Library(String name, int visitsToday, int yearsBuild) {
        this.name = name;
        this.visitsToday = visitsToday;
        this.yearsBuild = yearsBuild;
    }
    
    public void showProfile(){
        System.out.println("Nama : "+name);
        System.out.println("visitsToday : "+visitsToday);
        System.out.println("yearsBuild : "+yearsBuild);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitsToday() {
        return visitsToday;
    }

    public void setVisitsToday(int VisitsToday) {
        this.visitsToday = VisitsToday;
    }

    public int getYearsBuild() {
        return yearsBuild;
    }

    public void setYearsBuild(int YearsBuild) {
        this.yearsBuild = YearsBuild;
    }
  
}
