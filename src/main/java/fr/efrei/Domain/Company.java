package fr.efrei.Domain;

import java.util.Arrays;

public class Company extends Customer {
    private String name, phone, fax;

    private Contact [] ContactList = new Contact[100];
    private Details [] DetailsBilling = new Details[100];
    private Details [] DetailsShipping = new Details[100];

    public Company() {
    }
    public Company(int CRM_ID, CustomerType type, String description, String name, String phone, String fax) {
        super(CRM_ID, type, description);
        this.name = name;
        this.phone = phone;
        this.fax = fax;

        for(int i=0;i<100;i++) {
            ContactList[i] = new Contact();
        }
        for(int i=0;i<100;i++) {
            DetailsBilling[i] = new Details();
        }
        for(int i=0;i<100;i++) {
            DetailsShipping[i] = new Details();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Contact[] getContactList() {
        return ContactList;
    }

    public void setContactList(Contact[] contactList) {
        ContactList = contactList;
    }

    public Details[] getDetailsBilling() {
        return DetailsBilling;
    }

    public void setDetailsBilling(Details[] detailsBilling) {
        DetailsBilling = detailsBilling;
    }

    public Details[] getDetailsShipping() {
        return DetailsShipping;
    }

    public void setDetailsShipping(Details[] detailsShipping) {
        DetailsShipping = detailsShipping;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", ContactList=" + Arrays.toString(ContactList) +
                ", DetailsBilling=" + Arrays.toString(DetailsBilling) +
                ", DetailsShipping=" + Arrays.toString(DetailsShipping) +
                '}';
    }
}
