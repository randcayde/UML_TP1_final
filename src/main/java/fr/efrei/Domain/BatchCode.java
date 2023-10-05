package fr.efrei.Domain;

public class BatchCode {
    private String id;
    public BatchCode() {
    }
    public BatchCode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BatchCode{" +
                "id='" + id + '\'' +
                '}';
    }
}
