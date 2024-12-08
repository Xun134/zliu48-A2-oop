// Author: zliu48
// This class represents a ride in an amusement park, managing visitor queues, ride history, and ride operations.

import java.io.*;
import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private int maxRiders;
    private Employee operator;
    private Queue<Visitor> visitorQueue = new LinkedList<>();
    private List<Visitor> rideHistory = new ArrayList<>();
    private int numOfCycles = 0;

    // Default constructor
    public Ride() {
    }

    // Parameterized constructor
    public Ride(String rideName, int maxRiders, Employee operator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public int getSizeOfVisitorQueue() {
        return visitorQueue.size();
    }
    



}
