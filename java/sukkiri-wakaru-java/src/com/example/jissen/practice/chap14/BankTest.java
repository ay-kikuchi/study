package com.example.jissen.practice.chap14;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void test_正常系() {
        var bankName = "わかば";
        var bank = createBank(bankName);
        assertEquals(bank.getName(), bankName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_銀行名が3文字未満_異常系() {
        var bankName = "ねこ";
        var bank = createBank(bankName);
    }

    @Test(expected = NullPointerException.class)
    public void test_銀行名がnull_異常系() {
        var bank = createBank(null);
    }

    private Bank createBank(String name) {
        var bank = new Bank();
        bank.setName(name);
        return bank;
    }

}
