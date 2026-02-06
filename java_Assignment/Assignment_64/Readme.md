# Assignment_64 – Bitwise Check Programs in Java

## Assignment Title

Bitwise Operations – Checking Specific Bits (Java)

---

## Assignment Description

This assignment demonstrates the use of **bitwise operators** in Java to check whether specific bits of a given integer number are **ON or OFF**.

Each program uses:

* Left shift operator (`<<`) to create bit masks
* Bitwise AND operator (`&`) to test bits
* OR operator (`|`) to combine multiple bit positions

---

## Problem Statements

1. Write a program which checks whether **15th bit** is ON or OFF.
2. Write a program which checks whether **5th & 18th bit** are ON or OFF.
3. Write a program which checks whether **7th, 15th, 21st & 28th bit** are ON or OFF.
4. Write a program which checks whether **7th, 8th & 9th bit** are ON or OFF.
5. Write a program which checks whether **first (1st) and last (32nd) bit** are ON or OFF.

---

## Concepts Used

* Bitwise AND (`&`)
* Bitwise OR (`|`)
* Left Shift Operator (`<<`)
* Mask creation
* Conditional statements

---

## File Structure

```
Assignment_64/
│
├── program64_1.java   // Check 15th bit
├── program64_2.java   // Check 5th & 18th bit
├── program64_3.java   // Check 7th, 15th, 21st & 28th bit
├── program64_4.java   // Check 7th, 8th & 9th bit
├── program64_5.java   // Check 1st & 32nd bit
└── README.md
```

Assignment_64/
│
├── Program1.java   // Check 15th bit
├── Program2.java   // Check 5th & 18th bit
├── Program3.java   // Check 7th, 15th, 21st & 28th bit
├── Program4.java   // Check 7th, 8th & 9th bit
├── Program5.java   // Check 1st & 32nd bit
└── README.md

````

---

## Logic Explanation (Common for All Programs)
- A mask is created using `1 << (bitPosition - 1)`
- For multiple bits, masks are combined using OR (`|`)
- The number is ANDed with the mask
- If `(number & mask) == mask`, required bit(s) are ON

---

## How to Run
1. Compile the program using:
   ```bash
   javac ProgramX.java
````

2. Run the program using:

   ```bash
   java ProgramX
   ```
3. Enter the number when prompted

---

## Author

**Vivek Gautam**
📧 Email: [vivekbgautam@gmail.com](mailto:vivekbgautam@gmail.com)
🔗 GitHub: [https://github.com/vivekbgautam](https://github.com/vivekbgautam)

---

## Conclusion

This assignment strengthens understanding of **low-level bit manipulation** and helps build logic for efficient programming using bitwise operations in Java.
