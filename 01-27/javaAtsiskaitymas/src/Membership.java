abstract class Membership {
    protected int membershipId;
    protected int memberId;

    public Membership(int membershipId, int memberId) {
        this.membershipId = membershipId;
        this.memberId = memberId;
    }

    abstract double getCost();

}
