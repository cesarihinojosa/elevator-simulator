package hw5.handlers;

import hw5.machine.Elevator;

public class FloorTwoHandler extends Handler {

    public FloorTwoHandler(Elevator elevator) {
        super(elevator);
    }

    public void handleButton(int floor) {
        if (floor == 2) {
            elevator.floorTwoButtonPressed();
        } else {
            nexHandler.handleButton(floor);
        }
    }

}
