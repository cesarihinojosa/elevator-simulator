package hw5.machine;

import hw5.states.FloorOneState;
import hw5.states.FloorThreeState;
import hw5.states.FloorTwoState;
import hw5.states.State;

public class Elevator {

    State floorOneState;
    State floorTwoState;
    State floorThreeState;
    State state;

    public Elevator() {
        floorOneState = new FloorOneState(this);
        floorTwoState = new FloorTwoState(this);
        floorThreeState = new FloorThreeState(this);
        setState(floorOneState);
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
        System.out.println("Doors are open");
    }

    public void closeDoor() {
        System.out.println("Doors are closed");
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFloorOneState() {
        return floorOneState;
    }

    public State getFloorTwoState() {
        return floorTwoState;
    }

    public State getFloorThreeState() {
        return floorThreeState;
    }

}
