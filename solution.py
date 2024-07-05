```python
import heapq

class Elevator:
    def __init__(self):
        self.current_floor = 0
        self.target_floors = []

    def move(self):
        while self.target_floors:
            target = heapq.heappop(self.target_floors)
            self.current_floor = target
            print(f"Elevator moved to floor {self.current_floor}")

    def request_floor(self, floor):
        heapq.heappush(self.target_floors, floor)
        print(f"Floor {floor} requested")

class Building:
    def __init__(self, floors):
        self.floors = floors
        self.elevator = Elevator()

    def request_elevator(self, floor):
        if floor > self.floors or floor < 0:
            print("Invalid floor request")
        else:
            self.elevator.request_floor(floor)

def main():
    building = Building(10)
    building.request_elevator(3)
    building.request_elevator(7)
    building.request_elevator(2)
    building.elevator.move()

if __name__ == "__main__":
    main()
```