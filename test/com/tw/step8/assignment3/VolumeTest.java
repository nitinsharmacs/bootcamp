package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
  @Test
  void shouldCompareTwoVolumes() {
    Volume volume1 = Volume.create(1, Unit.LT, 1, Unit.GAL);
    Volume volume2 = Volume.create(1, Unit.LT, 2, Unit.GAL);

    assertEquals(volume1.compare(volume2), -1);
    assertEquals(volume2.compare(volume1), 1);
  }

  @Test
  void shouldCompareTwoEqualVolumes() {
    Volume volume1 = Volume.create(1, Unit.LT, 2, Unit.GAL);
    Volume volume2 = Volume.create(1, Unit.LT, 2, Unit.GAL);

    assertEquals(volume1.compare(volume2), 0);
  }

  @Test
  void shouldAddTwoVolumesOfDifferentUnits() {
    Volume volume1 = Volume.create(1, Unit.GAL);
    Volume volume2 = Volume.create(1, Unit.LT);

    Volume expectedVolume = Volume.create(4.78, Unit.LT);

    assertEquals(expectedVolume.toLiter(), volume1.add(volume2).toLiter(), 0.1);
  }
}