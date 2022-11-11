package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    protected ArrayList<Song> list = new ArrayList<>();

    abstract void addSong(Song song);

    public void removeSong(Song song) {
        list.remove(song);
    }

    @Override
    public String toString() {
        StringBuilder  retString = new StringBuilder("Album{songs=[");
        for (Song song : list) {
            retString.append(song.toString());
            if (song != list.get(list.size() - 1)) {
                retString.append(", ");
            }
        }
        retString.append("]}");

        return retString.toString();
    }
}
