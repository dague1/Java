# Report for assignment 3

This is a template for your report. You are free to modify it as needed.
It is not required to use markdown for your report either, but the report
has to be delivered in a standard, cross-platform format.

## Project

**Name:**

The Algorithms

**URL:**

https://github.com/TheAlgorithms/Java

**One or two sentences describing it:**

It is a collection of famous, well established algorithms implemented in Java, and is open source initiative-approved (The MIT License).

## Onboarding experience

### 1. How easily can you build the project? Briefly describe if everything worked as documented or not:

**General notes:**

The README has little to no useful information for newcomers, and it essentially useless.

**(a) Did you have to install a lot of additional tools to build the software?**

No. It was straight forward to just fork the repo and build with Maven.

**(b) Were those tools well documented?**

The documentation of the repo is poor. There is no clear instructions as to how to work with the repo. Luckily, it turned out to be quite easy.

**(c) Were other components installed automatically by the build script?**

Yes.

**(d) Did the build conclude automatically without errors?**

Yes.

**(e) How well do examples and tests run on your system(s)?**

Everything runs fine as of now.

### 2. Do you plan to continue or choose another project?
We plan to continue working with this repo for this assignment, and find a new one for assignment 4. Collections of algorithms are convenient for this assignment, but is not allowed for assignment 4.


## Complexity

1. What are your results for ten complex functions?
   * Did all methods (tools vs. manual count) get the same result?
   * Are the results clear?
   
| Function | Param | File Path | C-Complexity (auto) | C-Complexity (manual 1) | C-Complexity (manual 2) | C-Complexity (manual 3) |
|---|---|---|---|---|---|---|
| remove | 1 | datastructures/trees/BinaryTree.java | 17 | 11 | 12 | 15 |
| myAtoi | 1 | strings/MyAtoi.java | 37 | 32 | 37 | 30 |
| divide | 2 | maths/LongDivision.java | 19 | 14 | 19 | 14 |
| divideMessageWithP | 1 | others/CRCAlgorithm.java | 18 | 14 | 23 | 14 |
| calculateMaxOfMin | 2 | datastructures/stacks/MaximumMinimumWindow.java | 15 | 8 | 17 | 13 |
| regexRecursion | 2 | dynamicprogramming/RegexMatching.java | 13 | - | - | - |
| regexRecursion | 4 | dynamicprogramming/RegexMatching.java | 13 | - | - | - |
| regexRecursion | 5 | dynamicprogramming/RegexMatching.java | 16 | - | - | - |
| regexBU | 2 | dynamicprogramming/RegexMatching.java | 9 | - | - | - |
| minimalpartitions | 1 | dynamicprogramming/PalindromicPartitioning.java | 12 | - | - | - |



**2. Are the functions just complex, or also long?**

Some functions are longer than others.  For example, remove() is 94 LoC, which obviously is very high. MyAtoi() is 87 LoC. Divide() is 67 LoC. DivideMessageWithP() is only 40 LoC, which is a much better number. calculateMaxOfMin() is 57 LoC. RegexRecursion(2) has 32 LoC, RegexRecursion(4) has 34 LoC, RegexRecursion(5) has 39 LoC. regexBU() has 30 LoC, and minimalpartitions() has 61 LoC.

**4. What is the purpose of the functions?**

Remove() removes a node from a binary tree. MyAtoi() converts a string to a 32-bit signed integer. Divide() performs long division of two integers. divideMessageWithP() is a helper function of the CRC algorithm which divides the message with the number P. CalculateMaxOfMin calculates the maximum value in a minimum window size given an array. This one is quite difficult to explain without an example, so check out https://www.geeksforgeeks.org/find-the-maximum-of-minimums-for-every-window-size-in-a-given-array/ for an example. The three regexRecursion() functions implement a wildcard pattern matching algorithm that checks if a wildcard is matched with text. They are implemented in different ways; strictly recursively, recursively using virtual indices, and dynamically (memoization). The regexBu does the same, but uses tabulation instead of memoization. Minimalpartitions() finds the minimal numbner needed to partition a string into a number of palindromes dynamically. 

**5. Are exceptions taken into account in the given measurements?**

None of the functions listed explicitly throws any exception. The divide() function on the other hand catches exceptions. We believe that lizard does take exceptions into account since we took them into account in the manual measurements, and we still got a lower complexity than lizard measured.

**6. Is the documentation clear w.r.t. all the possible outcomes?**

The documentation is not overly clear, and w.r.t. all the possible outcomes of the methods, absolutely not. It is unfortunate that the documentation is so lackluster in some classes, wheras it is acceptable in others. We do feel like when contibuting to an open source project, the bare minimum one can do is to document the contibutions clearly, and to take code reviewing seriously. It is especially frustrating when the documentation is inconsistent, and some classes are perfectly documented, while others do not have a single meaningful comment.

## Refactoring

Plan for refactoring complex code:

Estimated impact of refactoring (lower CC, but other drawbacks?).

Carried out refactoring (optional, P+):

git diff ...

## Coverage

### Tools

Document your experience in using a "new"/different coverage tool.

How well was the tool documented? Was it possible/easy/difficult to
integrate it with your build environment?

### Your own coverage tool

Show a patch (or link to a branch) that shows the instrumented code to
gather coverage measurements.

The patch is probably too long to be copied here, so please add
the git command that is used to obtain the patch instead:

git diff ...

What kinds of constructs does your tool support, and how accurate is
its output?

### Evaluation

1. How detailed is your coverage measurement?

2. What are the limitations of your own tool?

3. Are the results of your tool consistent with existing coverage tools?

## Coverage improvement

Show the comments that describe the requirements for the coverage.

Report of old coverage: [link]

Report of new coverage: [link]

Test cases added:

git diff ...

Number of test cases added: two per team member (P) or at least four (P+).

## Self-assessment: Way of working

Current state according to the Essence standard: ...

Was the self-assessment unanimous? Any doubts about certain items?

How have you improved so far?

Where is potential for improvement?

## Overall experience

What are your main take-aways from this project? What did you learn?

Is there something special you want to mention here?
