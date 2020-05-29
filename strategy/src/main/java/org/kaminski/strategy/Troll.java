package org.kaminski.strategy;

public class Troll extends Character {
  public Troll() {
    weapon = new AxeBehavior();
  }
}
