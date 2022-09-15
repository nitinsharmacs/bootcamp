package com.tw.step8.assignment2.exception;

public class InvalidProbabilityException extends Throwable {
  private final double probability;

  public InvalidProbabilityException(double probability) {
    super();
    this.probability = probability;
  }


  @Override
  public String getMessage() {
    return String.format("Invalid probability %f", this.probability);
  }
}
