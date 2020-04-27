package com.example.jissen.practice.chap14;

public class Bank {
  private String name; // 銀行名(必ず3文字以上)

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    if (newName.length() < 3) {
      throw new IllegalArgumentException("名前が不正です");
    }
    this.name = newName;
  }
}
