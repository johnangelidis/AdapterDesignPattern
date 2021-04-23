import java.util.ArrayList;
/**
 * Method that represents a CD
 */
public class CD implements DigitalAlbum {
    private  ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;
    /**
     * Constructs a CD by taking in 5 songs in string form and adds them to array list
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }
    /**
     * Plays the first song in the list
     * @return Returns the first song
     */
    @Override
    public String playFromBeginning() {
        return "Playing first song: " + songs.get(0);
    }
    /**
     * Method that takes in a number and plays the song in that position in the list
     * @param num
     * @return Returns the song in position num
     */
    @Override
    public String playSong(int num) {
        if(num<6 && num>0){
            currentIndex=num-1;
            return "Playing song " + num + ": " + songs.get(currentIndex);
        }
        else{
            return "Not a valid song number";
        }
    }

    /**
     * Plays the previous song
     * @return Returns the previous song
     */
    @Override
    public String prevSong() {
        if(currentIndex==5){
            currentIndex=3;
        }
        else{
            --currentIndex;
        }
        return "Skipping back and playing: " + songs.get(currentIndex);
    }
    /**
     * Plays the next song
     * @return Returns the next song
     */
    @Override
    public String nextSong() {
        int num = currentIndex+1;
        String temp = "Playing song " + num + ": " + songs.get(currentIndex);
        currentIndex++;
        return temp;
    }
    /**
     * Method that stops and ejects the cassett
     * @return Returns statement that the cassett is stopped and ejected
     */
    @Override
    public String stopEject() {
        currentIndex=0;
        return "Stopping cassett and ejecting";
    }
    /**
     * Pauses the current song
     * @return Returns the song being paused
     */
    @Override
    public String pause() {
        return "Pausing song " + currentIndex + ": " + songs.get(currentIndex);
    }
    
}
