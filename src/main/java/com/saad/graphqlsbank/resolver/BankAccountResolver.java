package com.saad.graphqlsbank.resolver;

import com.saad.graphqlsbank.bank.BankAccount;
import com.saad.graphqlsbank.bank.Currency;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Slf4j
@Component
public class BankAccountResolver  {
    public BankAccount bankAccount(UUID id) {

log.info("Retriving Bank Account id:{}",id);
return BankAccount.builder().id(id).currency(Currency.PKR).name("Saad").build();

    }
}
