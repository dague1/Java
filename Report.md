**Name:**
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
The patch is probably too long to be copied here, so please add
the git command that is used to obtain the patch instead:
git diff ...
What kinds of constructs does your tool support, and how accurate is
its output?
1. How detailed is your coverage measurement?
2. What are the limitations of your own tool?
3. Are the results of your tool consistent with existing coverage tools?
The current state of way of working is in the “in place” state. The group established principles early on during the project and was in consensus regarding how these principles were to be followed and what constraints existed within the group and the project. The foundation was established early as practices were selected and agreed upon. This allowed the team to start putting in work and make use of the practices and tools previously selected, which were inspected with in place procedures earlier defined. The platforms for communication and support were established early on, which enabled collaboration and communication. Currently, the practices are being used by the whole team and the tasks being performed. The obstacles for the next state are mainly naturally applying the practices, which is usually that comes with time. The noticeable improvements during the course are how quick the practices, policies and tools could be established to create a workflow that was clear and easy to follow. Where there is room for further improvements lies mostly with things related to naturally adapting to new principles and procedures, as the teams were re-randomized halfway through the course. 
It was a fun lab, and it was interesting to learn about the introduced concepts; perhaps primarily the cyclonic complexity metric. We agreed upon the fact that the CC metric is generally a good metric, but one needs to be careful not to tunnel vision and over-optimize to decrease the CC. Reason being, obtaining a low CC is not difficult per se, but obtaining a low CC while maintaining readable code can be. It has been interesting to learn a quantitative method of evaluating code quality. Prior to this, we mainly used a qualitative approach when evaluating code quality, except for perhaps the LoC metric.

We do wonder how frequently these metrics are used in the real world. After all, it is quite easy to see when code is complex and difficult to maintain. Just fixing the issues instead of focusing on the metric is likely more efficient and realistic. Nonetheless, it is indeed interesting that there is such a metric as the CC, and how it is based on graph theory.
The key takeaways for us is that we need to plan better, and start earlier. A lot of the work was unfortunately done the last couple days.