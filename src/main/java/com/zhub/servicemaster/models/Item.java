package com.zhub.servicemaster.models;
// Generated Nov 27, 2017 2:54:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Item generated by hbm2java
 */
public class Item  implements java.io.Serializable {


     private String itemCode;
     private Item item;
     private ItemBrand itemBrand;
     private SubCategory subCategory;
     private Uom uomByBuyingUom;
     private Uom uomBySellingUom;
     private String itemName;
     private String printName;
     private String searchKey;
     private String issueMethod;
     private Float reorderQuantity;
     private Float itemQuantity;
     private Integer isPhysical;
     private Integer isActive;
     private Boolean fromBom;
     private Date creadetDate;
     private Date createdTime;
     private Integer createdUser;
     private Date modifiedDate;
     private Date modifiedTime;
     private Integer modifiedUser;
     private String remark;
     private String rackSlotCode;
     private int issueMethodId;
     private String itemTypeCode;
     private Set items = new HashSet(0);
     private Set boms = new HashSet(0);
     private Set grnLines = new HashSet(0);
     private Set sellingPrices = new HashSet(0);
     private Set saleItems = new HashSet(0);
     private Set stocks = new HashSet(0);
     private Set bomItems = new HashSet(0);

    public Item() {
    }

	
    public Item(String itemCode, SubCategory subCategory, Uom uomByBuyingUom, Uom uomBySellingUom, String itemName, String rackSlotCode, int issueMethodId, String itemTypeCode) {
        this.itemCode = itemCode;
        this.subCategory = subCategory;
        this.uomByBuyingUom = uomByBuyingUom;
        this.uomBySellingUom = uomBySellingUom;
        this.itemName = itemName;
        this.rackSlotCode = rackSlotCode;
        this.issueMethodId = issueMethodId;
        this.itemTypeCode = itemTypeCode;
    }
    public Item(String itemCode, Item item, ItemBrand itemBrand, SubCategory subCategory, Uom uomByBuyingUom, Uom uomBySellingUom, String itemName, String printName, String searchKey, String issueMethod, Float reorderQuantity, Float itemQuantity, Integer isPhysical, Integer isActive, Boolean fromBom, Date creadetDate, Date createdTime, Integer createdUser, Date modifiedDate, Date modifiedTime, Integer modifiedUser, String remark, String rackSlotCode, int issueMethodId, String itemTypeCode, Set items, Set boms, Set grnLines, Set sellingPrices, Set saleItems, Set stocks, Set bomItems) {
       this.itemCode = itemCode;
       this.item = item;
       this.itemBrand = itemBrand;
       this.subCategory = subCategory;
       this.uomByBuyingUom = uomByBuyingUom;
       this.uomBySellingUom = uomBySellingUom;
       this.itemName = itemName;
       this.printName = printName;
       this.searchKey = searchKey;
       this.issueMethod = issueMethod;
       this.reorderQuantity = reorderQuantity;
       this.itemQuantity = itemQuantity;
       this.isPhysical = isPhysical;
       this.isActive = isActive;
       this.fromBom = fromBom;
       this.creadetDate = creadetDate;
       this.createdTime = createdTime;
       this.createdUser = createdUser;
       this.modifiedDate = modifiedDate;
       this.modifiedTime = modifiedTime;
       this.modifiedUser = modifiedUser;
       this.remark = remark;
       this.rackSlotCode = rackSlotCode;
       this.issueMethodId = issueMethodId;
       this.itemTypeCode = itemTypeCode;
       this.items = items;
       this.boms = boms;
       this.grnLines = grnLines;
       this.sellingPrices = sellingPrices;
       this.saleItems = saleItems;
       this.stocks = stocks;
       this.bomItems = bomItems;
    }
   
    public String getItemCode() {
        return this.itemCode;
    }
    
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public ItemBrand getItemBrand() {
        return this.itemBrand;
    }
    
    public void setItemBrand(ItemBrand itemBrand) {
        this.itemBrand = itemBrand;
    }
    public SubCategory getSubCategory() {
        return this.subCategory;
    }
    
    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }
    public Uom getUomByBuyingUom() {
        return this.uomByBuyingUom;
    }
    
    public void setUomByBuyingUom(Uom uomByBuyingUom) {
        this.uomByBuyingUom = uomByBuyingUom;
    }
    public Uom getUomBySellingUom() {
        return this.uomBySellingUom;
    }
    
    public void setUomBySellingUom(Uom uomBySellingUom) {
        this.uomBySellingUom = uomBySellingUom;
    }
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getPrintName() {
        return this.printName;
    }
    
    public void setPrintName(String printName) {
        this.printName = printName;
    }
    public String getSearchKey() {
        return this.searchKey;
    }
    
    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
    public String getIssueMethod() {
        return this.issueMethod;
    }
    
    public void setIssueMethod(String issueMethod) {
        this.issueMethod = issueMethod;
    }
    public Float getReorderQuantity() {
        return this.reorderQuantity;
    }
    
    public void setReorderQuantity(Float reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
    public Float getItemQuantity() {
        return this.itemQuantity;
    }
    
    public void setItemQuantity(Float itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public Integer getIsPhysical() {
        return this.isPhysical;
    }
    
    public void setIsPhysical(Integer isPhysical) {
        this.isPhysical = isPhysical;
    }
    public Integer getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
    public Boolean getFromBom() {
        return this.fromBom;
    }
    
    public void setFromBom(Boolean fromBom) {
        this.fromBom = fromBom;
    }
    public Date getCreadetDate() {
        return this.creadetDate;
    }
    
    public void setCreadetDate(Date creadetDate) {
        this.creadetDate = creadetDate;
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
    public String getRackSlotCode() {
        return this.rackSlotCode;
    }
    
    public void setRackSlotCode(String rackSlotCode) {
        this.rackSlotCode = rackSlotCode;
    }
    public int getIssueMethodId() {
        return this.issueMethodId;
    }
    
    public void setIssueMethodId(int issueMethodId) {
        this.issueMethodId = issueMethodId;
    }
    public String getItemTypeCode() {
        return this.itemTypeCode;
    }
    
    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }
    public Set getBoms() {
        return this.boms;
    }
    
    public void setBoms(Set boms) {
        this.boms = boms;
    }
    public Set getGrnLines() {
        return this.grnLines;
    }
    
    public void setGrnLines(Set grnLines) {
        this.grnLines = grnLines;
    }
    public Set getSellingPrices() {
        return this.sellingPrices;
    }
    
    public void setSellingPrices(Set sellingPrices) {
        this.sellingPrices = sellingPrices;
    }
    public Set getSaleItems() {
        return this.saleItems;
    }
    
    public void setSaleItems(Set saleItems) {
        this.saleItems = saleItems;
    }
    public Set getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set stocks) {
        this.stocks = stocks;
    }
    public Set getBomItems() {
        return this.bomItems;
    }
    
    public void setBomItems(Set bomItems) {
        this.bomItems = bomItems;
    }




}

