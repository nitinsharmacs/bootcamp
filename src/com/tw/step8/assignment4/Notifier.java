package com.tw.step8.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Notifier {
  private final HashMap<String, List<Observer>> mapper;

  public Notifier() {
    this.mapper = new HashMap<>();
  }

  public void on(String eventName, Observer observer) {
    List<Observer> observers = this.mapper.get(eventName);

    if (observers == null) {
      ArrayList<Observer> newObservers = new ArrayList<>();
      newObservers.add(observer);

      this.mapper.put(eventName, newObservers);

      return;
    }

    observers.add(observer);
  }

  public boolean emit(String eventName) {
    List<Observer> observers = this.mapper.get(eventName);
    if (observers == null) {
      return false;
    }

    observers.forEach(observer -> observer.inform());

    return true;
  }
}
