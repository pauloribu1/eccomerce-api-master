package br.sensedia.ecommerce.checkout.service;

import br.sensedia.ecommerce.checkout.entity.CheckoutEntity;
import br.sensedia.ecommerce.checkout.repository.CheckoutRepository;
import br.sensedia.ecommerce.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor //vai garantir que o construtor de todos "final" sejam produzidos
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(@RequestBody CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();

        if (checkoutRepository != null) {
            return Optional.of(checkoutRepository.save(checkoutEntity));
        } else {
            // caso o checkoutRepository seja null, você pode fazer algo aqui, como lançar uma exceção ou retornar Optional.empty()
            return Optional.empty();
        }
    }
}
