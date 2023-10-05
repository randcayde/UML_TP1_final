package fr.efrei.Domain;

import java.util.Arrays;

public class Individual extends Customer {
    private String firstName, lastName, middleName, email, phone;
    private String locale = "English";

    private Details [] DetailsBilling = new Details[100];
    private Details [] DetailsShipping = new Details[100];

    // INITIALISATION : GETTERS, SETTERS AND DEFAULT CONSTRUCTORS ******************************************************

    public Individual(){}

    public Individual(int CRM_ID, CustomerType type, String description, String firstName, String lastName, String middleName, String email, String phone, String locale) {
        super(CRM_ID, type, description);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.locale = locale;

        for(int i=0;i<100;i++) {
            DetailsBilling[i] = new Details();
        }
        for(int i=0;i<100;i++) {
            DetailsShipping[i] = new Details();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
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
        return "Individual{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", locale='" + locale + '\'' +
                ", DetailsBilling=" + Arrays.toString(DetailsBilling) +
                ", DetailsShipping=" + Arrays.toString(DetailsShipping) +
                '}';
    }
    //******************************************************************************************************************

}



