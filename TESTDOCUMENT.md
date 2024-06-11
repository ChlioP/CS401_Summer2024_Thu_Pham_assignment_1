# Simple Calculator - Test Document

This document describes the test cases for the Simple Calculator program and the observed results.

## Test Cases

### Test Case 1: Addition of Two Positive Numbers
- **Input:**
  - First number: 3
  - Second number: 7
  - Operation: Addition (1)
- **Expected Result:** 10
- **Observed Result:** 10
- **Status:** Pass

### Test Case 2: Subtraction of Two Positive Numbers
- **Input:**
  - First number: 5
  - Second number: 7
  - Operation: Subtraction (2)
- **Expected Result:** -2
- **Observed Result:** -2
- **Status:** Pass

### Test Case 3: Multiplication of Two Positive Numbers
- **Input:**
  - First number: 1
  - Second number: 9
  - Operation: Multiplication (3)
- **Expected Result:** 9
- **Observed Result:** 9
- **Status:** Pass

### Test Case 4: Division of Two Positive Numbers
- **Input:**
  - First number: 5
  - Second number: 10
  - Operation: Division (4)
- **Expected Result:** 0.5
- **Observed Result:** 0.5
- **Status:** Pass

### Test Case 5: Division by Zero
- **Input:**
  - First number: 4
  - Second number: 0
  - Operation: Division (4)
- **Expected Result:** Error message "Error: Division by zero."
- **Observed Result:** Error message "Error: Division by zero."
- **Status:** Pass

### Test Case 6: Invalid Number Input
- **Input:**
  - First number: abc
- **Expected Result:** Error message "Invalid input. Please enter a number."
- **Observed Result:** Error message "Invalid input. Please enter a number."
- **Status:** Pass

### Test Case 7: Invalid Operation Selection
- **Input:**
  - First number: 4
  - Second number: 3
  - Operation: 5
- **Expected Result:** Error message "Invalid operation."
- **Observed Result:** Error message "Invalid operation."
- **Status:** Pass

### Test Case 8: Exiting the Program
- **Input:**
  - First number: 4
  - Second number: 3
  - Operation: Addition (1)
  - Result: 4 + 3 = 7
  - Perform another calculation: no
- **Expected Result:** Program exits with message "Goodbye!"
- **Observed Result:** Program exits with message "Goodbye!"
- **Status:** Pass

## Summary

All test cases were executed, and the Simple Calculator program performed as expected. The program handled valid inputs correctly and provided appropriate error messages for invalid inputs. The user interaction flow for performing calculations and exiting the program worked as designed.

## Conclusion

The Simple Calculator program is functioning correctly based on the test cases described in this document. 
