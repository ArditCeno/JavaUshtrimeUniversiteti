/*7. Implementoni një klasë Playlist që ruan një listë këngësh. Ndërtoni metodat addSong(String song)
për të shtuar këngë, removeSong(String song) për të hequr këngë, searchSong(String song) që kthen
nëse kënga ekziston në playlist dhe getTotalSongs() që kthen numrin e këngëve aktuale. Testoni
klasën duke përdorur të gjitha metodat dhe afishoni rezultatin pas çdo veprimi.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ush7 {

    static class Playlist {

        private ArrayList<String> songs;

        public Playlist() {
            songs = new ArrayList<>();
        }

        public void addSong(String song) {
            songs.add(song);
            System.out.println("Kenga u shtua: " + song);
        }

        public void removeSong(String song) {
            if (songs.remove(song)) {
                System.out.println("Kenga u hoq: " + song);
            } else {
                System.out.println("Kenga nuk u gjet: " + song);
            }
        }

        public boolean searchSong(String song) {
            return songs.contains(song);
        }

        public int getTotalSongs() {
            return songs.size();
        }

        public void printSongs() {
            System.out.println("Kenge ne playlist:");
            if (songs.isEmpty()) {
                System.out.println("Asnje kenge.");
            } else {
                for (String s : songs) {
                    System.out.println("- " + s);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int zgjedhja;

        do {
            System.out.println("<<MENU PLAYLIST>>");
            System.out.println("0. Dil");
            System.out.println("1. Shto kenge");
            System.out.println("2. Hiq kenge");
            System.out.println("3. Kerko kenge");
            System.out.println("4. Numri total i kengeve");
            System.out.println("5. Shfaq playlist");

            System.out.print("Zgjidh nje veprim: ");
            zgjedhja = sc.nextInt();
            sc.nextLine(); 

            if (zgjedhja == 1) {
                System.out.print("Jep emrin e kenges: ");
                String song = sc.nextLine();
                playlist.addSong(song);
                System.out.println("Totali i kengeve: " + playlist.getTotalSongs());
            }
            else if (zgjedhja == 2) {
                System.out.print("Jep emrin e kenges: ");
                String song = sc.nextLine();
                playlist.removeSong(song);
                System.out.println("Totali i kengeve: " + playlist.getTotalSongs());
            }
            else if (zgjedhja == 3) {
                System.out.print("Jep emrin e kenges: ");
                String song = sc.nextLine();
                System.out.println("Ekziston ne playlist: " + playlist.searchSong(song));
            }
            else if (zgjedhja == 4) {
                System.out.println("Numri total i kengeve: " + playlist.getTotalSongs());
            }
            else if (zgjedhja == 5) {
                playlist.printSongs();
            }
            else if (zgjedhja == 0) {
                System.out.println("Programi u mbyll.");
            }
            else {
                System.out.println("Zgjedhje e gabuar.");
            }

        } while (zgjedhja != 0);

        sc.close();
    }
}