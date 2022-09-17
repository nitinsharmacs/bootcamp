package com.tw.step8.assignment4;

import com.tw.step8.assignment4.notifier.EventData;
import com.tw.step8.assignment4.notifier.Notifier;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldParkAVehicleAtAvailableSpot() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = ParkingLot.create(4, notifier);
    int position = parkingLot.add(new Vehicle());

    assertEquals(1, position);
  }

  @Test
  void shouldParkTwoVehicleOnAvailableSpots() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = ParkingLot.create(4, notifier);
    int position1 = parkingLot.add(new Vehicle());
    int position2 = parkingLot.add(new Vehicle());

    assertEquals(1, position1);
    assertEquals(2, position2);
  }

  @Test
  void shouldRemoveVehicleFromLastOccupiedSpot() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = ParkingLot.create(4, notifier);

    parkingLot.add(new Vehicle());
    parkingLot.add(new Vehicle());

    int position = parkingLot.remove();
    assertEquals(1, position);
  }

  @Test
  void shouldDetermineIfParkingLotIsFull() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = ParkingLot.create(1, notifier);
    parkingLot.add(new Vehicle());

    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldDetermineIfParkingLotIsNotFull() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = ParkingLot.create(2, notifier);
    parkingLot.add(new Vehicle());

    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldNotifyOnAddingVehicleInParkingLot() {
    Notifier notifier = new Notifier();

    AtomicBoolean isCalled = new AtomicBoolean(false);
    notifier.on("add", (EventData occupancy) -> {
      isCalled.set(true);
    });

    ParkingLot parkingLot = ParkingLot.create(2, notifier);
    parkingLot.add(new Vehicle());
    parkingLot.add(new Vehicle());
    assertTrue(isCalled.get());
  }

  @Test
  void shouldNotifyOnVehicleRemoval() {
    Notifier notifier = new Notifier();

    AtomicBoolean isCalled = new AtomicBoolean(false);
    notifier.on("remove", (EventData occupancy) -> {
      isCalled.set(true);
    });

    ParkingLot parkingLot = ParkingLot.create(5, notifier);
    parkingLot.add(new Vehicle());
    parkingLot.add(new Vehicle());
    parkingLot.add(new Vehicle());

    parkingLot.remove();

    assertTrue(isCalled.get());
  }
}

