package di;

import org.springframework.stereotype.Component;

/**
 * Created by wyjung on 2017-08-20.
 */

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
