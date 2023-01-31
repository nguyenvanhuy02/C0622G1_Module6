package com.c0722g1repobe.entity.customer;

import com.c0722g1repobe.entity.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    private String nameCustomer;
    @OneToMany(mappedBy = "customer")
    private Set<PhoneCustomer> phoneCustomerSet;
    private String emailCustomer;
    private String addressCustomer;
    private String idCardCustomer;
    private String codeCustomer;
    private Integer genderCustomer;
    private boolean flagDelete = false;
    private int approvalCustomer;
    @OneToOne
    private Account account;
}
