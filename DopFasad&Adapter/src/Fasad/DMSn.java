package Fasad;

import java.util.Map;

public class DMSn {

    Map<String, String> map;

    public DMSn(Map<String, String> map) {
        this.map = map;
    }

    public String search(String s){
        System.out.println("Поиск доменного имени более высокого уровня");
        if (map.containsKey(s)) return map.get(s);
        else throw new RuntimeException();

    }
}
