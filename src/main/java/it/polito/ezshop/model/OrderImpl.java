package it.polito.ezshop.model;

import it.polito.ezshop.data.Order;

public class OrderImpl implements Order {

    Integer balanceId;

    public OrderImpl(Integer balanceId, String productCode, double pricePerUnit, int quantity, String status, Integer orderId) {
        this.balanceId = balanceId;
        this.productCode = productCode;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        this.status = status;
        this.orderId = orderId;
    }

    String productCode;
    double pricePerUnit;
    int quantity;
    String status;
    Integer orderId;

    @Override
    public Integer getBalanceId() {
        return this.balanceId;
    }

    @Override
    public void setBalanceId(Integer balanceId) {
        if(balanceId == null)
            return;
        this.balanceId = balanceId;
    }

    @Override
    public String getProductCode() {
        return this.productCode;
    }

    @Override
    public void setProductCode(String productCode) {
        if(productCode == null)
            return;
        this.productCode = productCode;
    }

    @Override
    public double getPricePerUnit() {
        return this.pricePerUnit;
    }

    @Override
    public void setPricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public int getQuantity() { return this.quantity; }

    @Override
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(String status) {
        if(status == null)
            return;
        this.status = status;
    }

    @Override
    public Integer getOrderId() {
        return this.orderId;
    }

    @Override
    public void setOrderId(Integer orderId) {
        if(orderId == null)
            return;
        this.orderId = orderId;
    }
}
