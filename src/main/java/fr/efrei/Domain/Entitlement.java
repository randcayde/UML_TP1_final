package fr.efrei.Domain;

import java.util.Date;

//import static javax.management.MBeanServerFactory.builder;

public class Entitlement {
    private String EID;
    private EntitlementType type;
    private Date startDate;
    private Date endDate;
    private boolean neverExpires;
    private String comments;

    private Entitlement() {}

    // add one more constructor
    private Entitlement(Builder builder) {
        this.EID = builder.EID;
        this.type = builder.type;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.neverExpires = builder.neverExpires;
        this.comments = builder.comments;
    }

    public String getEID() {
        return EID;
    }

    public EntitlementType getType() {
        return type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isNeverExpires() {
        return neverExpires;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Entitlement{" +
                "EID='" + EID + '\'' +
                ", type=" + type +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", neverExpires=" + neverExpires +
                ", comments='" + comments + '\'' +
                '}';
    }

    public static class Builder {
        private String EID;
        private EntitlementType type;
        private Date startDate;
        private Date endDate;
        private boolean neverExpires;
        private String comments;

        public Builder setEID(String EID) {
            this.EID = EID;
            return this;
        }

        public Builder setType(EntitlementType type) {
            this.type = type;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setNeverExpires(boolean neverExpires) {
            this.neverExpires = neverExpires;
            return this;
        }

        public Builder setComments(String comments) {
            this.comments = comments;
            return this;
        }

        public Builder copy(Entitlement entitlement) {
            this.EID = entitlement.EID;
            this.type = entitlement.type;
            this.startDate = entitlement.startDate;
            this.endDate = entitlement.endDate;
            this.neverExpires = entitlement.neverExpires;
            this.comments = entitlement.comments;
            return this;
        }

        public Entitlement build() { return new Entitlement(this); }
    }
}
