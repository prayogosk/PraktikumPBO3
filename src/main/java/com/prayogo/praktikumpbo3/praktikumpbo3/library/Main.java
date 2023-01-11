
package com.prayogo.praktikumpbo3.praktikumpbo3.library;

public class Main {
    public static void main(String[] args) {
        Library sys = new Library("SYS Library", 60, 2012);
        Library ittp = new Library("ITTP Library", 30, 2017);
    
    
        sys.showProfile();
        ittp.showProfile();

        System.out.println("Name (before) : "+ sys.getName());
        sys.setName("Perpustakaan STIKom");
        System.out.println("Name (After) : "+ sys.getName());

        System.out.println("visitsToday (before) : "+ sys.getVisitsToday());
        sys.setVisitsToday(55); 
        System.out.println("visitsToday (After) : "+ sys.getVisitsToday());

        System.out.println("yearsBuild (before) : "+ sys.getYearsBuild());
        sys.setYearsBuild(2018);
        System.out.println("visitsToday (After) : "+ sys.getYearsBuild());
    }
}
