public class Song implements Comparable<Song> {
    private String songName;
    private String artistName;
    private String duration;

    public Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {
        return this.songName;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public String getDuration() {
        return this.duration;
    }

    @Override
    public int compareTo(Song other) {
        int compareName = this.songName.compareTo(other.getSongName());
        if (compareName == 0) {
            return this.artistName.compareTo(other.getArtistName());
        }
        return compareName;
    }

    @Override
    public String toString() {
        return songName + " by " + artistName + " (" + duration + ")";
    }
}
