package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldParkAVehicleAtAvailableSpot() {
    ParkingLot parkingLot = ParkingLot.create(4);
    int position = parkingLot.add(new Vehicle());

    assertEquals(1, position);
  }

  @Test
  void shouldParkTwoVehicleOnAvailableSpots() {
    ParkingLot parkingLot = ParkingLot.create(4);
    int position1 = parkingLot.add(new Vehicle());
    int position2 = parkingLot.add(new Vehicle());

    assertEquals(1, position1);
    assertEquals(2, position2);
  }

  @Test
  void shouldDetermineIfParkingLotIsFull() {
    ParkingLot parkingLot = ParkingLot.create(1);
    parkingLot.add(new Vehicle());

    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldDetermineIfParkingLotIsNotFull() {
    ParkingLot parkingLot = ParkingLot.create(2);
    parkingLot.add(new Vehicle());

    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldAddParkingAttendant() {
    ParkingLot parkingLot = ParkingLot.create(1);
    ParkingAttendant attendant = new ParkingAttendant();
    parkingLot.assignAttendant(attendant);

    assertTrue(parkingLot.hasAttendant(attendant));
  }

  @Test
  void shouldAssignParkingAttendant() {
    ParkingAttendant attendant = new ParkingAttendant();
    ParkingLot parkingLot = ParkingLot.create(4);

    int totalAttendants = parkingLot.assignAttendant(attendant);

    assertEquals(1, totalAttendants);
  }
}

