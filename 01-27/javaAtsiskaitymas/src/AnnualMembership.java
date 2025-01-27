public class AnnualMembership extends Membership {
    double cost = 300;
    int duration = 12;

    public AnnualMembership(int membershipId, int memberId) {
        super(membershipId, memberId);
    }

    @Override
    double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "AnnualMembership," +
                " Cost " + cost +
                ", Duration " + duration +
                " months";
    }
}
