/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank;

/**
 *
 * @author ASUS
 */

public class Bank {
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank() {
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args) {
    Bank bankOfGods = new Bank();

    System.out.println("Balance inicial: " + bankOfGods.accountOne.getBalance());

    bankOfGods.accountOne.setBalance(5000);

    System.out.println("Nuevo balance: " + bankOfGods.accountOne.getBalance());

    System.out.println("Nombre: " + bankOfGods.accountOne.getName());
    System.out.println("ID: " + bankOfGods.accountOne.getId());
  }
}
