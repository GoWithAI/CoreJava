package AllLatest2026.citi;

/*
We are developing a payment transaction monitoring system that tracks accounts and their transactions.
The system can compute each account's current balance and basic statistics.

Definitions:
* An "account" has a unique accountId and an owner name.
* A "transaction" represents money moving in or out of an account.
  - CREDIT increases the account balance.
  - DEBIT decreases the account balance.
* "AccountManager" manages accounts and transactions and provides balance-related methods.

To begin with, we present you with two tasks:
1-1) Read through and understand the code below. Please take as much time as necessary, and feel free to run it.
1-2) The test for AccountManager is not passing due to a bug in the code.
     Make the necessary changes to AccountManager to fix the bug.
*/

/*
We are extending our payment transaction monitoring system to support
basic analytics over transactions.

For this task, we want to calculate the average transaction amount per account.

2) Implement the function getAverageTransactionAmountByAccount in AccountManager that returns
the average transaction amount for each account.

Requirements:
- The result should associate each accountId with the average amount of its transactions.
- Both CREDIT and DEBIT transactions should be considered.
- Transaction amounts should be treated as absolute values when calculating averages.
- Accounts with no transactions should not appear in the result.
- Transactions always refer to valid accounts.

To assist you in testing this new function, we have provided the
testGetAverageTransactionAmountByAccount test.
*/

import org.junit.Assert;

import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        testGetBalance_basic();
        testGetBalance_multipleAccounts();
        testGetAverageTransactionAmountByAccount();
        System.out.println("All tests passed.");
    }

    private static void assertAlmost(double expected, double actual, double eps) {
        Assert.assertTrue("Expected " + expected + " but got " + actual, Math.abs(expected - actual) <= eps);
    }

    public static void testGetBalance_basic() {
        System.out.println("Running testGetBalance_basic");
        AccountManager mgr = new AccountManager();
        mgr.addAccount(new Account(1, "Alice"));

        mgr.addTransaction(new Transaction(101, 1, TransactionType.CREDIT, 100.0, 1000));
        mgr.addTransaction(new Transaction(102, 1, TransactionType.DEBIT, 30.0, 1010));
        mgr.addTransaction(new Transaction(103, 1, TransactionType.DEBIT, 20.0, 1020));
        mgr.addTransaction(new Transaction(104, 1, TransactionType.CREDIT, 10.0, 1030));

        // Expected balance: 100 - 30 - 20 + 10 = 60
        assertAlmost(60.0, mgr.getBalance(1), 0.0001);

        mgr.addTransaction(new Transaction(105, 1, TransactionType.DEBIT, 70.0, 1045));
        assertAlmost(-10.0, mgr.getBalance(1), 0.0001);
    }

    public static void testGetBalance_multipleAccounts() {
        System.out.println("Running testGetBalance_multipleAccounts");
        AccountManager mgr = new AccountManager();
        mgr.addAccount(new Account(1, "Alice"));
        mgr.addAccount(new Account(2, "Bob"));

        mgr.addTransaction(new Transaction(201, 1, TransactionType.CREDIT, 50.0, 2000));
        mgr.addTransaction(new Transaction(202, 2, TransactionType.CREDIT, 80.0, 2005));
        mgr.addTransaction(new Transaction(203, 1, TransactionType.DEBIT, 10.0, 2010));
        mgr.addTransaction(new Transaction(204, 2, TransactionType.DEBIT, 5.5, 2015));
        mgr.addTransaction(new Transaction(205, 2, TransactionType.DEBIT, 14.5, 2020));

        // Account 1: 50 - 10 = 40
        assertAlmost(40.0, mgr.getBalance(1), 0.0001);
        // Account 2: 80 - 5.5 - 14.5 = 60
        assertAlmost(60.0, mgr.getBalance(2), 0.0001);
    }

    public static void testGetAverageTransactionAmountByAccount() {
        System.out.println("Running testGetAverageTransactionAmountByAccount");
        AccountManager mgr = new AccountManager();

        mgr.addAccount(new Account(51, "Alice"));
        mgr.addAccount(new Account(72, "Bob"));
        mgr.addAccount(new Account(93, "Charlie")); // no transactions

        // Account 51: 100, 30, 20, 10 => avg = 160/4 = 40
        mgr.addTransaction(new Transaction(101, 51, TransactionType.CREDIT, 100.0, 1000));
        mgr.addTransaction(new Transaction(102, 51, TransactionType.DEBIT, 30.0, 1010));
        mgr.addTransaction(new Transaction(103, 51, TransactionType.DEBIT, 20.0, 1020));
        mgr.addTransaction(new Transaction(104, 51, TransactionType.CREDIT, 10.0, 1030));

        // Account 72: 80, 5.5, 14.5 => avg = 100/3 = 33.333...
        mgr.addTransaction(new Transaction(201, 72, TransactionType.CREDIT, 80.0, 2005));
        mgr.addTransaction(new Transaction(202, 72, TransactionType.DEBIT, 5.5, 2015));
        mgr.addTransaction(new Transaction(203, 72, TransactionType.DEBIT, 14.5, 2020));

        Map<Integer, Double> avg = mgr.getAverageTransactionAmountByAccount();

        assertAlmost(40.0, avg.get(51), 0.0001);
        assertAlmost(33.3333, avg.get(72), 0.0001);

        // Account 93 has no transactions -> should not be present
        Assert.assertFalse(avg.containsKey(93));
    }
}