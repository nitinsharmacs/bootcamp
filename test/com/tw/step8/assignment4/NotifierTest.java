package com.tw.step8.assignment4;

import com.tw.step8.assignment4.notifier.EventData;
import com.tw.step8.assignment4.notifier.Notifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {
  @Test
  void shouldEmitEvent() {
    Notifier notifier = new Notifier();

    notifier.on("full", (EventData eventData) -> {
      // do something;
    });

    assertTrue(notifier.emit("full", new EventData()));
    assertFalse(notifier.emit("unknown", new EventData()));
  }
}