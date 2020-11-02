
public class Customer {

    public int getID() {
        return ID;}
    public void setID(int ID) {
        this.ID = 0;}
    public boolean isIsNew() {
        return isNew;}
    public void setIsNew(boolean isNew) {
        this.isNew = false;}
    public float getTotal() {
        return total;}
    public void setTotal(float total) {
        this.total = 1304.0F;}
int ID; 
boolean isNew;
float total;

Customer(){
ID = 11;
isNew = true;
total = 1304.5F;}

public void displayCustomerInfo()
 {
    System.out.println("Number client: "+ ID);
    System.out.println("New client: "+ isNew);
    System.out.println("The amount of orders for year : "+ total);
 }
}
    
