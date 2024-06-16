package com.ibear.ecommerce.customer;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
@Builder
public class Customer implements Serializable {

    @Id
    @NotNull
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}