# Assignment_65 – Bit Manipulation Programs in Java

## Assignment Title

Bit Manipulation – ON, OFF and TOGGLE Operations (Java)

---

## Assignment Description

This assignment focuses on **bit manipulation techniques** using Java.
The programs demonstrate how to **OFF bits, TOGGLE bits, and ON specific bits** of a given integer using **bitwise operators**.

Bit manipulation helps in:

* Low-level and system programming
* Optimized logic implementation
* Better understanding of binary operations

---

## Problem Statements

1. Write a program which accepts one number from user and **OFF 7th bit** of that number if it is ON. Return the modified number.

2. Write a program which accepts one number from user and **OFF 7th and 10th bit** of that number. Return the modified number.

3. Write a program which accepts one number from user and **TOGGLE 7th bit** of that number. Return the modified number.

4. Write a program which accepts one number from user and **TOGGLE 7th and 10th bit** of that number. Return the modified number.

5. Write a program which accepts one number from user and **ON its first 4 bits**. Return the modified number.

---

## Concepts Used

* Bitwise AND (`&`)
* Bitwise OR (`|`)
* Bitwise XOR (`^`)
* Bitwise NOT (`~`)
* Left shift operator (`<<`)
* Hexadecimal masks
* User input using `Scanner`

---

## File Structure

```
Assignment_65/
│
├── program65_1.java   // OFF 7th bit
├── program65_2.java   // OFF 7th & 10th bit
├── program65_3.java   // TOGGLE 7th bit
├── program65_4.java   // TOGGLE 7th & 10th bit
├── program65_5.java   // ON first 4 bits
└── README.md
```

---

## Logic Explanation

### OFF Bit Logic

* Create a mask using `1 << (bitPosition - 1)`
* Apply NOT (`~`) on the mask
* AND (`&`) with the number to clear the bit

### TOGGLE Bit Logic

* Create a mask using `1 << (bitPosition - 1)`
* XOR (`^`) with the number to toggle the bit

### ON Bit Logic

* Create a mask with required bits ON (example: `0xF` for first 4 bits)
* OR (`|`) with the number to set bits ON

---

## How to Run

1. Compile the program:

   ```bash
   javac program65_x.java
   ```
2. Run the program:

   ```bash
   java program65_x
   ```
3. Enter the number when prompted

---

## Author

**Vivek Gautam**
📧 Email: [vivekbgautam@gmail.com](mailto:vivekbgautam@gmail.com)
🔗 GitHub: [https://github.com/vivekbgautam](https://github.com/vivekbgautam)

---

## Conclusion

This assignment provides hands-on practice with **bitwise operations** such as setting, clearing, and toggling bits. These operations are essential for efficient programming and understanding how data is handled at the binary level in Java.
