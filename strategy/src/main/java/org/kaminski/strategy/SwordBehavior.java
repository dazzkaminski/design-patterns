package org.kaminski.strategy;

public class SwordBehavior implements WeaponBehavior {
  @Override
  public String useWeapon() {
    return "Fighting with sword!";
  }
}
