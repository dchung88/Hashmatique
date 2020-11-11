import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public void songsHashMap() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Fresh Prince of Bel Air", "This is a story all about how my life got twist-turned upside down and I liked to take a minute and sit right there and tell you how I became the prince of a town called Bel Air");
        trackList.put("Teenage Mutant Ninja Turtles", "Teenage Mutant Ninja Turtles, Teenage Mutant Ninja Turtles, Teenage Mutant Ninja Turtles, Heroes in a halfshell turtle power");
        trackList.put("Spiderman", "Spiderman, Spiderman, does whatever a spider can, spins a web any size, catches thieves just like flies, look out here comes the spiderman");
        trackList.put("Spongebob SquarePants", "Who lives ina pineapple under the sea? absorbent and yellow and porous is he? if nautical nonsense be something you wish, then drop on the deck and flop like a fish, Spongebob SquarePants");

        String singleTrack = trackList.get("Fresh Prince of Bel Air");
        System.out.println(singleTrack);

        Set<String> keys = trackList.keySet();
        for(String track : keys){
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
    }
}