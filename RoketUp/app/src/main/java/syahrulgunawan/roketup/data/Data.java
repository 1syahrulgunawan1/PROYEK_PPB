package syahrulgunawan.roketup.data;

public class Data {
    private String id, roket;

    public Data() {
    }

    public Data(String id, String roket) {
        this.id = id;
        this.roket = roket;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoket() {
        return roket;
    }

    public void setRoket(String roket) {
        this.roket = roket;
    }

}