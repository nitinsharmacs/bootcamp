package com.tw.step8.assignment3;

import com.tw.step8.assignment3.Unit.TemperatureUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

  @Test
  void shouldCompareTwoTemperatureInCelsius() {
    Temperature temperature1 = Temperature.create(2, TemperatureUnit.C);
    Temperature temperature2 = Temperature.create(1, TemperatureUnit.C);

    assertEquals(1, temperature1.compare(temperature2));
    assertEquals(-1, temperature2.compare(temperature1));
  }

  @Test
  void shouldCompareTwoTemperatureInFahrenheit() {
    Temperature temperature1 = Temperature.create(2, TemperatureUnit.F);
    Temperature temperature2 = Temperature.create(1, TemperatureUnit.F);

    assertEquals(1, temperature1.compare(temperature2));
    assertEquals(-1, temperature2.compare(temperature1));
  }

  @Test
  void shouldCompareEqualTemperaturesInSameUnit() {
    Temperature temperature1 = Temperature.create(1, TemperatureUnit.C);
    Temperature temperature2 = Temperature.create(1, TemperatureUnit.C);

    assertEquals(0, temperature1.compare(temperature2));
  }

  @Test
  void shouldCompareTemperaturesInDifferentUnits() {
    Temperature temperature1 = Temperature.create(2, TemperatureUnit.C);
    Temperature temperature2 = Temperature.create(1, TemperatureUnit.F);

    assertEquals(1, temperature1.compare(temperature2));
    assertEquals(-1, temperature2.compare(temperature1));
  }

  @Test
  void shouldCompareEqualTemperaturesInDifferentUnits() {
    Temperature temperature1 = Temperature.create(1, TemperatureUnit.C);
    Temperature temperature2 = Temperature.create(2.12, TemperatureUnit.F);

    assertEquals(0, temperature1.compare(temperature2));
  }
}