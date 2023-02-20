# Report for assignment 3

This is a template for your report. You are free to modify it as needed.
It is not required to use markdown for your report either, but the report
has to be delivered in a standard, cross-platform format.

## Project

**Name: **

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

Plan for refactoring complex code:

Estimated impact of refactoring (lower CC, but other drawbacks?).

Carried out refactoring (optional, P+):

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

Show the comments that describe the requirements for the coverage.

Report of old coverage: [link]

| Function | Param | File Path | Coverage (OpenClover) | Coverage (DIY) |
|---|---|---|---|---|
| remove | 1 | datastructures/trees/BinaryTree.java | 0% | 0% |
| divide | 2 | maths/LongDivision.java | 86.6% | 68% |
| regexRecursion | 2 | dynamicprogramming/RegexMatching.java | - | - |
| regexRecursion | 4 | dynamicprogramming/RegexMatching.java | - | - |
| regexRecursion | 5 | dynamicprogramming/RegexMatching.java | - | - |
| regexBU | 2 | dynamicprogramming/RegexMatching.java | - | - |

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
