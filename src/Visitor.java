// Author: zliu48
// The Visitor class represents a visitor who is a person with additional attributes like ticket ID and membership ID.

public class Visitor extends Person {
    private String ticketId;
    private int membershipId;

    // Default constructor
    public Visitor() {
        super(); // Calling the parent constructor
    }

    // Parameterized constructor
    public Visitor(String name, int age, String gender, String ticketId, int membershipId) {
        super(name, age, gender);  // Passing parameters to the parent class constructor
        this.ticketId = ticketId;
        this.membershipId = membershipId;
    }

    // Getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }
}
