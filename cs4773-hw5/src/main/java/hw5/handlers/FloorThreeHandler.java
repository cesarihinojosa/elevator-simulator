package hw5.handlers;

import hw5.machine.Elevator;

public class FloorThreeHandler extends Handler {

    public FloorThreeHandler(Elevator elevator) {
        super(elevator);
    }

    public void handleButton(int floor) {
        if (floor == 3) {
            elevator.floorThreeButtonPressed();
        } else {
            nexHandler.handleButton(floor);
        }
    }

}
