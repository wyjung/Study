package di;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by wyjung on 2017-08-20.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    //@Rule
    //public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
        assertNotNull(player);
    }

    /*@Test
    public void play() {
        player.play();
        //Playing Sgt.Pepper's Lonely Hearts Club Band by The Beatles
        assertEquals("Playing Sgt.Pepper's Lonely Hearts Club Band by The Beatles\n"
                , log.getLog());
    }*/
}

