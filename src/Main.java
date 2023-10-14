import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Song> songs=new ArrayList<>();
        System.out.println("Mời bạn nhập số lượng bài hát: ");
        int numberOfSong=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfSong ; i++) {
            System.out.println("Mời bạn nhập id bài hát thứ "+(i+1));
            int idSong=Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập tên bài hát thứ "+(i+1));
            String nameSong= scanner.nextLine();
            System.out.println("Mời bạn nhập tên ca sĩ của bài hát thứ "+(i+1));
            String singer= scanner.nextLine();
            Song song=new Song(idSong,nameSong,singer);
            songs.add(song);
        }

        ArrayList<Idol> idols=new ArrayList<>();
        System.out.println("Mời bạn nhập số lượng idol");
        int numberOfIdol=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfIdol ; i++) {
            System.out.println("Mời bạn nhập tên của idol thứ "+(i+1));
            String nameIdol= scanner.nextLine();
            System.out.println("Mời bạn nhập id của idol thứ "+(i+1));
            int idIdol=Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập email của idol thứ "+(i+1));
            String emailIdol= scanner.nextLine();
            System.out.println("Mời bạn nhập group của idol thứ "+(i+1));
            String group= scanner.nextLine();
            ArrayList<Follower> followers=new ArrayList<>();
            System.out.println("Mời bạn nhập số lượng người hâm mộ:");
            int numberOfFollower=Integer.parseInt(scanner.nextLine());
            for (int j = 0; j <numberOfFollower ; j++) {
                System.out.println("Mời bạn nhập tên người hâm mộ thứ "+(j+1));
                String nameFollower= scanner.nextLine();
                System.out.println("Mời bạn nhập id người hâm mộ thứ "+(j+1));
                int idFollower=Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập email của người hâm mộ thứ "+(j+1));
                String emailFollwer= scanner.nextLine();
                System.out.println("Mời bạn nhập số lượng like của người hâm mộ thứ "+(j+1));
                int numberOfLike=Integer.parseInt(scanner.nextLine());
                Follower follower=new Follower(nameFollower,idFollower,emailFollwer,numberOfLike);
                followers.add(follower);
            }
            Idol idol=new Idol(nameIdol,idIdol,emailIdol,followers,group);
            idols.add(idol);
        }
        Tiktok tiktok=new Tiktok(idols,songs);
        System.out.println(tiktok);
    }
}
