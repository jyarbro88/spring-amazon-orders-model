package com.spring.amazondatamodel.datalayer;

import com.spring.amazondatamodel.datalayer.daos.AddressDAO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contacts")
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @OneToMany
    @JoinColumn(name = "address_id")
    private List<AddressDAO> addressDAOs;

    public Account() { }

    public Account(String firstName, String lastName, String email, List<AddressDAO> addressDAOs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressDAOs = addressDAOs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AddressDAO> getAddressDAOs() {
        return addressDAOs;
    }

    public void setAddressDAOs(List<AddressDAO> addressDAOs) {
        this.addressDAOs = addressDAOs;
    }
}
