# Structural Patterns - Bridge

The **Bridge Pattern** decouples an abstraction from its implementation in order to let them vary independently.

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

## Without the Pattern
![Design Patterns - Class Diagram - Without - Bridge Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Class%20Diagram%20-%20Without%20-%20Bridge%20Pattern.png)
## With the Pattern
![Design Patterns - Class Diagram - With - Bridge Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Class%20Diagram%20-%20With%20-%20Bridge%20Pattern.png)

---

## CKJM Metrics Analysis of using **Bridge** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Bridge Pattern**:

|                           CKJM Metric                            | Without the Pattern | With the Pattern |
|:----------------------------------------------------------------:|:-------------------:|:----------------:|
|               **WMC**: Weighted methods per class                |        3.66         |       3.28       |
|                **DIT**: Depth of Inheritance Tree                |          1          |        1         |
|                   **NOC**: Number of Children                    |          0          |        0         |
|             **CBO**: Coupling between object classes             |        3.66         |       3.71       |
|                  **RFC**: Response for a Class                   |          6          |       5.28       |
|              **LCOM**: Lack of cohesion in methods               |         1.2         |        2         |
|           **Ca**: Afferent coupling (not a C&K metric)           |         1.5         |       1.71       |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |        2.16         |        1         |

![Design Patterns - CKJM Metrics- Bridge Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20CKJM%20Metrics-%20Bridge%20Pattern.png)

---

## Related Patterns
1. [AbstractFactory](../abstractfactory-creational-pattern)
2. [Adapter](../adapter-structural-pattern)