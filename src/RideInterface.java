// Author: zliu48
// This interface defines the essential operations for managing a ride, including queue management, cycle operation, and ride history.

import java.util.List;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);

    void removeVisitorFromQueue();

    void printQueue();

    void runOneCycle();

    void addVisitorToHistory(Visitor visitor);

    boolean checkVisitorFromHistory(Visitor visitor);

    int numberOfVisitors();

    void printRideHistory();
}