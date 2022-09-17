package com.tw.step8.assignment4;

import com.tw.step8.assignment4.notifier.EventData;
import com.tw.step8.assignment4.notifier.Notifier;

// TODO : remove this parkingArea list and create entity
public class ParkingLot implements Parkable {
  private final Vehicle[] parkingArea;
  private int position;
  private final Notifier notifier;

  private ParkingLot(Vehicle[] parkingArea, Notifier notifier) {
    this.parkingArea = parkingArea;
    this.notifier = notifier;
    this.position = 0;
  }

  public static ParkingLot create(int parkingLotSize, Notifier notifier) {
    return new ParkingLot(new Vehicle[parkingLotSize], notifier);
  }

  public int add(Vehicle vehicle) {
    this.parkingArea[this.position] = vehicle;
    this.position += 1;

    this.notifier.emit("add", new EventData(this.occupancy()));

    return this.position;
  }

  public boolean isFull() {
    return this.position >= this.parkingArea.length;
  }

  public double occupancy() {
    return this.position / (double) this.parkingArea.length;
  }

  public int remove() {
    this.position -= 1;
    this.parkingArea[this.position] = null;

    this.notifier.emit("remove", new EventData(this.occupancy()));

    return this.position;
  }
}
