package hw5.handlers;

import hw5.machine.Elevator;

public abstract class Handler {

    Handler nexHandler;
    Elevator elevator;

    public Handler(Elevator elevator) {
        this.elevator = elevator;
    }

    public abstract void handleButton(int floor);

    public void setNextHandler(Handler nextHandler) {
        this.nexHandler = nextHandler;
    }

}
