# Laboratory Activity: Recursion

## Brief Description

This laboratory activity demonstrates the use of **recursion** through a recursive **binary search algorithm** in Java.

The program accepts the number of elements, the elements of the array, and a target value from the user. Before performing the binary search, the program sorts the array in ascending order. The recursive binary search repeatedly divides the search interval into smaller parts until the target is found or there are no more elements to search.

The program displays the recursive search calls so the user can see how the search interval changes during each recursive call.

## Programming Language

- Java

## Requirements

- Java Development Kit (JDK)
- Java compiler or a Java-supported IDE

## Instructions for Compiling and Running

Compile the program:

```bash
javac Binary_Search.java
```

Run the program:

```bash
java Binary_Search
```

## Sample Input

```text
Enter the number of elements: 7
Enter 7 elements:
10 20 30 40 50 60 70
Target: 30
```

## Sample Output

```text
binarySearch(0, 6, 30)
binarySearch(0, 2, 30)
binarySearch(2, 2, 30)
Target found.
Index: 2
```

## How the Recursive Search Works

For the sample input, the target is `30`.

The search interval becomes:

```text
0 - 6
   ↓
0 - 2
   ↓
2 - 2
   ↓
Target found at index 2
```

The recursive function returns the target's index when it is found. If `low > high`, the search interval is empty and the function returns `-1`.

## AI Disclosure

I used **OpenAI ChatGPT (GPT-5.6 Luna)** as an AI tool during this laboratory activity. AI was used mainly as a guide and learning assistant when I became confused or did not understand parts of the recursive binary search code.

ChatGPT helped explain the purpose of `low`, `high`, and `mid`, how recursive calls work, how the search interval becomes smaller, and how the program returns the index of the target or `-1` when the target is not found. It also assisted me in understanding and modifying parts of the program according to the laboratory instructions.

I reviewed, modified, tested, and verified the AI-assisted output myself. I made changes to the suggested code and checked the program's output to make sure that it worked correctly and followed the requirements of the laboratory activity.

I estimate that approximately **30% of my submitted work was assisted by AI**. The AI assistance was mainly used for explanations, guidance, code-related suggestions, and clarification when I was confused.

Through the use of AI, I learned more about recursion and recursive binary search, particularly how `low`, `high`, and `mid` change during each recursive call and how a recursive function passes its return value back to the previous call. I also learned that AI can be used as a guide when I do not understand something, but I still need to review, test, and understand the code myself.
