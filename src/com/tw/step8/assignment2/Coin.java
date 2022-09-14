package com.tw.step8.assignment2;

import java.util.Arrays;

public class Coin {
  CoinFace[] faces;

  public Coin() {
    this.faces = new CoinFace[]{
      CoinFace.HEAD,
      CoinFace.TAIL
    };
  }

  private long countTails() {
    return Arrays.stream(this.faces).filter(face -> face == CoinFace.TAIL).count();
  }

  public float chanceOfGettingTail() {
    return this.countTails() / 2f;
  }
}
