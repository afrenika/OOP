package Fasad;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Html> htmlMap = new HashMap<>();
        htmlMap.put("11.444.22", new Html("мяу"));
        htmlMap.put("55.4445.122", new Html("мяу-мяу"));
        htmlMap.put("667.33.222", new Html("мяу-мяу-мяу"));

        Server server = new Server(new ServerSoftware(new HandlerProgram()), htmlMap);
        Protocol tcp = new TCP();
        Map<String, String> map = new HashMap<>();
        map.put("котики_спасут_мир.рф", "11.444.22");
        map.put("котики-самые_лучшие_питомцы.орг", "55.4445.122");
        map.put("смотреть_на_котиков.ру", "667.33.222");
        DMSn dmSn = new DMSn(map);
        DNS dns = new DNS(dmSn);
        Browser bestBrowser = new Browser(dns, server, tcp);


        bestBrowser.GoToTheWebsite("смотреть_на_котиков.ру");
    }
}
