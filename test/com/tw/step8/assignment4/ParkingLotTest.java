package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldParkACarAtAvailableSpot() {
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
}