package com.tw.step8.assignment4;

public class ParkingLot {
  Vehicle[] parkingArea;
  private int position;

  private ParkingLot(int parkingLotSize) {
    this.parkingArea = new Vehicle[parkingLotSize];
    this.position = 0;
  }

  public static ParkingLot create(int parkingLotSize) {
    return new ParkingLot(parkingLotSize);
  }

  public int add(Vehicle vehicle) {
    this.parkingArea[this.position] = vehicle;
    return ++this.position;
  }

  public boolean isFull() {
    return this.position >= this.parkingArea.length;
  }
}
