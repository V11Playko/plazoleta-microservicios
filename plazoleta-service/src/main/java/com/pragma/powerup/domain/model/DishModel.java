package com.pragma.powerup.domain.model;

public class DishModel {
    private OrdersDishesModel idDish;
    private String nameDish;
    private CategoryDishModel idCategory;
    private String descriptionDish;
    private String priceDish;
    private RestaurantModel restaurantDish;
    private String urlImageDish;
    private String stateDish;

    public DishModel(OrdersDishesModel idDish, String nameDish, CategoryDishModel idCategory, String descriptionDish, String priceDish, RestaurantModel restaurantDish, String urlImageDish, String stateDish) {
        this.idDish = idDish;
        this.nameDish = nameDish;
        this.idCategory = idCategory;
        this.descriptionDish = descriptionDish;
        this.priceDish = priceDish;
        this.restaurantDish = restaurantDish;
        this.urlImageDish = urlImageDish;
        this.stateDish = stateDish;
    }

    public OrdersDishesModel getIdDish() {
        return idDish;
    }

    public void setIdDish(OrdersDishesModel idDish) {
        this.idDish = idDish;
    }

    public String getNameDish() {
        return nameDish;
    }

    public void setNameDish(String nameDish) {
        this.nameDish = nameDish;
    }

    public CategoryDishModel getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(CategoryDishModel idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescriptionDish() {
        return descriptionDish;
    }

    public void setDescriptionDish(String descriptionDish) {
        this.descriptionDish = descriptionDish;
    }

    public String getPriceDish() {
        return priceDish;
    }

    public void setPriceDish(String priceDish) {
        this.priceDish = priceDish;
    }

    public RestaurantModel getRestaurantDish() {
        return restaurantDish;
    }

    public void setRestaurantDish(RestaurantModel restaurantDish) {
        this.restaurantDish = restaurantDish;
    }

    public String getUrlImageDish() {
        return urlImageDish;
    }

    public void setUrlImageDish(String urlImageDish) {
        this.urlImageDish = urlImageDish;
    }

    public String getStateDish() {
        return stateDish;
    }

    public void setStateDish(String stateDish) {
        this.stateDish = stateDish;
    }
}
