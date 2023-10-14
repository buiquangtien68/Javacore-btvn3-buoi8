import java.util.ArrayList;

public class Idol {
    private String nameIdol;
    private int idIdol;
    private String emailIdol;
    private ArrayList<Follower> followers;
    private String group;

    public Idol(String nameIdol, int idIdol, String emailIdol, ArrayList<Follower> followers, String group) {
        this.nameIdol = nameIdol;
        this.idIdol = idIdol;
        this.emailIdol = emailIdol;
        this.followers = followers;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "nameIdol='" + nameIdol + '\'' +
                ", idIdol=" + idIdol +
                ", emailIdol='" + emailIdol + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}
