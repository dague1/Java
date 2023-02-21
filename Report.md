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
2. Are the functions just complex, or also long?
3. What is the purpose of the functions?
4. Are exceptions taken into account in the given measurements?
5. Is the documentation clear w.r.t. all the possible outcomes?

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

**remove()**



**divide()**




**regexRecursion(2)**



**regexRecursion(4)**



**regexRecursion(5)**


git diff ...

## Coverage

### Tools

Document your experience in using a "new"/different coverage tool.

How well was the tool documented? Was it possible/easy/difficult to
integrate it with your build environment?

The tool we chose to use was OpenClover. It was fairly simple to set up and use through Maven. While running the coverage measurement, we encountered some trouble where OpenClover could not measure certain methods and classes. The exceptions that were thrown indicated there was some syntax error. However, when looking into the files ourselves, the syntax was fine. Luckily none of the method that we planned to use for the assignment caused any trouble for OpenClover so we ended up running the measurement tool only on the files including our choosen methods instead of running it on the whole project.

### Your own coverage tool

Show a patch (or link to a branch) that shows the instrumented code to
gather coverage measurements.

Branch: https://github.com/dague1/Java/tree/8-other-35-coverage-measurement-improvement

git diff master 8-other-35-coverage-measurement-improvement:

diff --git a/Report.md b/Report.md  
index d492a67..a77b53b 100644  
--- a/Report.md  
+++ b/Report.md  

diff --git a/pom.xml b/pom.xml  
index accdd21..5321c89 100644  
--- a/pom.xml  
+++ b/pom.xml  

diff --git a/src/main/java/com/thealgorithms/CoverageResults.java b/src/main/java/com/thealgorithms/CoverageResults.java  
new file mode 100644  
index 0000000..51619f8  
--- /dev/null  
+++ b/src/main/java/com/thealgorithms/CoverageResults.java  

diff --git a/src/main/java/com/thealgorithms/datastructures/trees/BinaryTree.java b/src/main/java/com/thealgorithms/datastructures/trees/BinaryTree.java  
index 48dfe96..65be209 100644  
--- a/src/main/java/com/thealgorithms/datastructures/trees/BinaryTree.java  
+++ b/src/main/java/com/thealgorithms/datastructures/trees/BinaryTree.java  

diff --git a/src/main/java/com/thealgorithms/maths/LongDivision.java b/src/main/java/com/thealgorithms/maths/LongDivision.java  
index 88a0a26..5b96bd3 100644  
--- a/src/main/java/com/thealgorithms/maths/LongDivision.java  
+++ b/src/main/java/com/thealgorithms/maths/LongDivision.java  

diff --git a/src/test/java/com/thealgorithms/datastructures/trees/BinaryTreeTest.java b/src/test/java/com/thealgorithms/datastructures/trees/BinaryTreeTest.java  
new file mode 100644  
index 0000000..71c1440  
--- /dev/null  
+++ b/src/test/java/com/thealgorithms/datastructures/trees/BinaryTreeTest.java  

diff --git a/src/test/java/com/thealgorithms/maths/LongDivisionTest.java b/src/test/java/com/thealgorithms/maths/LongDivisionTest.java  
index c35b606..fff1315 100644  
--- a/src/test/java/com/thealgorithms/maths/LongDivisionTest.java  
+++ b/src/test/java/com/thealgorithms/maths/LongDivisionTest.java  

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

All tests in BinaryTreeTest.java  
All tests in RegexMatchingTest.java  
Tests testDivideDividendZero(), testDivideNegativeDividendLess() and testDividePositiveDividendPositiveDivisorPart1Zero() in LongDivisionTest.java


### git diff master 10-other-p+-write-four-enhanced-unit-tests:  

diff --git a/Report.md b/Report.md  
index d492a67..2a2d2ed 100644  
--- a/Report.md  
+++ b/Report.md  

diff --git a/src/test/java/com/thealgorithms/datastructures/trees/BinaryTreeTest.java b/src/test/java/com/thealgorithms/datastructures/trees/BinaryTreeTest.java  
new file mode 100644  
index 0000000..e7f0359  
--- /dev/null  
+++ b/src/test/java/com/thealgorithms/datastructures/trees/BinaryTreeTest.java  

diff --git a/src/test/java/com/thealgorithms/dynamicprogramming/RegexMatchingTest.java b/src/test/java/com/thealgorithms/dynamicprogramming/RegexMatchingTest.java  
new file mode 100644  
index 0000000..dfa1c89  
--- /dev/null  
+++ b/src/test/java/com/thealgorithms/dynamicprogramming/RegexMatchingTest.java  

diff --git a/src/test/java/com/thealgorithms/maths/LongDivisionTest.java b/src/test/java/com/thealgorithms/maths/LongDivisionTest.java  
index c35b606..9a0182c 100644  
--- a/src/test/java/com/thealgorithms/maths/LongDivisionTest.java  
+++ b/src/test/java/com/thealgorithms/maths/LongDivisionTest.java  

### Number of test cases added: two per team member (P) or at least four (P+).

We added 4 tests per team member for in total 20 new tests.

## Self-assessment: Way of working

The current state of way of working is in the “in place” state. The group established principles early on during the project and was in consensus regarding how these principles were to be followed and what constraints existed within the group and the project. The foundation was established early as practices were selected and agreed upon. This allowed the team to start putting in work and make use of the practices and tools previously selected, which were inspected with in place procedures earlier defined. The platforms for communication and support were established early on, which enabled collaboration and communication. Currently, the practices are being used by the whole team and the tasks being performed. The obstacles for the next state are mainly naturally applying the practices, which is usually that comes with time. The noticeable improvements during the course are how quick the practices, policies and tools could be established to create a workflow that was clear and easy to follow. Where there is room for further improvements lies mostly with things related to naturally adapting to new principles and procedures, as the teams were re-randomized halfway through the course. 

## Overall experience

It was a fun lab, and it was interesting to learn about the introduced concepts; perhaps primarily the cyclonic complexity metric. We agreed upon the fact that the CC metric is generally a good metric, but one needs to be careful not to tunnel vision and over-optimize to decrease the CC. Reason being, obtaining a low CC is not difficult per se, but obtaining a low CC while maintaining readable code can be. It has been interesting to learn a quantitative method of evaluating code quality. Prior to this, we mainly used a qualitative approach when evaluating code quality, except for perhaps the LoC metric.

We do wonder how frequently these metrics are used in the real world. After all, it is quite easy to see when code is complex and difficult to maintain. Just fixing the issues instead of focusing on the metric is likely more efficient and realistic. Nonetheless, it is indeed interesting that there is such a metric as the CC, and how it is based on graph theory.

The key takeaways for us is that we need to plan better, and start earlier. A lot of the work was unfortunately done the last couple days.
