package com.pragma.powerup.domain.model;

public class CategoryDishModel {
    private String nameCategory;
    private String descriptionCategory;

    public CategoryDishModel( String nameCategory, String descriptionCategory) {
        this.nameCategory = nameCategory;
        this.descriptionCategory = descriptionCategory;
    }


    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }
}
