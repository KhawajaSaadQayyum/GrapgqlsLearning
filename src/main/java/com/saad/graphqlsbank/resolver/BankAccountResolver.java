package com.saad.graphqlsbank.resolver;

import com.saad.graphqlsbank.bank.BankAccount;
import com.saad.graphqlsbank.bank.Client;
import com.saad.graphqlsbank.bank.Currency;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver {
    public BankAccount bankAccount(UUID id) {

        log.info("Retriving Bank Account id:{}", id);
        var clientA = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Khawaja ").middleName("Saad").lastName("Qayyum").build();
        var clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Khawaja ").middleName("Husnain").lastName("Qayyum").build();
        clientA.setClient(clientB);
        clientB.setClient(clientA);
        return BankAccount.builder().id(id).currency(Currency.PKR).name("Saad").build();

    }
}
