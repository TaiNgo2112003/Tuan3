/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3_2;

import module7_b8.Input;

/**
 *
 * @author Admin
 */
public class OrderDetail extends product{
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(int quantity, String description, String productID, double price) {
        super(description, productID, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  public double calcTotalPrice(){
      return getQuantity()*price;
  }

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + '}';
    }
  public static OrderDetail nhapTT(int id){
     
    
      String description = Input.inputSting("Nhập mã sản phẩm: ");
      String productID = Input.inputSting("Nhập mô tả sản phẩm:");
      int price = Input.inputInt("Nhập đơn giá: ");
      int quantity = Input.inputInt("Nhập số lượng:  ");
   return  new OrderDetail(quantity, description, productID, price);
  }
public  void XuatTT(){
   
    System.out.println(description);
    System.out.println(price);
    System.out.println(quantity);
    System.out.println(calcTotalPrice());

}
}
