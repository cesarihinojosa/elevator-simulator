package hw5.states;

import hw5.machine.Elevator;

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
