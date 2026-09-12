# Laboratory Activity: Recursion

## Brief Description

This Java program demonstrates recursive binary search. It accepts the number of elements, the array values, and a target value from the user. Because binary search requires an ascending sorted array, the program sorts the input before searching. It then displays the recursive search trace and returns the target's index in the sorted array, or `-1` if the target is not found.

## Programming Language

Java

## How to Compile and Run

1. Open a terminal in this folder.

2. Compile the source file:

```bash
javac Binary_Search.java
```

3. Run the program:

```bash
java Binary_Search
```

4. Enter the number of elements, the elements, and the target value when prompted.

## Sample Input

```text
Enter the number of elements: 7
Enter 7 elements:
40 10 70 20 50 30 60
Target: 50
```

## Sample Output

```text
binarySearch(0, 6, 50)
binarySearch(4, 6, 50)
binarySearch(4, 4, 50)
Target found.
Index: 4
```

## AI Disclosure

OpenAI ChatGPT, GPT-5.6 Luna, was used to help explain the recursive binary search algorithm, draft and revise parts of the Java program, prepare the recursion/search traces, and organize explanations for the laboratory activity. The student reviewed and verified the final code and output and is responsible for understanding the submitted program.

Prompt used:

> Help me complete the Recursion - Binary Search laboratory activity using the provided Binary Search program as the starting code, including the recursion trace, user input, search trace, explanation, test cases, and AI disclosure.
