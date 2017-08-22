package com.jimmyhowe.dispatcher;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dispatcher
{
    /**
     * Event Listeners
     */
    private Map<String, Event> listeners = new LinkedHashMap<>();

    /**
     * Default listener
     */
    private Event defaultEvent;

    /**
     * @param key
     * @param listener
     */
    public void listen(String key, Listener listener)
    {
        listeners.put(key, new Event(listener){});
    }

    /**
     * @param key
     * @param event
     */
    public void listen(String key, Event event)
    {
        listeners.put(key, event);
    }

    /**
     * @param key
     */
    public void dispatch(String key, Object... objects)
    {
        listeners.getOrDefault(key, defaultEvent).fire(objects);
    }

    /**
     * @param listener
     */
    public void onMisfire(Listener listener)
    {
        this.defaultEvent = new Event(listener);
    }
}
