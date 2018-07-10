//package com.spring.amazondatamodel.datalayer.daos;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "addresses")
//@PrimaryKeyJoinColumn(name = "accountId")
//public class AddressDAO {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    @ManyToMany
//    @JoinColumn(name = "accountId")
//    private Long accountId;
//    @Column(name = "address_one")
//    private String addressOne;
//    @Column(name = "address_two")
//    private String addressTwo;
//    @Column(name = "city")
//    private String city;
//    @Column(name = "state")
//    private String state;
//    @Column(name = "zip_code")
//    private String zipCode;
//    @Column(name = "country")
//    private String country;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getAccountId() {
//        return accountId;
//    }
//
//    public void setAccountId(Long accountId) {
//        this.accountId = accountId;
//    }
//
//    public String getAddressOne() {
//        return addressOne;
//    }
//
//    public void setAddressOne(String addressOne) {
//        this.addressOne = addressOne;
//    }
//
//    public String getAddressTwo() {
//        return addressTwo;
//    }
//
//    public void setAddressTwo(String addressTwo) {
//        this.addressTwo = addressTwo;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getZipCode() {
//        return zipCode;
//    }
//
//    public void setZipCode(String zipCode) {
//        this.zipCode = zipCode;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//}
