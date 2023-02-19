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

The current state of way of working is in the “in place” state. The group established principles early on during the project and was in consensus regarding how these principles were to be followed and what constraints existed within the group and the project. The foundation was established early as practices were selected and agreed upon. This allowed the team to start putting in work and make use of the practices and tools previously selected, which were inspected with in place procedures earlier defined. The platforms for communication and support were established early on, which enabled collaboration and communication. Currently, the practices are being used by the whole team and the tasks being performed. The obstacles for the next state are mainly naturally applying the practices, which is usually that comes with time. The noticeable improvements during the course are how quick the practices, policies and tools could be established to create a workflow that was clear and easy to follow. Where there is room for further improvements lies mostly with things related to naturally adapting to new principles and procedures, as the teams were re-randomized halfway through the course. 

## Overall experience

What are your main take-aways from this project? What did you learn?

Is there something special you want to mention here?
