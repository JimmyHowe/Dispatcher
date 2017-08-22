package com.jimmyhowe.dispatcher;

public class Event
{
    private Listener listener;

    public Event()
    {
        listener = () -> {
        };
    }

    public Event(Listener listener)
    {
        this.listener = listener;
    }

    public void fire()
    {
        listener.fire();
    }

    public void fire(Object[] objects)
    {
        listener.fire();
    }
}
