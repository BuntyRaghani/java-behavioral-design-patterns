package com.example.mediator.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControlColleague {

    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (EventHandler eventHandler : eventHandlers) {
            eventHandler.handle();
        }
    }
}
