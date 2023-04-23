package br.sensedia.ecommerce.checkout.resource.checkout;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.sensedia.ecommerce.checkout.service.CheckoutService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
        checkoutService.create(checkoutRequest);
        return ResponseEntity.ok().build();

    }
}
