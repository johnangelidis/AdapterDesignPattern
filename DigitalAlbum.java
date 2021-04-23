/**
 * Interface that represent an album in digital form
 */
public interface DigitalAlbum {
    /**
     * Plays the first song in the list
     * @return Returns the first song
     */
    public String playFromBeginning();
    /**
     * Method that takes in a number and plays the song in that position in the list
     * @param num
     * @return Returns the song in position num
     */
    public String playSong(int num);
    /**
     * Plays the previous song
     * @return Returns the previous song
     */
    public String prevSong();
    /**
     * Plays the next song
     * @return Returns the next song
     */
    public String nextSong();
    /**
     * Method that stops and ejects the cassett
     * @return Returns statement that the cassett is stopped and ejected
     */
    public String stopEject();
    /**
     * Pauses the current song
     * @return Returns the song being paused
     */
    public String pause();
}
