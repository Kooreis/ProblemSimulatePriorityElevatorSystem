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
}