package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
