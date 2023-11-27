package hw5.States;

import hw5.Machine.Elevator;

public class FloorTwoState implements State {

    Elevator elevator;

    public FloorTwoState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void floorOneButtonPressed() {
        elevator.goingDownToFloor("1");
        elevator.setState(elevator.getFloorOneState());
        elevator.arrivedAtFloor("1");
    }

    public void floorTwoButtonPressed() {
    }

    public void floorThreeButtonPressed() {
        elevator.goingUpToFloor("3");
        elevator.setState(elevator.getFloorThreeState());
        elevator.arrivedAtFloor("3");
    }

}
