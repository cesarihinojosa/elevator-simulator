package hw5.States;

import hw5.Machine.Elevator;

public class FloorOneState implements State {

    Elevator elevator;

    public FloorOneState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void floorOneButtonPressed() {
    }

    public void floorTwoButtonPressed() {
        elevator.goingUpToFloor("2");
        elevator.setState(elevator.getFloorTwoState());
        elevator.arrivedAtFloor("2");
    }

    public void floorThreeButtonPressed() {
        elevator.goingUpToFloor("3");
        elevator.setState(elevator.getFloorTwoState());
        elevator.setState(elevator.getFloorThreeState());
        elevator.arrivedAtFloor("3");
    }

}
