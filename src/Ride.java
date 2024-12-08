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

    // Queue-related methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.printf("%s has joined the queue for %s.%n", visitor.getName(), rideName);
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = visitorQueue.poll();
        if (removedVisitor != null) {
            System.out.printf("%s has been removed from the queue for %s.%n", removedVisitor.getName(), rideName);
        } else {
            System.out.printf("The queue for %s is empty. No visitor to remove.%n", rideName);
        }
    }

    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.printf("The queue for %s is currently empty.%n", rideName);
        } else {
            System.out.printf("Visitors in the queue for %s:%n", rideName);
            visitorQueue.forEach(visitor ->
                    System.out.printf("- %s (Age: %d)%n", visitor.getName(), visitor.getAge())
            );
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.printf("The ride %s cannot be run because no operator is assigned.%n", rideName);
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.printf("The ride %s cannot be run because the queue is empty.%n", rideName);
            return;
        }

        int riders = 0;
        System.out.printf("Running one cycle for %s...%n", rideName);
        while (riders < maxRiders && !visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll();
            if (visitor != null) {
                addVisitorToHistory(visitor);
                System.out.printf("%s is enjoying the ride %s.%n", visitor.getName(), rideName);
                riders++;
            }
        }

        numOfCycles++;
        System.out.printf("Cycle completed. Total cycles run for %s: %d%n", rideName, numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.printf("%s has been added to the ride history for %s.%n", visitor.getName(), rideName);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.printf("%s is %sin the ride history for %s.%n", visitor.getName(), found ? "" : "not ", rideName);
        return found;
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.printf("No visitors have taken the ride %s yet.%n", rideName);
        } else {
            System.out.printf("Ride history for %s:%n", rideName);
            rideHistory.forEach(visitor ->
                    System.out.printf("- %s (Age: %d)%n", visitor.getName(), visitor.getAge())
            );
        }
    }



}
