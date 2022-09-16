package com.tw.step8.assignment4;

import java.util.ArrayList;
import java.util.List;

// TODO : remove this parkingArea list and create entity
public class ParkingLot implements Parkable {
  private final Vehicle[] parkingArea;
  private int position;
  private final List<ParkingAttendant> attendants;
  private final Notifier notifier;

  private ParkingLot(Vehicle[] parkingArea, ArrayList<ParkingAttendant> attendants, Notifier notifier) {
    this.parkingArea = parkingArea;
    this.attendants = attendants;
    this.notifier = notifier;
    this.position = 0;
  }

  public static ParkingLot create(int parkingLotSize) {
    return new ParkingLot(new Vehicle[parkingLotSize], new ArrayList<>(), new Notifier());
  }

  public int assignAttendant(ParkingAttendant attendant) {
    this.attendants.add(attendant);
    attendant.assign(this);

    this.notifier.on("full", attendant);

    return this.attendants.size();
  }

  public int add(Vehicle vehicle) {
    this.parkingArea[this.position] = vehicle;
    this.position += 1;

    if (this.isFull()) {
      this.notifier.emit("full");
    }

    return this.position;
  }

  public boolean isFull() {
    return this.position >= this.parkingArea.length;
  }

  public boolean hasAttendant(ParkingAttendant attendant) {
    return this.attendants.contains(attendant);
  }
}
