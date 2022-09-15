package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbabilityException;

import java.util.Objects;

public class Chance {
  private final double probability;

  private Chance(double probability) {
    this.probability = probability;
  }

  public static Chance createChance(double probability) throws InvalidProbabilityException {
    if (probability < 0 || probability > 1) {
      throw new InvalidProbabilityException();
    }

    return new Chance(probability);
  }

  public Chance not() {
    return new Chance(1 - this.probability);
  }

  public Chance and(Chance chance) throws InvalidProbabilityException {
    return Chance.createChance(this.probability * chance.probability);
  }

  public Chance or(Chance anotherChance) throws InvalidProbabilityException {
    Chance not1 = this.not();
    Chance not2 = anotherChance.not();

    return not1.and(not2).not();
  }

  public boolean isWithin(Chance anotherChance, double delta) {
    double valueDifference = Math.abs(this.probability - anotherChance.probability);

    return valueDifference <= delta;
  }

  @Override
  public String toString() {
    return "Chance{" +
      "probability=" + probability +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Chance chance = (Chance) o;
    return Double.compare(chance.probability, probability) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(probability);
  }

}
