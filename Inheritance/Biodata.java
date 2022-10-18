package Inheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noval
 */
// Class
public class Biodata extends Vehicle {
  // Atribut
  private String NamaMhs;
  private int NimMhs;

  // Konstruktur
  public Biodata(String NamaMhs, int NimMhs) {
    super(NamaMhs, NimMhs);
    this.NamaMhs = NamaMhs;
    this.NimMhs = NimMhs;
  }

  // Getter
  public String getNamaMhs() {
    return NamaMhs;
  }

  // Setter
  public void setNamaMhs(String namaMhs) {
    this.NamaMhs = namaMhs;
  }
  // Getter

  public int getNimMhs() {
    return NimMhs;
  }

  // Setter
  public void setNimMhs(int nimMhs) {
    this.NimMhs = nimMhs;
  }

  public Biodata() {

  }
}
