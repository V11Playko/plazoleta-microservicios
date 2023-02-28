package com.pragma.powerup.infrastructure.out.jpa.entity;

import com.pragma.powerup.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "order")
    @JoinColumn(name = "id_DishOrder")
    private OrderEntity idOrder;
    private String idClient;
    private String dateOrder;
    private String stateOrder;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    @JoinColumn(name = "id_chef")
    private String idChef;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    @JoinColumn(name = "id_restaurantt")
    private RestaurantEntity idRestaurant;
}
