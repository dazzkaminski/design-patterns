package org.kaminski.strategy;

public abstract class Character {
  public WeaponBehavior weapon;

  public Character() {}

  public String fight() {
    return weapon.useWeapon();
  }

  public void setWeapon(WeaponBehavior weapon) {
    this.weapon = weapon;
  }
}
