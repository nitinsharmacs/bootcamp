package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {
  @Test
  void shouldEmitEvent() {
    Notifier notifier = new Notifier();

    notifier.on("full", () -> {
      // do something;
    });

    assertTrue(notifier.emit("full"));
    assertFalse(notifier.emit("unknown"));
  }
}