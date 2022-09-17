package com.tw.step8.assignment4;

import com.tw.step8.assignment4.notifier.EventData;

public interface Observer {
  void inform(EventData data);
}
