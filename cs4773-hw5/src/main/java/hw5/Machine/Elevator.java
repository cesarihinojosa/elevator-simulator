package hw5.machine;

import hw5.states.DoorClosedState;
import hw5.states.DoorOpenState;
import hw5.states.DoorState;
import hw5.states.FloorOneState;
import hw5.states.FloorThreeState;
import hw5.states.FloorTwoState;
import hw5.states.FloorState;

public class Elevator {

    FloorState floorOneState;
    FloorState floorTwoState;
    FloorState floorThreeState;
    FloorState state;

    DoorState open;
    DoorState closed;
    DoorState door;

    public Elevator() {
        floorOneState = new FloorOneState(this);
        floorTwoState = new FloorTwoState(this);
        floorThreeState = new FloorThreeState(this);
        open = new DoorOpenState();
        closed = new DoorClosedState();
        setState(floorOneState);
        setDoor(open);
    }

    public void floorOneButtonPressed() {
        state.floorOneButtonPressed();
    }

    public void floorTwoButtonPressed() {
        state.floorTwoButtonPressed();
    }

    public void floorThreeButtonPressed() {
        state.floorThreeButtonPressed();
    }

    public void goingUpToFloor(String floor) {
        pressed(floor);
        closeDoor();
        goingUp();
    }

    public void goingDownToFloor(String floor) {
        pressed(floor);
        closeDoor();
        goingDown();
    }

    public void arrivedAtFloor(String floor) {
        ding(floor);
        openDoor();
    }

    public void openDoor() {
        door.openDoor();
        setDoor(open);
    }

    public void closeDoor() {
        door.closeDoor();
        setDoor(closed);
    }

    public void goingUp() {
        System.out.println("Going up...");
    }

    public void goingDown() {
        System.out.println("Going down...");
    }

    public void ding(String floor) {
        System.out.println("*ding* The elevator arrives at Floor " + floor);
    }

    public void pressed(String button) {
        System.out.println(button + " pressed");
    }

    public FloorState getState() {
        return state;
    }

    public void setState(FloorState state) {
        this.state = state;
    }

    public FloorState getFloorOneState() {
        return floorOneState;
    }

    public FloorState getFloorTwoState() {
        return floorTwoState;
    }

    public FloorState getFloorThreeState() {
        return floorThreeState;
    }

    public DoorState getDoor() {
        return door;
    }

    public void setDoor(DoorState door) {
        this.door = door;
    }

}
