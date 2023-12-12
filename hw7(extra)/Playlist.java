import java.util.ArrayList;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return this.playlistTitle;
    }

    public void setTitle(String title) {
        this.playlistTitle = title;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void removeSong(String title) {
        for (Song song : songs) {
            if (song.getSongName().equals(title)) {
                songs.remove(song);
                break;
            }
        }
    }

    public void swapSongs(Song song1, Song song2) {
        int index1 = songs.indexOf(song1);
        int index2 = songs.indexOf(song2);
        if (index1 != -1 && index2 != -1) {
            songs.set(index1, song2);
            songs.set(index2, song1);
        }
    }

    public String getTotalDuration() {
        int totalSeconds = 0;
        for (Song song : songs) {
            String[] duration = song.getDuration().split(":");
            int min = Integer.parseInt(duration[0]);
            int sec = Integer.parseInt(duration[1]);
            totalSeconds += min * 60 + sec;
        }
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return minutes + " min, " + seconds + " sec";
    }

    public void sortSongs() {
        songs.sort(null);
    }

    @Override
    public String toString() {
        String str = playlistTitle+" - "+getTotalDuration()+"\n";
        int index = 1;
        for(Song song : songs) {
            str+=index+". "+song+"\n";
            index++;
        }
        /* 
        StringBuilder sb = new StringBuilder();
        sb.append(playlistTitle).append(" - ").append(getTotalDuration()).append("\n");
        int index = 1;
        for (Song song : songs) {
            sb.append(index).append(". ").append(song).append("\n");
            index++;
        }
        return sb.toString();
        */
        return str;
    }
}