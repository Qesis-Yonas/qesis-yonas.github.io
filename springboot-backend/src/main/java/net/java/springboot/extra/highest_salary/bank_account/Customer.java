package net.java.springboot.extra.highest_salary.bank_account;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String name;
    private double accountBalance;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
