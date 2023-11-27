package hw5.Machine;

import hw5.States.FloorOneState;
import hw5.States.FloorThreeState;
import hw5.States.FloorTwoState;
import hw5.States.State;

public class Elevator {

    State floorOneState;
    State floorTwoState;
    State floorThreeState;

    State state = floorOneState;

    public Elevator() {
        floorOneState = new FloorOneState(this);
        floorTwoState = new FloorTwoState(this);
        floorThreeState = new FloorThreeState(this);
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
        openDoor();
        ding(floor);
    }

    private void openDoor() {
        System.out.println("Doors are open");
    }

    private void closeDoor() {
        System.out.println("Doors are closed");
    }

    private void goingUp() {
        System.out.println("Going up...");
    }

    private void goingDown() {
        System.out.println("Going down...");
    }

    private void ding(String floor) {
        System.out.println("*ding* The elevator arrives at Floor " + floor);
    }

    private void pressed(String button) {
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
