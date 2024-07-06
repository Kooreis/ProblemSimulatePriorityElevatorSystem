import java.util.PriorityQueue;
import java.util.Scanner;

class Elevator {
    private PriorityQueue<Integer> requests;
    private int currentFloor;

    public Elevator() {
        this.requests = new PriorityQueue<>();
        this.currentFloor = 0;
    }
}