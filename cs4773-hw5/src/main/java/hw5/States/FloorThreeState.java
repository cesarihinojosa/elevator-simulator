package hw5.States;

import hw5.Machine.Elevator;

public class FloorThreeState implements State {

    Elevator elevator;

    public FloorThreeState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void floorOneButtonPressed() {
        elevator.goingDownToFloor("1");
        elevator.setState(elevator.getFloorTwoState());
        elevator.setState(elevator.getFloorThreeState());
        elevator.arrivedAtFloor("1");
    }

    public void floorTwoButtonPressed() {
        elevator.goingDownToFloor("2");
        elevator.setState(elevator.getFloorTwoState());
        elevator.arrivedAtFloor("2");
    }

    public void floorThreeButtonPressed() {
    }

}
