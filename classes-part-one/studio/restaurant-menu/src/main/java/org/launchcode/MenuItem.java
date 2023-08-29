package org.launchcode;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category, boolean isClassic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isClassic = isClassic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean isNew) {
        this.isClassic = isClassic;
    }
}
