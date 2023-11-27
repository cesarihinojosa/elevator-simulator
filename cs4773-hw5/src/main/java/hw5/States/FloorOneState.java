package hw5.states;

import hw5.machine.Elevator;

public class FloorOneState implements State {

    Elevator elevator;

    public FloorOneState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void floorOneButtonPressed() {
        elevator.pressed("1");
        elevator.closeDoor();
        System.out.println("Nothing happens");
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
