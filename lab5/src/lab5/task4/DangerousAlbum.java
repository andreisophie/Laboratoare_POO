package lab5.task4;

public class DangerousAlbum extends Album{
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num % 2 == 0) {
            return false;
        }
        for(int i = 3; i * i <= num; i+=2) {
            if (num % i == 0)
                return  false;
        }
        return true;
    }

    @Override
    public void addSong(Song song) {
        if (isPrime(song.getId())) {
            list.add(song);
        }
    }
}
