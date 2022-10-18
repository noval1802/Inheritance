package Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Noval
 */

public class Main {

  public Main() {
      Biodata i = new Biodata("Abdul Aziz Anaoval", 312010049);
      Motor m = new Motor("Yamaha RX-KING", 135);
      Mobil c = new Mobil("Suzuli S-cros", 1500, "Panasonic");
      System.out.println("Daftar Kendaraan Rumah");
      System.out.println(i.getNamaMhs() + " " + i.getNimMhs());
      System.out.println(c.getName() + " " + c.getSpeed() + " " + c.getACModel());
      System.out.println(m.getName() + " " + m.getSpeed());

  }

  public static void main(String[] args) {
      // TODO code application logic here
      new Main();
  }
}
