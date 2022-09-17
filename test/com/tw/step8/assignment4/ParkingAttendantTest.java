package com.tw.step8.assignment4;

import com.tw.step8.assignment4.notifier.Notifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingAttendantTest {
  @Test
  void shouldAssignParkingLotToAttendant() {
    ParkingAttendant attendant = new ParkingAttendant();
    int parkingLotsInHand = attendant.assign(ParkingLot.create(1, new Notifier()));

    assertEquals(1, parkingLotsInHand);
  }

  @Test
  void shouldAssignParkingLotsToAttendant() {
    ParkingAttendant attendant = new ParkingAttendant();
    attendant.assign(ParkingLot.create(1, new Notifier()));
    int parkingLotsInHand = attendant.assign(ParkingLot.create(1, new Notifier()));

    assertEquals(2, parkingLotsInHand);
  }

  @Test
  void shouldParkVehicle() {
    ParkingAttendant attendant = new ParkingAttendant();
    attendant.assign(ParkingLot.create(1, new Notifier()));

    assertTrue(attendant.park(new Vehicle()));
  }

  @Test
  void shouldParkVehicleInNextAvailableParkingLot() {
    ParkingAttendant attendant = new ParkingAttendant();
    attendant.assign(ParkingLot.create(1, new Notifier()));
    attendant.assign(ParkingLot.create(1, new Notifier()));

    assertTrue(attendant.park(new Vehicle()));
    assertTrue(attendant.park(new Vehicle()));
  }


}