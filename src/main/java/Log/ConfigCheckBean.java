package Log;

public class ConfigCheckBean {
    private String configLoadedMessage;

    public void setConfigLoadedMessage(String configLoadedMessage) {
        this.configLoadedMessage = configLoadedMessage;
    }

    public void checkConfig() {
        System.out.println(configLoadedMessage);
    }
}


