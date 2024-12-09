   package com.ldy.pojo;

   public class Account {
       private int acId;
       private String acName;
       private double balance;

       // Getters and Setters
       public int getAcId() {
           return acId;
       }

       public void setAcId(int acId) {
           this.acId = acId;
       }

       public String getAcName() {
           return acName;
       }

       public void setAcName(String acName) {
           this.acName = acName;
       }

       public double getBalance() {
           return balance;
       }

       public void setBalance(double balance) {
           this.balance = balance;
       }

       @Override
       public String toString() {
           return "Account{" +
                   "acId=" + acId +
                   ", acName='" + acName + '\'' +
                   ", balance=" + balance +
                   '}';
       }
   }
   