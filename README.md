# 🏦 Bank Management System (Java OOP Project)

A simple **Bank Management System** built using **Core Java** to demonstrate fundamental **Object-Oriented Programming (OOP)** principles such as **Encapsulation**, **Abstraction**, **Inheritance**, and **Polymorphism**.  
This project is implemented as a plain Java console application — no frameworks, just pure Java logic.

---

## 📚 Table of Contents
- Objective(#-objective)
- OOP Concepts Used(#-oop-concepts-used)
- Project Structure(#️-project-structure)
- How to Run(#️-how-to-run)
- Classes Overview(#-classes-overview)
- Sample Output(#-sample-output)
- Future Enhancements(#-future-enhancements)
- Author(#-author)

---

## 🎯 Objective
The goal of this project is to build a **mini banking system** that can:
- Create different types of bank accounts  
- Deposit and withdraw funds  
- Transfer money between accounts  
- Display all account details  

It’s designed primarily for **learning and showcasing OOP concepts** in a clean, modular, and reusable structure.

---

## 🧩 OOP Concepts Used

| Concept | Description | Example |
|----------|--------------|----------|
| **Encapsulation** | Hiding internal details using private fields and getters/setters | Private fields in `Account` |
| **Abstraction** | Abstract class for common structure | `Account` class with abstract `withdraw()` |
| **Inheritance** | Reusing behavior across related classes | `SavingsAccount` and `CurrentAccount` extend `Account` |
| **Polymorphism** | Different implementations for the same method | `withdraw()` behaves differently in each subclasses

---

## 🗂️ Project Structure
com.java.bank
└── Main.java → Entry point for the application


com.java.model
├── Account.java → Abstract base class
├── SavingsAccount.java → Derived class with interest feature
├── CurrentAccount.java → Derived class with overdraft feature

com.java.service
├── BankService.java → Handles account creation & display
├── TransactionService.java → Handles money transfers

com.java.util
└── InputHelper.java → Utility class for user input


---

## ⚙️ How to Run

### ▶️ Using Eclipse or IntelliJ
1. Open the project in your IDE.
2. Make sure your JDK version is **Java 17+ (preferably Java 21)**.
3. Right-click on `Main.java` → **Run As → Java Application**.
4. View output in the console.

### ▶️ Using Command Line
cd src

javac com/java/bank/Main.java

java com.java.bank.Main


🧠 Classes Overview

🏦 Account (Abstract Class)

Common fields: account number, holder name, balance

Abstract method: withdraw()

Concrete method: deposit()


💰 SavingsAccount

Inherits from Account

Adds addInterest() method


💼 CurrentAccount

Inherits from Account

Supports overdraft limit


🧾 BankService

Manages all accounts

Methods: addAccount(), findAccount(), showAllAccounts()


🔁 TransactionService

Handles fund transfers between accounts


⌨️ InputHelper

Simplifies user input using Scanner



Sample Output

✅ Account created for Raghaveni
✅ Account created for Priya
Deposited: ₹2000.0
Withdrawn: ₹1500.0
Interest added: ₹420.0
✅ ₹3000.0 transferred from Raghaveni to Priya

🔹 All Accounts Info:
---------------------

Account No: A101
Holder Name: Raghaveni
Balance: ₹9920.0

Account No: A102
Holder Name: Priya
Balance: ₹8000.0


📘 Future Enhancements

🔹 Add console-based menu for interactive input
🔹 Store accounts in files or database
🔹 Add login system for customers
🔹 Add transaction history tracking

👩‍💻 Author

Raghaveni Kakarlamudi
📧 raghavenikakarlamudi693@gmil.com
🌐 https://github.com/raghavenikakarlamudi693

