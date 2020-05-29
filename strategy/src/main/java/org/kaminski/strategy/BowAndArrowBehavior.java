package org.kaminski.strategy;

public class BowAndArrowBehavior implements WeaponBehavior {
  @Override
  public String useWeapon() {
    return "Fighting with bow and arrows!";
  }
}
