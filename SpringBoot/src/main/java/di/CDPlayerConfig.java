package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wyjung on 2017-08-20.
 */

@Configuration
@ComponentScan({"di"}) // 기본 : 해당 패키지와 하위 패키지를 스캔
public class CDPlayerConfig {

    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

}
