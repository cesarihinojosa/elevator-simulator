package hw5.states;

import hw5.machine.Elevator;

public class FloorThreeState implements FloorState {

    Elevator elevator;

    public FloorThreeState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void floorOneButtonPressed() {
        elevator.goingDownToFloor("1");
        elevator.setState(elevator.getFloorTwoState());
        elevator.setState(elevator.getFloorOneState());
        elevator.arrivedAtFloor("1");
    }

    public void floorTwoButtonPressed() {
        elevator.goingDownToFloor("2");
        elevator.setState(elevator.getFloorTwoState());
        elevator.arrivedAtFloor("2");
    }

    public void floorThreeButtonPressed() {
        elevator.pressed("3");
        elevator.closeDoor();
        System.out.println("Nothing happens");
    }

}
