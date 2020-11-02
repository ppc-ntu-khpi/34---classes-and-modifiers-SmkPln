
public class Customer {

    public int getID() {
        return ID;}
    public void setID(int nID) {
        if(nID>=0){ID = nID;}
    }
    public boolean isIsNew() {
        return isNew;}
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;}
    public float getTotal() {
        return total;}
    public void setTotal(float ntotal) {
        if(ntotal>=0){total=ntotal;} 
    }
int ID; 
boolean isNew;
float total;

Customer(){
ID = 0;
isNew = true;
total = 0.0F;}

public void displayCustomerInfo()
 {
    System.out.println("Number client: "+ ID);
    System.out.println("New client: "+ isNew);
    System.out.println("The amount of orders for year : "+ total);
 }
}
    
