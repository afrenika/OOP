package Fasad;

import java.util.Map;

public class DNS {

    DMSn dmSn;

    public DNS(DMSn dmSn) {
        this.dmSn = dmSn;
    }

    public String search(String d){
        return dmSn.search(d);
    }
}
