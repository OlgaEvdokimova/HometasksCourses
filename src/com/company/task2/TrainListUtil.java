package com.company.task2;

import java.util.List;
import java.util.stream.Collectors;

public class TrainListUtil {
    public static List<Train> trainsToDestination(List<Train> trainList, String to) {
       return trainList.stream()
                .filter(train -> train.getTo() == to)
                .collect(Collectors.toList());
       // правильно ли я написала стримом?
    }

    public static List<Train> trainsToDestinationAfterTime(List<Train> trainList,  String to, String time) {
        return trainList.stream()
                .filter(train -> train.getTo() == to)
                .filter(train -> train.getTimeDeparture().compareTo(time) > 0)
                .collect(Collectors.toList());
    }

    public static List<Train> trainsFromTo(List<Train> trainList,String from,  String to) {
        return trainList.stream()
                .filter(train -> train.getFrom() == from)
                .filter(train -> train.getTo() == to)
                .collect(Collectors.toList());

    }
}
