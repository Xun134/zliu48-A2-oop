// Author: zliu48
// This class simulates the operation of rides, visitors, and ride history for an amusement park.

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
//        assignment.partThree();
//        assignment.partFourA();
//        assignment.partFourB();
//        assignment.partFive();
//        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        Visitor[] visitors = {
                new Visitor("Jack", 25, "Male", "V101", 111),
                new Visitor("Sharon", 22, "Female", "V102", 111),
                new Visitor("Benny", 28, "Male", "V103", 11111),
                new Visitor("Leo", 24, "Female", "V104", 11111),
                new Visitor("Nehemia", 30, "Male", "V105", 11111)
        };

        for (Visitor visitor : visitors) {
            rollerCoaster.addVisitorToQueue(visitor);
        }

        rollerCoaster.printQueue();

        rollerCoaster.removeVisitorFromQueue();

        rollerCoaster.printQueue();
    }

    public void partFourA() {
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        Visitor[] visitors = {
                new Visitor("Jack", 25, "Male", "V101", 33333),
                new Visitor("Sharon", 22, "Female", "V102", 2222),
                new Visitor("Benny", 28, "Male", "V103", 22),
                new Visitor("Leo", 24, "Female", "V104", 333),
                new Visitor("Nehemia", 30, "Male", "V105", 4444)
        };

        for (Visitor visitor : visitors) {
            rollerCoaster.addVisitorToHistory(visitor);
        }

        rollerCoaster.checkVisitorFromHistory(visitors[2]);
        rollerCoaster.checkVisitorFromHistory(new Visitor("Demo", 29, "Male", "V106", 3333));

        System.out.println("Total visitors in ride history: " + rollerCoaster.numberOfVisitors());
        rollerCoaster.printRideHistory();
    }

    public void partFourB() {
        Employee operator = new Employee("Bob", 40, "Male", "E102", "Ride Operator");
        Ride thunderStorm = new Ride("Thunderstorm", 4, operator);

        Visitor[] visitors = {
                new Visitor("Tom", 25, "Male", "V101", 1),
                new Visitor("Sherly", 22, "Female", "V102", 2),
                new Visitor("Ben", 28, "Male", "V103", 3),
                new Visitor("David", 24, "Female", "V104", 4),
                new Visitor("Jack", 30, "Male", "V105", 5),
                new Visitor("Lee", 30, "Female", "V106", 5)
        };

        for (Visitor visitor : visitors) {
            thunderStorm.addVisitorToHistory(visitor);
        }

        System.out.println("Before sorting:");
        thunderStorm.printRideHistory();

        thunderStorm.sortRideHistory();

        System.out.println("After sorting:");
        thunderStorm.printRideHistory();
    }

    public void partFive() {
        Employee operator = new Employee("Bob", 40, "Male", "E102", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        Visitor[] visitors = {
                new Visitor("Tom", 25, "Male", "V101", 000),
                new Visitor("Sherly", 22, "Female", "V102", 999),
                new Visitor("Ben", 28, "Male", "V103", 6777),
                new Visitor("David", 24, "Female", "V104", 868),
                new Visitor("Jack", 30, "Male", "V105", 456654),
                new Visitor("Lee", 30, "Female", "V106", 645645),
                new Visitor("Jack", 25, "Male", "V101", 654654),
                new Visitor("Sharon", 22, "Female", "V102", 65465463),
                new Visitor("Benny", 28, "Male", "V103", 635634),
                new Visitor("Leo", 24, "Female", "V104", 63463546),
                new Visitor("Nehemia", 30, "Male", "V105", 634565436)
        };

        for (Visitor visitor : visitors) {
            rollerCoaster.addVisitorToQueue(visitor);
        }

        System.out.println("\nVisitors in queue before the cycle:");
        rollerCoaster.printQueue();

        rollerCoaster.runOneCycle();

        System.out.println("\nVisitors in queue after the cycle:");
        rollerCoaster.printQueue();

        System.out.println("\nRide history:");
        rollerCoaster.printRideHistory();
    }

    public void partSix() {
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        Visitor[] visitors = {
                new Visitor("Jack", 25, "Male", "V101", 111),
                new Visitor("Sharon", 22, "Female", "V102", 222),
                new Visitor("Benny", 28, "Male", "V103", 333),
                new Visitor("Leo", 24, "Female", "V104", 444),
                new Visitor("Nehemia", 30, "Male", "V105", 555)
        };

        for (Visitor visitor : visitors) {
            rollerCoaster.addVisitorToHistory(visitor);
        }

        String filename = "file.csv";
        rollerCoaster.exportRideHistory(filename);
    }

    public void partSeven() {
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);
        rollerCoaster.importRideHistory("file.csv");

        System.out.println("The number of Visitors: " + rollerCoaster.getSizeOfVisitorQueue() + "\n");
        System.out.println("All Visitors:");
        rollerCoaster.printQueue();
    }
}
