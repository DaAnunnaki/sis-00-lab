import java.util.ArrayList;
public class User {
    private String userName;
    private ArrayList<Playlist> playlists;

    public User(String userName) {
        this.userName = userName;
        this.playlists = new ArrayList<>();
    }

    public String getName() {
        return this.userName;
    }

    public void addPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void removePlaylist(String title) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(title)) {
                playlists.remove(playlist);
                break;
            }
        }
    }

    public ArrayList<Playlist> getPlaylists() {
        return this.playlists;
    }

    public Playlist getPlaylist(String title) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equals(title)) {
                return playlist;
            }
        }
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        Playlist userPlaylist = getPlaylist(playlistTitle);
        friend.addPlaylist(userPlaylist);
    }
}