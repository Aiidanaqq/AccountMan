Overview




This project implements a simple personal account management system in Java. It allows users to create a bank account, perform deposits and withdrawals, and maintain a transaction history. The system uses enums and classes to represent transactions and account details.

Features
Transaction Types: Supports DEPOSIT and WITHDRAWAL transactions.
Account Management: Create an account with a unique account number and holder's name.
Transaction History: Keep track of all deposits and withdrawals.
Balance Tracking: Maintain and retrieve the current account balance.



Components


1. TransactionType Enum
Defines the types of transactions:

DEPOSIT
WITHDRAWAL



2. Amount Class
Represents a transaction amount with:

amount: The transaction amount (double).
transactionType: The type of transaction (TransactionType enum).
3. PersonalAccount Class
Manages a personal bank account with the following features:

Attributes:
accountNumber: Unique identifier for the account (int).
accountHolder: Name of the account holder (String).
balance: Current balance of the account (double).
transactions: List of transaction records (List<Amount>).
Methods:
deposit(double amount): Deposit money into the account.
withdraw(double amount): Withdraw money from the account.
printTransactionHistory(): Print the history of transactions.
getBalance(): Retrieve the current balance.
getAccountNumber(): Retrieve the account number.
getAccountHolder(): Retrieve the account holder's name.
