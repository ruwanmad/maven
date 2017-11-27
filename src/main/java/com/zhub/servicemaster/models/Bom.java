package com.zhub.servicemaster.models;
// Generated Nov 27, 2017 2:54:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Bom generated by hbm2java
 */
public class Bom  implements java.io.Serializable {


     private String bomCode;
     private Item item;
     private String bomName;
     private Float sellingPrice;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private Set bomItems = new HashSet(0);

    public Bom() {
    }

	
    public Bom(String bomCode, Item item) {
        this.bomCode = bomCode;
        this.item = item;
    }
    public Bom(String bomCode, Item item, String bomName, Float sellingPrice, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, Set bomItems) {
       this.bomCode = bomCode;
       this.item = item;
       this.bomName = bomName;
       this.sellingPrice = sellingPrice;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.bomItems = bomItems;
    }
   
    public String getBomCode() {
        return this.bomCode;
    }
    
    public void setBomCode(String bomCode) {
        this.bomCode = bomCode;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public String getBomName() {
        return this.bomName;
    }
    
    public void setBomName(String bomName) {
        this.bomName = bomName;
    }
    public Float getSellingPrice() {
        return this.sellingPrice;
    }
    
    public void setSellingPrice(Float sellingPrice) {
        this.sellingPrice = sellingPrice;
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
    public Set getBomItems() {
        return this.bomItems;
    }
    
    public void setBomItems(Set bomItems) {
        this.bomItems = bomItems;
    }




}


