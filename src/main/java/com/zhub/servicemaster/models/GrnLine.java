package com.zhub.servicemaster.models;
// Generated Nov 27, 2017 2:54:40 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * GrnLine generated by hbm2java
 */
public class GrnLine  implements java.io.Serializable {


     private Integer grnLineId;
     private Grn grn;
     private Item item;
     private Float unitPrice;
     private Float receivedQuantity;
     private Float discount;
     private Float subTotal;
     private Float costPrice;
     private Integer isActive;
     private Date createdDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;

    public GrnLine() {
    }

	
    public GrnLine(Grn grn, Item item) {
        this.grn = grn;
        this.item = item;
    }
    public GrnLine(Grn grn, Item item, Float unitPrice, Float receivedQuantity, Float discount, Float subTotal, Float costPrice, Integer isActive, Date createdDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark) {
       this.grn = grn;
       this.item = item;
       this.unitPrice = unitPrice;
       this.receivedQuantity = receivedQuantity;
       this.discount = discount;
       this.subTotal = subTotal;
       this.costPrice = costPrice;
       this.isActive = isActive;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
    }
   
    public Integer getGrnLineId() {
        return this.grnLineId;
    }
    
    public void setGrnLineId(Integer grnLineId) {
        this.grnLineId = grnLineId;
    }
    public Grn getGrn() {
        return this.grn;
    }
    
    public void setGrn(Grn grn) {
        this.grn = grn;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public Float getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Float getReceivedQuantity() {
        return this.receivedQuantity;
    }
    
    public void setReceivedQuantity(Float receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }
    public Float getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Float discount) {
        this.discount = discount;
    }
    public Float getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }
    public Float getCostPrice() {
        return this.costPrice;
    }
    
    public void setCostPrice(Float costPrice) {
        this.costPrice = costPrice;
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




}


