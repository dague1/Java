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

_We plan to refactor remove(), divide(), and the three regexRecursion() functions._

**remove()**

This function has a **very** high cyclomatic complexity, and a high LoC count. The function has separate chunks of code for the different cases "no children", "two children", "one child". We will create separate methods for these, since the individual cases have a quite high LoC count, and consist mainly of conditionals. This will substantially reduce the CC, LoC, and make the code more readable and debuggable.


**divide()**

This function also has a very high CC and high LoC count. Furthermore, it is lacks any sort of documentation, despite having a quite complex flow. We will separate the first conditionals and the base case from the main algorithm in the function. We will also try to have the error handling in a separate function. 


**regexRecursion(2)**

This function is not as bad as the aforementioned ones. We can definitely divide it into two functions instead, where one takes care of the base cases and one does the recursive logic. This will reduce the CC and the LoC by quite a lot. This functino is also not commented at all, so we want to comment the code to highlight basecases and recursive cases. 


**regexRecursion(4)**

We do not have too much to add here, since the three regex-functions are quite similar. See **regexRecursion(2)**.


**regexRecursion(5)**

We do not have too much to add here, since the three regex-functions are quite similar. See **regexRecursion(2)**.



### Carried out refactoring (optional, P+):

_To see our refactorings, check out the same functions but in branch 11 of this repo_

**remove()**

As written in the plan, we refactored the different cases (0,1 or 2 children) into separate helper functions. This effectively brought the CC down from 15 (manual try 3) to 4 (a 73% decrease), which obviously is a significant improvement. Furthermore, we maintained readability which we are quite proud of.

**divide()**

For this one, it was a lot harder to do meaningful refactoring. We effectively reduced the CC by exactly 35% by introducing an error handling function and some updating functions. We do think the readability is somewhat compromised, and the LoC count is more or less the ame.

**regexRecursion(2)**
It was hard to find any meaningful changes to be made to improve the complexity of this method. We therefore followed our plan from the previous section. We divided the method into 2 methods. Where the first method handled some typical base ccases of the input and returned a quick answer. While the second handled recursive work for tougher input. The end complexity for the two methods was 9 and 5 respectively. Which results in an average complexity reduction of 45,5%.


**regexRecursion(4)**
This function is very similar to the one with two arguments so it was refactored in the same way. I.e. by dividing it into two functions, one to handle the base cases and one for the actual recursion. 


**regexRecursion(5)**
We refactored this function in the same way for the previous functions which is by dividing it into two functions. This leads to reducing the CC from 16 to 10 so the CC it reduced by 37,5%.


_Commit history for the functions in the same order as listed above:_

https://github.com/dague1/Java/commit/9cd9647a9734360c187267c300509a6c373921b6

https://github.com/dague1/Java/commit/dfaf2f2aecb3c43044b2f800fd97721f1a1ba890

https://github.com/dague1/Java/commit/160f0678bdaa3aacc825286d247784d79561e77a

https://github.com/dague1/Java/commit/0f22f6ef92f4d9bd4af59d364bf0ef085dc2454f

https://github.com/dague1/Java/commit/618c94087d64372f1adf8642f281f53f201ba715

## Coverage

### Tools

Document your experience in using a "new"/different coverage tool.

How well was the tool documented? Was it possible/easy/difficult to
integrate it with your build environment?

The tool we chose to use was OpenClover. It was fairly simple to set up and use through Maven. While running the coverage measurement, we encountered some trouble where OpenClover could not measure certain methods and classes. The exceptions that were thrown indicated there was some syntax error. However, when looking into the files ourselves, the syntax was fine. Luckily none of the method that we planned to use for the assignment caused any trouble for OpenClover so we ended up running the measurement tool only on the files including our choosen methods instead of running it on the whole project.

### Your own coverage tool

Show a patch (or link to a branch) that shows the instrumented code to
gather coverage measurements.

**Branch link:** https://github.com/dague1/Java/tree/8-other-35-coverage-measurement-improvement

All commits in this branch had to do with the creation of our own coverage measurement tool.

### Evaluation

1. How detailed is your coverage measurement?  
Our tool checks all branches of a method meaning any while, if or switch. It also checks exception handleing in the form of a try-catch block.

2. What are the limitations of your own tool?  
The tool has to be set up manually before it is run, which can be quite extensive work for a long and complex method.

3. Are the results of your tool consistent with existing coverage tools?  
Most method tested had 0% civerage since they did'nt have any tests implemented for them, for the rest OpenClover measured slightly higher coverage but it was close enough.

## Coverage improvement

### Report of old coverage:

| Function | Param | File Path | Coverage (OpenClover) | Coverage (DIY) |
|---|---|---|---|---|
| remove | 1 | datastructures/trees/BinaryTree.java | 0% | 0% |
| divide | 2 | maths/LongDivision.java | 86.6% | 68% |
| regexRecursion | 2 | dynamicprogramming/RegexMatching.java | 0% | 0% |
| regexRecursion | 4 | dynamicprogramming/RegexMatching.java | 0% | 0% |
| regexRecursion | 5 | dynamicprogramming/RegexMatching.java | 0% | 0% |

### Report of new coverage:

| Function | Param | File Path | Coverage (OpenClover) | Coverage (DIY) |
|---|---|---|---|---|
| remove | 1 | datastructures/trees/BinaryTree.java | 62.1% | 61% |
| divide | 2 | maths/LongDivision.java | 92.9% | 84% |
| regexRecursion | 2 | dynamicprogramming/RegexMatching.java | 51.2% | 57% |
| regexRecursion | 4 | dynamicprogramming/RegexMatching.java | 22% | 28% |
| regexRecursion | 5 | dynamicprogramming/RegexMatching.java | 0% | 0% |

### Test cases added:

**We added:**  
All tests in BinaryTreeTest.java  
All tests in RegexMatchingTest.java  
Tests testDivideDividendZero(), testDivideNegativeDividendLess() and testDividePositiveDividendPositiveDivisorPart1Zero() in LongDivisionTest.java

**Links:**  
https://github.com/dague1/Java/commit/e5f06b12ac52d494dc0f2e7515db31ef851f6dc8
https://github.com/dague1/Java/commit/716019949e9bac93648e63c09a48bacde879dc4e  
https://github.com/dague1/Java/commit/894f6aabf79bea6f10ad30ba7cacfda5976e9e50  
https://github.com/dague1/Java/commit/3c78a89bf2ce8218799b901069f7eda5b0b60d9a  
https://github.com/dague1/Java/commit/69059225291e0bd559ce51172dac5319cdea1cb3 
https://github.com/dague1/Java/commit/49007f7a86060854f3f1cd4bef36728228d489ff 

### Number of test cases added: two per team member (P) or at least four (P+).

We added 4 tests per team member for in total 20 new tests.

## Self-assessment: Way of working

The current state of way of working is in the “in place” state. The group established principles early on during the project and was in consensus regarding how these principles were to be followed and what constraints existed within the group and the project. The foundation was established early as practices were selected and agreed upon. This allowed the team to start putting in work and make use of the practices and tools previously selected, which were inspected with in place procedures earlier defined. The platforms for communication and support were established early on, which enabled collaboration and communication. Currently, the practices are being used by the whole team and the tasks being performed. The obstacles for the next state are mainly naturally applying the practices, which is usually that comes with time. The noticeable improvements during the course are how quick the practices, policies and tools could be established to create a workflow that was clear and easy to follow. Where there is room for further improvements lies mostly with things related to naturally adapting to new principles and procedures, as the teams were re-randomized halfway through the course. 

## Overall experience

It was a fun lab, and it was interesting to learn about the introduced concepts; perhaps primarily the cyclonic complexity metric. We agreed upon the fact that the CC metric is generally a good metric, but one needs to be careful not to tunnel vision and over-optimize to decrease the CC. Reason being, obtaining a low CC is not difficult per se, but obtaining a low CC while maintaining readable code can be. It has been interesting to learn a quantitative method of evaluating code quality. Prior to this, we mainly used a qualitative approach when evaluating code quality, except for perhaps the LoC metric.

We do wonder how frequently these metrics are used in the real world. After all, it is quite easy to see when code is complex and difficult to maintain. Just fixing the issues instead of focusing on the metric is likely more efficient and realistic. Nonetheless, it is indeed interesting that there is such a metric as the CC, and how it is based on graph theory.

The key takeaways for us is that we need to plan better, and start earlier. A lot of the work was unfortunately done the last couple days.
