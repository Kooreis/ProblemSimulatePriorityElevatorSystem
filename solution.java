Here is a simple console application in Java that simulates a priority elevator system with multiple floor requests. This application uses a PriorityQueue to manage the floor requests, where the highest priority is given to the lowest floor number.

```java
import java.util.PriorityQueue;
import java.util.Scanner;

class Elevator {
    private PriorityQueue<Integer> requests;
    private int currentFloor;

    public Elevator() {
        this.requests = new PriorityQueue<>();
        this.currentFloor = 0;
    }

    public void addRequest(int floor) {
        this.requests.add(floor);
    }

    public void processRequests() {
        while (!this.requests.isEmpty()) {
            int nextFloor = this.requests.poll();
            if (nextFloor > this.currentFloor) {
                for (int i = this.currentFloor; i <= nextFloor; i++) {
                    System.out.println("Floor: " + i);
                }
            } else {
                for (int i = this.currentFloor; i >= nextFloor; i--) {
                    System.out.println("Floor: " + i);
                }
            }
            this.currentFloor = nextFloor;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of floor requests: ");
        int numRequests = scanner.nextInt();

        for (int i = 0; i < numRequests; i++) {
            System.out.println("Enter floor number for request " + (i + 1) + ": ");
            int floor = scanner.nextInt();
            elevator.addRequest(floor);
        }

        System.out.println("Processing requests...");
        elevator.processRequests();
    }
}
```

This application first asks the user to enter the number of floor requests. Then, for each request, it asks the user to enter the floor number. After all requests have been entered, it processes the requests by moving the elevator to each requested floor in order of priority. The current floor of the elevator is printed to the console as it moves.