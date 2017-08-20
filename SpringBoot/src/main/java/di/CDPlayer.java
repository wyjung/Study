package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by wyjung on 2017-08-20.
 */

@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc cd;

    /*@Autowired
    public CDPlayer(CompactDisc cd ) {
        this.cd = cd;
    }*/

    @Override
    public void play() {
        cd.play();
    }
}
