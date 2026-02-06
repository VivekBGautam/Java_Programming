# 📘 Assignment_66 – Bitwise Operations Using Helper Functions (Java)

## 🔹 Assignment Title

**Bitwise Manipulation Using Entry Point and Helper Functions**

---

## 🔹 Problem Statement

Write an **entry point function (`main`)** that calls the following **helper functions separately**.
Each helper function should perform a specific **bitwise operation** and return the result to the caller.

---

## 🔹 Assignment Objectives

* Understand **bitwise operations** in Java
* Learn how to design and use **helper functions**
* Practice **bit masking techniques**
* Improve logic for **low-level programming concepts**

---

## 🔹 Assignment Questions

1. Write a program which accepts **one number and one position** from the user and checks whether the bit at that position is **ON or OFF**.

   * If bit is ON, return **TRUE**, otherwise return **FALSE**.

2. Write a program which accepts **one number and one position** from the user and **OFF** that bit.

   * Return the **modified number**.

3. Write a program which accepts **one number and one position** from the user and **ON** that bit.

   * Return the **modified number**.

4. Write a program which accepts **one number and one position** from the user and **TOGGLE** that bit.

   * Return the **modified number**.

5. Write a program which accepts **one number** from the user and **toggle the contents of the first and last nibble** of the number.

   * *(Nibble = group of 4 bits)*
   * Return the **modified number**.

---

## 🔹 File Structure

```
Assignment_66/
│
├── program66_1.java   // Check whether bit is ON or OFF
├── program66_2.java   // OFF the given bit
├── program66_3.java   // ON the given bit
├── program66_4.java   // Toggle the given bit
├── program66_5.java   // Toggle first and last nibble
│
└── README.md
```

---

## 🔹 Key Concepts Used

* Bitwise AND (`&`)
* Bitwise OR (`|`)
* Bitwise XOR (`^`)
* Bitwise NOT (`~`)
* Left Shift Operator (`<<`)
* Bit Masking
* Helper Functions

---

## 🔹 Bitwise Logic Reference

* **Check Bit**

```java
iResult = iNo & iMask;
```

* **OFF Bit**

```java
iResult = iNo & (~iMask);
```

* **ON Bit**

```java
iResult = iNo | iMask;
```

* **Toggle Bit**

```java
iResult = iNo ^ iMask;
```

* **Toggle First and Last Nibble**

```java
iMask = 0xF000000F;
iResult = iNo ^ iMask;
```

---

## 🔹 Author Information

* **Name:** Vivek Gautam
* **Email:** [vivekbgautam@gmail.com](mailto:vivekbgautam@gmail.com)
* **GitHub:** [https://github.com/vivekbgautam](https://github.com/vivekbgautam)

---

## ✅ Conclusion

This assignment strengthens understanding of **bit-level operations** in Java and demonstrates how to write clean, modular programs using **separate helper functions and a clear entry point**.

---

⭐ *End of Assignment_66 README*
