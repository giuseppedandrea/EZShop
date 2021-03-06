package it.polito.ezshop.model;

import it.polito.ezshop.data.BalanceOperation;
import it.polito.ezshop.data.SaleTransaction;
import it.polito.ezshop.data.TicketEntry;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SaleTransactionImpl implements SaleTransaction {


    Integer transactionId;
    Double amount;



    enum State{PAYED, CLOSED, INPROGRESS};
    State state;
    enum PaymentType{CARD, CASH};
    PaymentType pay;
    Double discountRate;
    //HashMap< ProductTypeImpl, Integer> listOfProductsSale =new HashMap<>();
    HashMap<String ,TicketEntry> listOfProductsEntries= new HashMap<>();
    List<String> listRFID=new ArrayList<>();
    CustomerImpl transactionCard;
    BalanceOperation saleOperationRecord;


    //contructor for new sale trasaction
    public SaleTransactionImpl(Integer transactionId/*, Double currrentamount, Double salediscountRate,
			Map<ProductType, Integer> listOfProductsSale, LoyaltyCard transactionCard,
			BalanceOperation saleOperationRecord*/) {

        this.transactionId = transactionId;
        this.state=State.INPROGRESS;
        this.amount=0.0;
        this.discountRate=0.0;

        //this.currentamount = currrentamount;
	/*	this.salediscountRate = salediscountRate;
		this.listOfProductsSale = listOfProductsSale;
		this.transactionCard = transactionCard;
		this.saleOperationRecord = saleOperationRecord;*/
    }


    //constructor for loading data from db
    public SaleTransactionImpl(int transactionId, String stat, String paymentType, double amount, double discountRate, CustomerImpl transactionCardId, BalanceOperationImpl balanceOperationId, HashMap<String,TicketEntry> listOfProductsEntries/*, HashMap< ProductTypeImpl, Integer> listofprod*/) {
        this.transactionId = transactionId;
        this.state= State.valueOf(stat);
        this.amount = amount;
		this.discountRate = discountRate;
		//this.listOfProductsSale=listofprod;
        if(listOfProductsEntries!=null) {
            this.listOfProductsEntries = listOfProductsEntries;
        }
		this.transactionCard = transactionCardId;
		this.saleOperationRecord = balanceOperationId;
    }

    /*
    public HashMap<ProductTypeImpl, Integer> getListOfProductsSale() {
        return listOfProductsSale;
    }
    */
    public List<String> getListOfRFIDs(){
        return this.listRFID;
    }
    public void addRFID (String id){
        this.listRFID.add(id);
    }
    public void removeRFID(String rfid) {
        this.listRFID.remove(rfid);
    }
    public HashMap<String, TicketEntry> getListOfProductsEntries() {
        return this.listOfProductsEntries;
    }

    public String getPayString() {
        return pay.toString();
    }
    public String getStateString() {
        return state.toString();
    }

    @Override
    public Integer getTicketNumber() {

        return this.transactionId;
    }

    @Override
    public void setTicketNumber(Integer ticketNumber) {
        if (ticketNumber==null) return;
        this.transactionId=ticketNumber;
    }

    @Override
    public List<TicketEntry> getEntries() {
        /*
        List<TicketEntry> listOfProductsEntries= new ArrayList<>();

        this.listOfProductsSale.entrySet().stream().forEach((e)->{
            System.out.println(e.getKey().getBarCode());
            System.out.println(e.getValue());
            TicketEntryImpl t=  new TicketEntryImpl(e.getKey().getBarCode(), e.getKey().getProductDescription(), e.getValue(), e.getKey().getPricePerUnit(), e.getKey().getProductDiscountRate());

            listOfProductsEntries.add(t);
        });
       return listOfProductsEntries;*/
        return listOfProductsEntries.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
    }

    @Override
    public void setEntries(List<TicketEntry> entries) {
        if (entries==null) return;
      /*this.listOfProductsSale= new HashMap<>();
        this.listOfProductsEntries=entries;

      entries.stream().forEach(t->{
          ProductTypeImpl p= new ProductTypeImpl( t.getBarCode(),t.getProductDescription(), t.getPricePerUnit(), t.getDiscountRate());

         this.listOfProductsSale.put(p, t.getAmount());

      });*/
        for (TicketEntry e : entries){
            this.listOfProductsEntries.put(e.getBarCode(),e);
        }

    }

    @Override
    public double getDiscountRate() {
        return this.discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {

        this.discountRate=discountRate;
    }

    @Override
    public double getPrice() {
        return this.amount;
    }

    @Override
    public void setPrice(double price) {

        this.amount=price;
    }


    public boolean EditProductInSale(ProductTypeImpl product, Integer quantity ){

    //some checks and the excetions are handled outside of this function

        if(isProductInSale(product)){
            //I LEFT THOSE 2 DEBUG PRINTING BECAUSE IN THE ESHOP STRUCTURE THE QUANTITY UPDATES CORRECTLY
            //DEBUG

            //this.listOfProductsSale.merge(product, quantity,Integer::sum );

            TicketEntry t=this.listOfProductsEntries.get(product.getBarCode());
            t.setAmount(t.getAmount()+quantity);
            this.listOfProductsEntries.replace(product.getBarCode(), t);

            this.amount=this.calculateCurrentAmount();
            //product.updateProductQuantity(-quantity);



            if(t.getAmount()==0) {
                this.listOfProductsEntries.remove(product.getBarCode());

                return true;
            }

            return true;
        } else{
            TicketEntry t=new TicketEntryImpl(product,quantity);
            this.listOfProductsEntries.put(product.getBarCode(), t);

            //product.updateProductQuantity(-quantity);
            this.amount=this.calculateCurrentAmount();

            return true;
        }

    }

    public void AbortSaleUpdateProductQuantity() {
       // this.listOfProductsSale.entrySet().stream().forEach(e->e.getKey().updateProductQuantity(-e.getValue()));
        //this.listOfProductsEntries.entrySet().stream().forEach(e->e.getValue().setAmount(-e.getValue().getAmount()));
   this.listOfProductsEntries=null;
    }

    public boolean isProductInSale(ProductTypeImpl product){
        return this.listOfProductsEntries.keySet().stream().anyMatch(e -> e.equals(product.getBarCode()));
    }

    public boolean ApplyDiscountToSaleProduct(Double disc, ProductTypeImpl product) {

        if(isProductInSale(product)){


            //LIKE THIS IT WORKS LIKE IN THE GUI: WHEN A DISCOUNT IS APPLIED TO A PRODUCT IT APPLIES TO ALL THE PRODUCT OF THAT TYPES IN THE SALE (EVEN IF INCLUDED BEFORE)
           // this.listOfProductsSale.keySet().stream().filter((k)->k.equals(product)).forEach(k->k.setProductDiscountRate(disc));
            this.listOfProductsEntries.entrySet().stream().filter((k)->k.getKey().equals(product.getBarCode())).forEach(k->k.getValue().setDiscountRate(disc));
            this.amount=this.calculateCurrentAmount();

            return true;
        }
        return false;
    }


    public boolean ApplyDiscountToSaleAll(Double disc) {

        //LIKE HIS IT WORKS LIKE IN THE GUI: WHEN A SALE DISCOUNT IS APPLIED IT OVERWRITES THE PREVIOUS SALE DISCOUNT (IT DOESN'T ADD TO IT)
       this.discountRate=disc;
        this.amount=this.calculateCurrentAmount();



        if (disc <0 || disc >1) {
            return false;
        }
        return true;
    }

    private Double calculateCurrentAmount() {
        //1. map each product to a double=price*quantity*(1-proddiscount)
        //2. sum all doubles
        //this.amount = this.listOfProductsSale.entrySet().stream().mapToDouble(p->{return p.getValue()*p.getKey().getPricePerUnit()*(1-p.getKey().getProductDiscountRate());}).reduce(0,(a,b)->{return a+b;});
        this.amount = this.listOfProductsEntries.entrySet().stream().mapToDouble(t->{return t.getValue().getAmount()*t.getValue().getPricePerUnit()*(1-t.getValue().getDiscountRate());}).reduce(0,(a,b)->{return a+b;});
        //apply sale discount
        if(this.discountRate>0 && this.discountRate<=1)
        this.amount=this.amount*(1-this.discountRate);

        return this.amount;
    }


    public int PointsForSale() {

        Integer tmp=(int) (this.amount/10);
        //this.transactionCard.updatePoints(tmp);
        return tmp;
    }

    public boolean EndSaleUpdateProductQuantity() {
        this.state=State.CLOSED;
       // this.listOfProductsSale.entrySet().stream().forEach(e->e.getKey().updateProductQuantity(e.getValue()));
        return true;

    }

    public double PaySaleAndReturnChange(Double amount, Boolean method) {
        if(this.amount<=amount) {
            this.state=State.PAYED;
            if(method) {
                this.pay=PaymentType.CASH;
            }else {
                this.pay=PaymentType.CARD;
            }
            return amount-this.amount;
        }

        return -1;

    }

    public boolean isInProgress() {
        return (this.state == State.INPROGRESS);
    }

    public boolean isPayed() {
        return (this.state == State.PAYED);
    }

    public boolean isClosed() {

        return (this.state == State.CLOSED);
    }

    public Integer getProductQuantity(ProductTypeImpl productType) {
        Integer quantity = -1;
        for (String pt : this.listOfProductsEntries.keySet()) {
            if (pt.equals(productType.getBarCode())) {
                quantity = this.listOfProductsEntries.get(pt).getAmount();
                break;
            }
        }

        return quantity;
    }

    public void updateProductQuantity(ProductTypeImpl productType, Integer quantity) {
        for (HashMap.Entry<String, TicketEntry> entry : this.listOfProductsEntries.entrySet()) {
            if (entry.getKey().equals(productType.getBarCode())) {
                TicketEntry t=new TicketEntryImpl(productType, entry.getValue().getAmount()+quantity);
                this.listOfProductsEntries.replace(t.getBarCode(),t);
                break;
            }
        }
        this.calculateCurrentAmount();
    }
}
