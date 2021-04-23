import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    public Cassett(String song1, String song2, String song3, String song4, String song5){
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    @Override
    public String play() {
        if(currentIndex < 5){
            String temp = "Playing song " + currentIndex + ": " + songs.get(currentIndex);
            currentIndex++;
            return temp;
        }
        else{
            return "At the end of the cassett you need to rewind";
        }
    }

    @Override
    public String rewind() {
        if(currentIndex==0){
            return "Fully Re-Wound";
        }
        else{
            --currentIndex;
            return "Rewinding to song " + currentIndex;
        }
    }

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
            String temp = "Forwarding to song " + currentIndex;
            currentIndex++;
            return temp;
        }
    }

    @Override
    public String pause() {
        return "Pausing song " + currentIndex + ": " + songs.get(currentIndex);
    }

    @Override
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
