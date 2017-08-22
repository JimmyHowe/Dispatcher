package com.jimmyhowe.dispatcher;

public class Main
{
    public static void main(String[] args)
    {
        Dispatcher dispatcher = new Dispatcher();

        dispatcher.onMisfire(() -> {
            System.out.println("Go FISH");
        });

        dispatcher.dispatch("");
    }
}
