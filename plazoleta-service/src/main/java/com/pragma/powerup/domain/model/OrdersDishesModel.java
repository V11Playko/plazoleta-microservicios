package com.pragma.powerup.domain.model;

import org.aspectj.weaver.ast.Or;

public class OrdersDishesModel {
    private Long idDishOrder;
    private String amount;

    public OrdersDishesModel(Long idDishOrder, String amount) {
        this.idDishOrder = idDishOrder;
        this.amount = amount;
    }
    public Long getIdDishOrder() {
        return idDishOrder;
    }

    public void setIdDishOrder(Long idDishOrder) {
        this.idDishOrder = idDishOrder;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
