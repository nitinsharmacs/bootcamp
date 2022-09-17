package com.tw.step8.assignment4;

import com.tw.step8.assignment4.notifier.EventData;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingAttendant implements Observer {
  final List<Parkable> parkingLots;
  private int parkingLotIndex;

  public ParkingAttendant() {
    this.parkingLots = new ArrayList<>();
    this.parkingLotIndex = 0;
  }

  public int assign(Parkable parkable) {
    parkingLots.add(parkable);

    return parkingLots.size();
  }

  public boolean park(Vehicle vehicle) {
    Parkable parkingLot = parkingLots.get(this.parkingLotIndex);

    if (parkingLot.isFull()) {
      this.parkingLotIndex += 1;
    }

    if (this.parkingLots.size() <= this.parkingLotIndex) {
      return false;
    }

    Parkable emptyParkingLot = parkingLots.get(this.parkingLotIndex);
    emptyParkingLot.add(vehicle);

    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParkingAttendant that = (ParkingAttendant) o;
    return parkingLotIndex == that.parkingLotIndex && Objects.equals(parkingLots, that.parkingLots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parkingLots, parkingLotIndex);
  }

  @Override
  public void inform(EventData data) {
    // do something
  }
}
