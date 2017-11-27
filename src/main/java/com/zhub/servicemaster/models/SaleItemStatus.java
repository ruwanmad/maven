package com.zhub.servicemaster.models;
// Generated Nov 27, 2017 2:54:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SaleItemStatus generated by hbm2java
 */
public class SaleItemStatus  implements java.io.Serializable {


     private Integer itemStatusId;
     private String itemStatusDescription;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set saleItems = new HashSet(0);

    public SaleItemStatus() {
    }

    public SaleItemStatus(String itemStatusDescription, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set saleItems) {
       this.itemStatusDescription = itemStatusDescription;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.saleItems = saleItems;
    }
   
    public Integer getItemStatusId() {
        return this.itemStatusId;
    }
    
    public void setItemStatusId(Integer itemStatusId) {
        this.itemStatusId = itemStatusId;
    }
    public String getItemStatusDescription() {
        return this.itemStatusDescription;
    }
    
    public void setItemStatusDescription(String itemStatusDescription) {
        this.itemStatusDescription = itemStatusDescription;
    }
    public Integer getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    public Integer getCreatedUser() {
        return this.createdUser;
    }
    
    public void setCreatedUser(Integer createdUser) {
        this.createdUser = createdUser;
    }
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    public Date getModifiedTime() {
        return this.modifiedTime;
    }
    
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    public Integer getModifiedUser() {
        return this.modifiedUser;
    }
    
    public void setModifiedUser(Integer modifiedUser) {
        this.modifiedUser = modifiedUser;
    }
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Set getSaleItems() {
        return this.saleItems;
    }
    
    public void setSaleItems(Set saleItems) {
        this.saleItems = saleItems;
    }




}


