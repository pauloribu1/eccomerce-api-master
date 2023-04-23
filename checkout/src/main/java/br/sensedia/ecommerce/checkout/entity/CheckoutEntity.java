package br.sensedia.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Data
@Builder
@Table
@Entity
public class CheckoutEntity {

    @Id
    @GeneratedValue()
    private Long Id;

    @Column
    private String code;

}


