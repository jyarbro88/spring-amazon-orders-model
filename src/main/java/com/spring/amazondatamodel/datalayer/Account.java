package com.spring.amazondatamodel.datalayer;

import com.fasterxml.jackson.annotation.*;
import com.spring.amazondatamodel.datalayer.daos.AddressDAO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "first_name")
    @JsonProperty("firstName")
    private String firstName;
    @Column(name = "last_name")
    @JsonProperty("lastName")
    private String lastName;
    @Column(name = "email")
    @JsonProperty("email")
    private String email;
    @OneToMany()
    private List<AddressDAO> addressDAOS;

    public Account() { }

    // Todo do i send in Address object or just address id
    public Account(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public List<AddressDAO> getAddressDAOS() {
        return addressDAOS;
    }

    public void setAddressDAOS(List<AddressDAO> addressDAOS) {
        this.addressDAOS = addressDAOS;
    }
}
