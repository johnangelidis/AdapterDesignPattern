/**
 * Interface that represent an album in analog form
 */
public interface AnalogAlbum{
    /**
     * Method that plays the current song and advances to the next one
     * @return Returns the song being played
     */
    public String play();
    /**
     * Method that rewinds to the previous song
     * @return Returns the previous song
     */
    public String rewind();
    /**
     * Method that moves to the next song. If there is no next song, it does not do anything.
     * @return Returns the next song in the list
     */
    public String ffwd();
    /**
     * Pauses the current song
     * @return Returns the song being paused
     */
    public String pause();
    /**
     * Method that stops and ejects the cassett
     * @return Returns statement that the cassett is stopped and ejected
     */
    public String stopEject();
}