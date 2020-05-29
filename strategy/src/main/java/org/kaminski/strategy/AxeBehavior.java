package org.kaminski.strategy;

public class AxeBehavior implements WeaponBehavior {
  @Override
  public String useWeapon() {
    return "Fighting with axe!";
  }
}
