/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3_2;

import module7_b8.Date;
import module7_b8.Input;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Adminator {
    public ArrayList<OrderDetail> listOrderDetails = new ArrayList<>();
    
    public void add(OrderDetail orderDetail){
        this.listOrderDetails.add(orderDetail);
    }
public String totalPrice(){
    double totalPrice = 0;  
    for(OrderDetail orderDetail : listOrderDetails){
        totalPrice += orderDetail.calcTotalPrice();
    }
    return  Input.toVND(totalPrice);
}
public void menu(){
    while (true) {        
        System.out.println("1.Nhập TT");
        System.out.println("2.Xuất TT");
        System.out.println("3.Tổng tiền thanh toán");
        menu(Input.inputInt("Enter choice: "));
    }
}
public void menu(int choice){
    switch(choice){
        case 1: 
            Date date = new Date(Input.inputDate());
           int maHD = Input.inputInt("Nhập mã hóa đơn");
            int slSP= Input.inputInt("Nhập số lượng sản phẩm muốn thêm vào: ");
            for (int i = 0; i < slSP; i++) {
                 OrderDetail orderDetail = OrderDetail.nhapTT(this.listOrderDetails.size()+1);
            if(orderDetail != null)
                this.add(orderDetail);
            }
            System.out.println("_____________________________________________________________________________________________________________________________________________");
            OrderDetail orderDetail = new  OrderDetail();
            System.out.println("Mã hóa đơn: "+maHD);
            System.out.println("Ngày lập hóa đơn: "+date);
            for (int i = 0; i < slSP; i++) {
               orderDetail.XuatTT();
            }
            break;
        case 2: 
            System.out.println("_____________________________________________________________________________________________________________________________________________");
          
            
            break;
           case 3:
               System.out.println("Tổng tiền thanh toán: "+ totalPrice());
            break;
            case 4: 
               System.exit(0);
               break;
    }
}
}