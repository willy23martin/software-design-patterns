# Behavioral Patterns - Strategy

In order to deal with the problem of incompatible interfaces, **Strategy Pattern** allows convert the one incompatible into another that the client expects:

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

## Without the Pattern
![DesignPatterns-Behavioral-Strategy-Without.png](src%2Fmain%2Fresources%2Fstatic%2FDesignPatterns-Behavioral-Strategy-Without.png)
## With the Pattern
![DesignPatterns-Behavior-Strategy-WIth.png](src%2Fmain%2Fresources%2Fstatic%2FDesignPatterns-Behavior-Strategy-WIth.png)

---


## CKJM Metrics Analysis of using **Strategy** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Strategy Pattern**:

|                           CKJM Metric                            | Without the Pattern | With the Pattern |
|:----------------------------------------------------------------:|:-------------------:|:----------------:|
|               **WMC**: Weighted methods per class                |                     |                  |
|                **DIT**: Depth of Inheritance Tree                |                     |                  |
|                   **NOC**: Number of Children                    |                     |                  |
|             **CBO**: Coupling between object classes             |                     |                  |
|                  **RFC**: Response for a Class                   |                     |                  |
|              **LCOM**: Lack of cohesion in methods               |                     |                  |
|           **Ca**: Afferent coupling (not a C&K metric)           |                     |                  |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |                     |                  |



---

## Related Patterns
1. [Bridge](../bridge-structural-pattern/HELP.md)
2. [State](../state-behavioral-pattern/HELP.md)
3. [Adapter](../adapter-structural-pattern/HELP.md)
4. [Command](../command-behavioral-pattern/HELP.md)