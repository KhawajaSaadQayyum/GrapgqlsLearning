package com.saad.graphqlsbank.bank;

import lombok.Builder;
import lombok.Setter;

import java.util.UUID;
@Setter
@Builder
public class Client {

    UUID id;
    String firstName;
    String middleName;
    String lastName;
    Client client;
}
