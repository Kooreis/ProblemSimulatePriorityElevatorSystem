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