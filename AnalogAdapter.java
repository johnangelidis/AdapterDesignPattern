public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }

    @Override
    public String play() {
        album.playFromBeginning();
        return album.nextSong();
    }

    @Override
    public String rewind() {
        //album.prevSong();
        return album.prevSong();
    }

    @Override
    public String ffwd() {
        //album.nextSong();
        return album.nextSong();
    }

    @Override
    public String pause() {
        return album.pause();
    }

    @Override
    public String stopEject() {
        return album.stopEject();
    }

    
}
