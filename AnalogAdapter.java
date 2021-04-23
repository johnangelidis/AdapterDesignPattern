/**
 * Class that represents an adapter that converts digital albums to analog albums
 */
public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    /**
     * Constructs an analog adapter by taking in a digital album
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }

    /**
     * Plays the list from the beginning and moves to the next song
     * @return Returns the next song
     */
    @Override
    public String play() {
        album.playFromBeginning();
        return album.nextSong();
    }
    /**
     * Rewinds to the previous song
     * @return the previous song
     */
    @Override
    public String rewind() {
        return album.prevSong();
    }
    /**
     * Advances to the next song
     * @return Returns the next song
     */
    @Override
    public String ffwd() {
        return album.nextSong();
    }
    /**
     * Pauses the song
     * @return Returns the paused song
     */
    @Override
    public String pause() {
        return album.pause();
    }
    /**
     * Stops and ejects the album
     * @return Returns a statement that the album is ejected
     */
    @Override
    public String stopEject() {
        return album.stopEject();
    }

    
}
