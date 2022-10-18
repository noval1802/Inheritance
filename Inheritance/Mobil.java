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
public class Mobil extends Vehicle {
  // Atribut
  private String ACModel;

  // Konstruktur
  public Mobil(String name, int speed, String ACModel) {
    super(name, speed);
    this.ACModel = ACModel;
  }

  // getter
  public String getACModel() {
    return ACModel;
  }

  // Setter
  public void setACModel(String aCModel) {
    this.ACModel = aCModel;
  }

  public Mobil() {

  }
}
