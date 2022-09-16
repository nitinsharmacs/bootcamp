package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingAttendantTest {
  @Test
  void shouldAssignParkingLotToAttendant() {
    ParkingAttendant attendant = new ParkingAttendant();
    int parkingLotsInHand = attendant.assign(ParkingLot.create(1));

    assertEquals(1, parkingLotsInHand);
  }

  @Test
  void shouldAssignParkingLotsToAttendant() {
    ParkingAttendant attendant = new ParkingAttendant();
    attendant.assign(ParkingLot.create(1));
    int parkingLotsInHand = attendant.assign(ParkingLot.create(1));

    assertEquals(2, parkingLotsInHand);
  }

  @Test
  void shouldParkVehicle() {
    ParkingAttendant attendant = new ParkingAttendant();
    attendant.assign(ParkingLot.create(1));

    assertTrue(attendant.park(new Vehicle()));
  }

  @Test
  void shouldParkVehicleInNextAvailableParkingLot() {
    ParkingAttendant attendant = new ParkingAttendant();
    attendant.assign(ParkingLot.create(1));
    attendant.assign(ParkingLot.create(1));

    assertTrue(attendant.park(new Vehicle()));
    assertTrue(attendant.park(new Vehicle()));
  }


}