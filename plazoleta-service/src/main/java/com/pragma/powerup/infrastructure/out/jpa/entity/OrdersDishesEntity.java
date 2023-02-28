package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pedidos_platos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdersDishesEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private OrderEntity idOrderDish;
    private DishEntity idDishOrder;
    private String amount;
}
