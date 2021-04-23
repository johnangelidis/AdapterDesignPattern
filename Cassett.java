import java.util.ArrayList;
/**
 * Class that represents a cassett
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /**
     * Constructs a cassett by taking in songs in string form and adding them to array list
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Method that plays the current song and advances to the next one
     * @return Returns the song being played
     */
    @Override
    public String play() {
        if(currentIndex < 5){
            int num = currentIndex+1;
            String temp = "Playing song " + num + ": " + songs.get(currentIndex);
            currentIndex++;
            return temp;
        }
        else{
            return "At the end of the cassett you need to rewind";
        }
    }
    /**
     * Method that rewinds to the previous song
     * @return Returns the previous song
     */
    @Override
    public String rewind() {
        if(currentIndex==0){
            return "Fully Re-Wound";
        }
        else{
            --currentIndex;
            int num = currentIndex+1;
            return "Rewinding to song " + num;
        }
    }
    /**
     * Method that moves to the next song. If there is no next song, it does not do anything.
     * @return Returns the next song in the list
     */
    @Override
    public String ffwd() {
        if(currentIndex==4){
            return "At the end of the cassett you need to rewind";
        }
        else if(currentIndex==3){
            currentIndex++;
            return "Forwarded to the end of the cassett";
        }
        else{
            int num = currentIndex+1;
            String temp = "Forwarding to song " + num;
            currentIndex++;
            return temp;
        }
    }
    /**
     * Pauses the current song
     * @return Returns the song being paused
     */
    @Override
    public String pause() {
        return "Pausing song " + currentIndex + ": " + songs.get(currentIndex);
    }
    /**
     * Method that stops and ejects the cassett
     * @return Returns statement that the cassett is stopped and ejected
     */
    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
