package br.sensedia.ecommerce.checkout.service;

import br.sensedia.ecommerce.checkout.entity.CheckoutEntity;
import br.sensedia.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
