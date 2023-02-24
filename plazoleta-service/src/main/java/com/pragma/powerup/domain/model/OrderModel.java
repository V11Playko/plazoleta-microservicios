package com.pragma.powerup.domain.model;

public class OrderModel {
    private OrdersDishesModel idOrder;
    private String idClient;
    private String dateOrder;
    private String stateOrder;
    private String idChef;
    private RestaurantModel restaurantOrder;

    public OrderModel(OrdersDishesModel idOrder, String idClient, String dateOrder, String stateOrder, String idChef, RestaurantModel restaurantOrder) {
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.dateOrder = dateOrder;
        this.stateOrder = stateOrder;
        this.idChef = idChef;
        this.restaurantOrder = restaurantOrder;
    }

    public OrdersDishesModel getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(OrdersDishesModel idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(String stateOrder) {
        this.stateOrder = stateOrder;
    }

    public String getIdChef() {
        return idChef;
    }

    public void setIdChef(String idChef) {
        this.idChef = idChef;
    }

    public RestaurantModel getRestaurantOrder() {
        return restaurantOrder;
    }

    public void setRestaurantOrder(RestaurantModel restaurantOrder) {
        this.restaurantOrder = restaurantOrder;
    }
}
