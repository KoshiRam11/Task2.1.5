package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAccumulator;

@Component
public class Duck5 {

    private Egg6 egg6;

    public Duck5(Egg6 egg6){
        this.egg6=egg6;
    }

    @Autowired
    @Override
    public String toString() {
        return ", в утке яйцо " + "" + egg6.toString();
    }
}
