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
       
    }

    public void partFive() {

    }

    public void partSix() {
        
    }

    public void partSeven() {

    }

}
