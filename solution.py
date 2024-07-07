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