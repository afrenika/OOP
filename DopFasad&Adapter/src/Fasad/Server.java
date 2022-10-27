package Fasad;

import java.util.Map;

public class Server {
    ServerSoftware serverSoftware;
    boolean connection;
    String website;

    Map<String, Html> htmlMap;

    public Server(ServerSoftware serverSoftware, Map<String, Html> m) {
        this.serverSoftware = serverSoftware;
        connection = false;
        htmlMap = m;

    }

    public void connect(Protocol protocol, String website){
        System.out.println("установка соединения с сайтом");
        protocol.setRules();
        System.out.println("connection with " + website);
        connection = true;
        this.website = website;
    }

    public void show(){
        serverSoftware.requestProcessing();
        System.out.println("Приятного просмотра");
        htmlMap.get(website).showOnScreen();
    }
}
