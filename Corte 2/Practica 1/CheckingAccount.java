/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author User
 */
public class CheckingAccount {
    private String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId) {
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int newBalance) {
    balance = newBalance;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public String getId() {
    return id;
  }

  public void setId(String newId) {
    id = newId;
  }
}
