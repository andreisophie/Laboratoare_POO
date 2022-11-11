package lab5.task4;

public class BadAlbum extends Album {
    private boolean isPalindrome(int num) {
        int temp = num, mirror = 0;

        while(temp>0){
            mirror = (mirror * 10) + temp % 10;
            temp /= 10;
        }

        if(num == mirror)
            return true;
        return false;
    }

    @Override
    public void addSong(Song song) {
        if (song.getName().length() == 3 && isPalindrome(song.getId())) {
            list.add(song);
        }
    }
}
