package fr.efrei.Domain;

import java.util.Arrays;

public class Product {
    private int id;
    private String name;
    private String description;
    private LockingType lockingType;
    private Rehost rehost;

    private Product [] ProductList = new Product[100];
    private Feature [] FeatureList = new Feature[100];

    public Product() {
    }

    // losange vide donc initialisation dans le constructeur
        public Product(int id, String name, String description, LockingType lockingType, Rehost rehost, Feature FeatureList[]) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.lockingType = lockingType;
        this.rehost = rehost;
        for(int i=0 ; i<100 ; i++){
            this.FeatureList[i] = FeatureList[i]; //on a besoin de créer FeatureList dans le main avant d'utiliser ça
        }
        for(int i=0;i<100;i++) {
            ProductList[i] = new Product();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LockingType getLockingType() {
        return lockingType;
    }

    public void setLockingType(LockingType lockingType) {
        this.lockingType = lockingType;
    }

    public Rehost getRehost() {
        return rehost;
    }

    public void setRehost(Rehost rehost) {
        this.rehost = rehost;
    }

    public Product[] getProductList() {
        return ProductList;
    }

    public void setProductList(Product[] productList) {
        ProductList = productList;
    }

    public Feature[] getFeatureList() {
        return FeatureList;
    }

    public void setFeatureList(Feature[] featureList) {
        FeatureList = featureList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", lockingType=" + lockingType +
                ", rehost=" + rehost +
                ", ProductList=" + Arrays.toString(ProductList) +
                ", FeatureList=" + Arrays.toString(FeatureList) +
                '}';
    }
}
