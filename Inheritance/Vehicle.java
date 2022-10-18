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
public class Vehicle {

  // Atribut
  private String name;
  private int speed;

  // Konstruktur
  public Vehicle(String name, int speed) {
    super();
    this.name = name;
    this.speed = speed;

  }
// Getter
  public String getName() {
    return name;
  }
// Setter
  public void setName(String name) {
    this.name = name;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public Vehicle() {
    // TODO Auto-generated constructor stub

  }

}
