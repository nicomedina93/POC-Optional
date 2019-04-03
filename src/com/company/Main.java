package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static  List<Event> Events;

    public static void main(String[] args) {

        Events = Arrays.asList(
                new Event(2,"Lollapalooza",(
                    new Location(1,"Argentina",(
                        new City(1,"Mar del plata")))))
                ,new Event(3,"Maximum Festival",(
                        new Location(2,"Brazil",(
                                new City(2,"Mar caribe")))))
                , new Event(8,"Hellfest",(
                                new Location(3,"Estados Unidos",(
                                        new City(3,"Washington DC"))))),
                new Event(5,"Hallabalooza",(
                        new Location(2,"Estados Unidos",(
                                new City(2,"Springfield"))))),
                new Event(1,"Arch Enemy",(
                        new Location(2,"Alemania",(
                                new City(2,"Berlin"))))),
                new Event(9,"Mar Distorsion Fest",(
                        new Location(2,"Venezuela",(
                                new City(2,"Vene-Zuela")))))
        );



        List<Event> eventFive = getEventFirstFive(Events);

        Events = Events.stream()
                .sorted(Comparator.comparing(e->e.getName()))
                .collect(Collectors.toList());


        System.out.println("CINCO PRIMEROS: " + eventFive.toString());
        System.out.println("ORDENADOS ALFABETICAMENTE:" + Events.toString());
        System.out.println("ID 5 (existente): "
                + Optional.ofNullable(getEventById(Events,5)).orElse(null));
        System.out.println("ID 20 (no existente): "
                + Optional.ofNullable(getEventById(Events,20)).orElse(null));


    }

    public static List<Event> getEventFirstFive(List<Event> events){
        return events.stream().limit(5).collect(Collectors.toList());
    }

    public static Event getEventById(List<Event> events, int id){

        return events.stream()
                .filter(event->event.getId()  == id)
                .findAny().orElse(null);
    }



}
