package com.company;

public class StaffTest {
    public static void main(String[] args){
        Staff staff = new Staff("Quan", "ThaiBinh", "CongNghiep", 20);
        System.out.println(staff.toString());

        Staff staff1 = new Staff("Hoang", "HaNam", "ThuongMai", 15);
        System.out.println(staff1.toString());
    }
}
