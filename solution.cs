Here is a simple console application in C# that simulates a priority elevator system with multiple floor requests. This application uses a SortedSet to keep track of the floor requests in order of priority.

```C#
using System;
using System.Collections.Generic;

public class Elevator
{
    private SortedSet<int> requests;
    private int currentFloor;

    public Elevator()
    {
        requests = new SortedSet<int>();
        currentFloor = 0;
    }

    public void RequestFloor(int floor)
    {
        requests.Add(floor);
    }

    public void Operate()
    {
        while (requests.Count > 0)
        {
            int nextFloor = requests.Min;
            requests.Remove(nextFloor);

            if (nextFloor > currentFloor)
            {
                for (int i = currentFloor; i <= nextFloor; i++)
                {
                    Console.WriteLine("Elevator is at floor " + i);
                }
            }
            else
            {
                for (int i = currentFloor; i >= nextFloor; i--)
                {
                    Console.WriteLine("Elevator is at floor " + i);
                }
            }

            currentFloor = nextFloor;
        }
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        Elevator elevator = new Elevator();

        elevator.RequestFloor(3);
        elevator.RequestFloor(5);
        elevator.RequestFloor(1);

        elevator.Operate();
    }
}
```

In this application, the `Elevator` class has a `SortedSet` of floor requests and a `currentFloor` variable. The `RequestFloor` method adds a floor to the set of requests. The `Operate` method processes the requests in order, moving the elevator to each requested floor and removing the request from the set. The `Main` method creates an `Elevator` object, adds some floor requests, and then operates the elevator.