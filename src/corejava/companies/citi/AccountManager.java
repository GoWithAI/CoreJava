package corejava.companies.citi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class AccountManager {
    Map<Integer, Account> accounts = new HashMap<>();
    List<Transaction> transactions = new ArrayList<>();

    void addAccount(Account account) {
        accounts.put(account.accountId, account);
    }

    void addTransaction(Transaction tx) {
        // Assume input transactions always refer to valid accounts for this question.
        transactions.add(tx);
    }

    // Returns the current balance for the given accountId.
    double getBalance(int accountId) {
        double balance = 0.0;
        for (Transaction tx : transactions) {
            if (tx.accountId == accountId) {
                if (tx.type == TransactionType.CREDIT) {
                    balance += tx.amount; // Credit
                }else {
                    balance -= tx.amount;
                }
            }
        }
        return balance;
    }

    Map<Integer, Double> getAverageTransactionAmountByAccount(){
        // no account, +value
        return transactions.stream().filter(t -> t.accountId != 0 && t.amount >= 0)
                .collect(Collectors.groupingBy(t -> t.accountId, Collectors.averagingDouble(t -> t.amount )));

    }
}