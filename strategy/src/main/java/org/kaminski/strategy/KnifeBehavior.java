package org.kaminski.strategy;

public class KnifeBehavior implements WeaponBehavior {
  @Override
  public String useWeapon() {
    return "Fighting with knife!";
  }
}
