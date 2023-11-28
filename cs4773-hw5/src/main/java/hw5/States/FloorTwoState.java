package hw5.states;

import hw5.machine.Elevator;

public class FloorTwoState implements FloorState {

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
        elevator.pressed("2");
        elevator.closeDoor();
        System.out.println("Nothing happens");
    }

    public void floorThreeButtonPressed() {
        elevator.goingUpToFloor("3");
        elevator.setState(elevator.getFloorThreeState());
        elevator.arrivedAtFloor("3");
    }

}
