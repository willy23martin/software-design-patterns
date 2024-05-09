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
|               **WMC**: Weighted methods per class                |         1.8         |        2         |
|                **DIT**: Depth of Inheritance Tree                |          1          |        1         |
|                   **NOC**: Number of Children                    |          0          |        0         |
|             **CBO**: Coupling between object classes             |          3          |       3.16       |
|                  **RFC**: Response for a Class                   |         3.8         |       4.3        |
|              **LCOM**: Lack of cohesion in methods               |         0.8         |       1.6        |
|           **Ca**: Afferent coupling (not a C&K metric)           |         1.4         |       1.5        |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |         1.6         |       1.6        |

![DesignPatterns-Behavior-Strategy-CKJM Metrics.png](src%2Fmain%2Fresources%2Fstatic%2FDesignPatterns-Behavior-Strategy-CKJM%20Metrics.png)

---

## Related Patterns
1. [Bridge](../bridge-structural-pattern/HELP.md)
2. [State](../state-behavioral-pattern/HELP.md)
3. [Adapter](../adapter-structural-pattern/HELP.md)
4. [Command](../command-behavioral-pattern/HELP.md)