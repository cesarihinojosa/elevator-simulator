package hw5;

import java.util.ArrayList;

import hw5.handlers.FloorNoneHandler;
import hw5.handlers.FloorOneHandler;
import hw5.handlers.FloorThreeHandler;
import hw5.handlers.FloorTwoHandler;
import hw5.helpers.InputParser;
import hw5.machine.Elevator;

public class ElevatorSimulation {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();

        FloorOneHandler floorOneHandler = new FloorOneHandler(elevator);
        FloorTwoHandler floorTwoHandler = new FloorTwoHandler(elevator);
        FloorThreeHandler floorThreeHandler = new FloorThreeHandler(elevator);
        FloorNoneHandler floorNoneHandler = new FloorNoneHandler(elevator);

        floorOneHandler.setNextHandler(floorTwoHandler);
        floorTwoHandler.setNextHandler(floorThreeHandler);
        floorThreeHandler.setNextHandler(floorNoneHandler);

        ArrayList<Integer> floorList = InputParser.parseFile(args[0]);
        for (int floor : floorList) {
            floorOneHandler.handleButton(floor);
        }

    }

}
