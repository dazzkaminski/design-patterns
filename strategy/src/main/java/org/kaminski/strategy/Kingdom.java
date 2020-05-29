package org.kaminski.strategy;

public class Kingdom {
  public static void main(String[] args) {
    Character king = new King();
    System.out.println(king.fight());
    king.setWeapon(new AxeBehavior());
    System.out.println(king.fight());
  }
}
