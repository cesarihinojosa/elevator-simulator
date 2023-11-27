package hw5.handlers;

import hw5.machine.Elevator;

public class FloorOneHandler extends Handler {

    public FloorOneHandler(Elevator elevator) {
        super(elevator);
    }

    public void handleButton(int floor) {
        if (floor == 1) {
            elevator.floorOneButtonPressed();
        } else {
            nexHandler.handleButton(floor);
        }
    }

}
