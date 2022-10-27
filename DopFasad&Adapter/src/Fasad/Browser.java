package Fasad;

public class Browser {

    DNS dns;
    Server server;
    Protocol TCP;

    public Browser(DNS dns, Server server, Protocol TCP) {
        this.dns = dns;
        this.server = server;
        this.TCP = TCP;
    }

    public void GoToTheWebsite(String website){
        try{
        String ip = dns.search(website);
        server.connect(TCP, ip);
        server.show();}
        catch (Exception e){
            System.out.println("Сайт не найден.");
        }

    }



}
