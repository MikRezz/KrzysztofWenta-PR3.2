package devices;

import java.net.URL;
import java.util.List;

public class Phone extends Device{
    String name;
    String os;
    String AppName;
    Boolean version;
    String server;
    public static final String DEFAULT_APP_SERVER_ADDRESS = "www.example.com";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_VERSION_NAME = "1.0";
    @Override
    public void turnOn() {
        System.out.println("Włączono ! ");
    }

    void Install (String AppName){

    }
    void Install(String appName, Boolean version){

    }
    void Install(String appName,Boolean version,String server){

    }
    void Install(List<String> app){

    }
    void  Install(URL url){

    }
}
