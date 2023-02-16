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
   
| Function | Param | File Path | C-Complexity (auto) | C-Complexity (manual 1) | C-Complexity (manual 2) |
|---|---|---|---|---|---|
| remove | - | datastructures/trees/BinaryTree.java | 17 | - | - |
| myAtoi | - | strings/MyAtoi.java | 37 | - | - |
| divide | - | maths/LongDivision.java | 19 | - | - |
| divideMessageWithP | - | others/CRCAlgorithm.java | 18 | - | - |
| calculateMaxOfMin | - | datastructures/stacks/MaximumMinimumWindow.java | 15 | - | - |
| regexRecursion | 2 | dynamicprogramming/RegexMatching.java | 13 | - | - |
| regexRecursion | 4 | dynamicprogramming/RegexMatching.java | 13 | - | - |
| regexRecursion | 5 | dynamicprogramming/RegexMatching.java | 16 | - | - |
| regexBU | 2 | dynamicprogramming/RegexMatching.java | 9 | - | - |
| minimalpartitions | 1 | dynamicprogramming/PalindromicPartitioning.java | 12 | - | - |



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
