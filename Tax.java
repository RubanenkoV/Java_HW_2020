package com.company;

import java.util.Arrays;

public class Tax {

    public int tax1;
    public int tax2;
    public int tax3;

    public Tax(int tax1, int tax2, int tax3) {
        this.tax1 = tax1;
        this.tax2 = tax2;
        this.tax3 = tax3;
    }

    public void sum_of_taxes(){
        System.out.println("The sum of taxes is " + (tax1+tax2+tax3));
    }
    public void sort_of_taxes() {
        if (tax1 < tax2 && tax1 < tax3 && tax2 < tax3) {
            System.out.println(this.tax1 + "<" + this.tax2 + "<" + this.tax3);
        } else if (this.tax1 < this.tax2 && this.tax1 < this.tax3 && this.tax2 > this.tax3) {
            System.out.println(this.tax1 + "<" + this.tax3 + "<" + this.tax2);

        } else if (this.tax2 < this.tax1 && this.tax2 < this.tax3 && this.tax1 < this.tax3) {
            System.out.println(this.tax2 + "<" + this.tax1 + "<" + this.tax3);
        }
        else if (this.tax2 < this.tax1 && this.tax2 < this.tax3 && this.tax3 < this.tax1){
            System.out.println(this.tax2 + "<" + this.tax3 + "<" + this.tax1);
        }
        else if (this.tax3 < this.tax2 && this.tax3 < this.tax1 && this.tax2 < this.tax1){
            System.out.println(this.tax3 + "<" + this.tax2 + "<" + this.tax1);
        }
        else if (this.tax3 < this.tax2 && this.tax3 < this.tax1 && this.tax1 < this.tax2){
            System.out.println(this.tax3 + "<" + this.tax1 + "<" + this.tax2);
        }
    }
}


