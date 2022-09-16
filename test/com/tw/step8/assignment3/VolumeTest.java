package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
  @Test
  void shouldCompareTwoVolumesInSameUnit() {
    Volume volume1 = Volume.create(1, VolumeUnit.LT);
    Volume volume2 = Volume.create(2, VolumeUnit.LT);

    assertEquals(-1, volume1.compare(volume2));
    assertEquals(1, volume2.compare(volume1));
  }

  @Test
  void shouldCompareTwoVolumesInDifferentUnits() {
    Volume volume1 = Volume.create(2, VolumeUnit.GAL);
    Volume volume2 = Volume.create(3.78, VolumeUnit.LT);

    assertEquals(1, volume1.compare(volume2));
    assertEquals(-1, volume2.compare(volume1));
  }

  @Test
  void shouldCompareTwoEqualVolumesInSameUnit() {
    Volume volume1 = Volume.create(1, VolumeUnit.LT);
    Volume volume2 = Volume.create(1, VolumeUnit.LT);

    assertEquals(0, volume1.compare(volume2));
  }

  @Test
  void shouldCompareTwoEqualVolumesInDifferentUnits() {
    Volume volume1 = Volume.create(1, VolumeUnit.GAL);
    Volume volume2 = Volume.create(3.78, VolumeUnit.LT);

    assertEquals(0, volume1.compare(volume2));
  }

  @Test
  void shouldAddTwoVolumesOfDifferentUnits() {
    Volume volume1 = Volume.create(1, VolumeUnit.GAL);
    Volume volume2 = Volume.create(1, VolumeUnit.LT);

    Volume expectedVolume = Volume.create(4.78, VolumeUnit.LT);

    assertEquals(expectedVolume.toLiter(), volume1.add(volume2).toLiter(), 0.1);
  }
}