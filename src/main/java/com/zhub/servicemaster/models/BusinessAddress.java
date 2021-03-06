package com.zhub.servicemaster.models;
// Generated Nov 27, 2017 2:54:40 PM by Hibernate Tools 4.3.1



/**
 * BusinessAddress generated by hbm2java
 */
public class BusinessAddress  implements java.io.Serializable {


     private BusinessAddressId id;
     private Address address;
     private BusinessPartner businessPartner;

    public BusinessAddress() {
    }

    public BusinessAddress(BusinessAddressId id, Address address, BusinessPartner businessPartner) {
       this.id = id;
       this.address = address;
       this.businessPartner = businessPartner;
    }
   
    public BusinessAddressId getId() {
        return this.id;
    }
    
    public void setId(BusinessAddressId id) {
        this.id = id;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public BusinessPartner getBusinessPartner() {
        return this.businessPartner;
    }
    
    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }




}


