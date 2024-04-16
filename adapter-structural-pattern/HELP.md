# Structural Patterns - Adapter

In order to deal with the problem of incompatible interfaces, **Adapter Pattern** (also known as **Wrapper**) allows convert the one incompatible into another that the client expects:

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

## Without the Pattern
![Design Patterns - Class Diagram - Without - Adapter Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Class%20Diagram%20-%20Without%20-%20Adapter%20Pattern.png)
## With the Pattern
![Design Patterns - Class Diagram - With - Adapter Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Class%20Diagram%20-%20With%20-%20Adapter%20Pattern.png)

---

## CKJM Metrics Analysis of using **Adapter** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Adapter Pattern**:

|                           CKJM Metric                            | Without the Pattern | With the Pattern |
|:----------------------------------------------------------------:|:-------------------:|:----------------:|
|               **WMC**: Weighted methods per class                |        3.14         |       4.3        |
|                **DIT**: Depth of Inheritance Tree                |          1          |        1         |
|                   **NOC**: Number of Children                    |          0          |        0         |
|             **CBO**: Coupling between object classes             |        2.85         |        4         |
|                  **RFC**: Response for a Class                   |          7          |       7.7        |
|              **LCOM**: Lack of cohesion in methods               |        0.71         |        2         |
|           **Ca**: Afferent coupling (not a C&K metric)           |        1.85         |       1.8        |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |        1.57         |       2.2        |

---

![Design Patterns - CKJM - Metrics - Adapter Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20CKJM%20-%20Metrics%20-%20Adapter%20Pattern.png)

---

## Related Patterns
1. [Bridge](../bridge-structural-pattern/HELP.md)
2. [Decorator](../decorator-structural-pattern/HELP.md)
3. [Proxy](../proxy-structural-pattern/HELP.md)