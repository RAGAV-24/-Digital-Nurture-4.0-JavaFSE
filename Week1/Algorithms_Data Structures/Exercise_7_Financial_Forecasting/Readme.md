
````markdown
# 📈 Financial Forecasting - Recursive Algorithm

This project demonstrates a simple recursive approach to predict future financial values based on past data and annual growth rate.

---

## 📘 Exercise Overview

**Exercise Name**: Financial Forecasting  
**Goal**: Predict future financial values using recursion and analyze the algorithm’s performance.

---

## 🔁 What is Recursion?

**Recursion** is a technique where a method calls itself to solve smaller instances of the same problem.  
It simplifies complex calculations like financial forecasting, factorials, Fibonacci numbers, etc.

---

## 📐 Time Complexity

- Basic recursive version:  
  **Time Complexity** – O(n)  
  (One recursive call per year)

- Optimized with memoization (caching):  
  **Time Complexity** – O(n), but avoids repeated calculations.

---

## 🧱 Project Structure

```bash
Exercise_7_Financial_Forecasting/
└── code/
    └── Main.java     
````

---

## 🚀 How to Run


### ✅ Step 1: Compile the Java file

```bash
javac Main.java
```

### ✅ Step 2: Run the program

```bash
java Main
```

---


## 💡 Explanation

Each year, the value is calculated recursively:

```
FutureValue(n) = FutureValue(n-1) * (1 + growthRate)
```

Using **memoization**, we cache already computed values to improve performance.

