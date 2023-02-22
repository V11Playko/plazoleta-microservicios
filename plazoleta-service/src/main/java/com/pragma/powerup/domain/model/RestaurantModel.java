package com.pragma.powerup.domain.model;

public class RestaurantModel {
    private Long idRestaurant;
    private String nameRestaurant;
    private String addressRestaurant;
    private String idOwner;
    private String phoneRestaurant;
    private String urlLogo;
    private String nit;

    public RestaurantModel(Long idRestaurant, String nameRestaurant, String addressRestaurant, String idOwner, String phoneRestaurant, String urlLogo, String nit) {
        this.idRestaurant = idRestaurant;
        this.nameRestaurant = nameRestaurant;
        this.addressRestaurant = addressRestaurant;
        this.idOwner = idOwner;
        this.phoneRestaurant = phoneRestaurant;
        this.urlLogo = urlLogo;
        this.nit = nit;
    }

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public String getAddressRestaurant() {
        return addressRestaurant;
    }

    public void setAddressRestaurant(String addressRestaurant) {
        this.addressRestaurant = addressRestaurant;
    }

    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
        this.idOwner = idOwner;
    }

    public String getPhoneRestaurant() {
        return phoneRestaurant;
    }

    public void setPhoneRestaurant(String phoneRestaurant) {
        this.phoneRestaurant = phoneRestaurant;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
