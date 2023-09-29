package Module2ClassesAndObjects.RegExp;

public class Client {
    private String email;
    private String ip;
    private String address;
    private String url;
    private String name;

    public Client(String email, String ip, String address, String url, String name) {
        this.email = email;
        this.ip = ip;
        this.address = address;
        this.url = url;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
