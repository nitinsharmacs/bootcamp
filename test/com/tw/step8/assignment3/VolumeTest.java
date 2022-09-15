package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
  @Test
  void shouldCompareTwoVolumes() {
    Volume volume1 = Volume.create(1, VolumeUnit.LT, 1, VolumeUnit.GAL);
    Volume volume2 = Volume.create(1, VolumeUnit.LT, 2, VolumeUnit.GAL);

    assertEquals(volume1.compare(volume2), -1);
    assertEquals(volume2.compare(volume1), 1);
  }

  @Test
  void shouldCompareTwoEqualVolumes() {
    Volume volume1 = Volume.create(1, VolumeUnit.LT, 2, VolumeUnit.GAL);
    Volume volume2 = Volume.create(1, VolumeUnit.LT, 2, VolumeUnit.GAL);

    assertEquals(volume1.compare(volume2), 0);
  }

  @Test
  void shouldAddTwoVolumesOfDifferentUnits() {
    Volume volume1 = Volume.create(1, VolumeUnit.GAL);
    Volume volume2 = Volume.create(1, VolumeUnit.LT);

    Volume expectedVolume = Volume.create(4.78, VolumeUnit.LT);

    assertEquals(expectedVolume.toLiter(), volume1.add(volume2).toLiter(), 0.1);
  }
}