package org.kaminski.strategy;

public class Queen extends Character {
  public Queen() {
    weapon = new BowAndArrowBehavior();
  }
}
