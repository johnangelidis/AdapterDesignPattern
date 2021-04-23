import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private  ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    @Override
    public String playFromBeginning() {
        return "Playing first song: " + songs.get(0);
    }

    @Override
    public String playSong(int num) {
        if(num<6 && num>0){
            currentIndex=num-1;
            return "Playing song " + currentIndex + ": " + songs.get(currentIndex);
        }
        else{
            return "Not a valid song number";
        }
    }

    @Override
    public String prevSong() {
        --currentIndex;
        return "Skipping back and playing: " + songs.get(currentIndex);
    }

    @Override
    public String nextSong() {
        String temp = "Playing song " + currentIndex + ": " + songs.get(currentIndex);
        currentIndex++;
        return temp;
    }

    @Override
    public String stopEject() {
        currentIndex=0;
        return "Stopping cassett and ejecting";
    }

    @Override
    public String pause() {
        return "Pausing song " + currentIndex + ": " + songs.get(currentIndex);
    }
    
}
