package fr.efrei.Domain;

public abstract class Customer {
    private int CRM_ID;
    private CustomerType type;
    private String description;

    public Customer() {
    }
    public Customer(int CRM_ID, CustomerType type, String description) {
        this.CRM_ID = CRM_ID;
        this.type = type;
        this.description = description;
    }

    public int getCRM_ID() {
        return CRM_ID;
    }

    public void setCRM_ID(int CRM_ID) {
        this.CRM_ID = CRM_ID;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CRM_ID=" + CRM_ID +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
