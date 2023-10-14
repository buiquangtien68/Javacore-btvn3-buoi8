public class Follower {
    private String nameFollower;
    private int idFollower;
    private String emailFollower;
    private int numberOfLike;

    public Follower(String nameFollower, int idFollower, String emailFollower, int numberOfLike) {
        this.nameFollower = nameFollower;
        this.idFollower = idFollower;
        this.emailFollower = emailFollower;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "nameFollower='" + nameFollower + '\'' +
                ", idFollower=" + idFollower +
                ", emailFollower='" + emailFollower + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
