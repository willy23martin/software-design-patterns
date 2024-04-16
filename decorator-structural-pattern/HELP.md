# Structural Patterns - Decorator

In order to attach additional responsibilities to an object dynamically, the **Decorator Pattern** provides a technique to extend the functionality as a **Wrapper**:

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

## Without the Pattern
![Design Patterns - Class Diagram - Without - Decorator Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Class%20Diagram%20-%20Without%20-%20Decorator%20Pattern.png)
## With the Pattern
![Design Patterns - Class Diagram - With - Decorator Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Class%20Diagram%20-%20With%20-%20Decorator%20Pattern.png)

---

## CKJM Metrics Analysis of using **Decorator** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Decorator Pattern**:

|                           CKJM Metric                            | Without the Pattern | With the Pattern |
|:----------------------------------------------------------------:|:-------------------:|:----------------:|
|               **WMC**: Weighted methods per class                |         2.6         |       2.6        |
|                **DIT**: Depth of Inheritance Tree                |          1          |        1         |
|                   **NOC**: Number of Children                    |          0          |        0         |
|             **CBO**: Coupling between object classes             |         3.4         |       3.8        |
|                  **RFC**: Response for a Class                   |         4.9         |       4.7        |
|              **LCOM**: Lack of cohesion in methods               |         0.4         |       0.4        |
|           **Ca**: Afferent coupling (not a C&K metric)           |         1.6         |       1.8        |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |         2.3         |       1.9        |

![Design Patterns - CKJM Metrics- Decorator Pattern.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20CKJM%20Metrics-%20Decorator%20Pattern.png)

---

## Related Patterns
1. [Adapter](../adapter-structural-pattern/HELP.md)
2. [Composite](../composite-structural-pattern/HELP.md)
3. [Strategy](../strategy-behavioral-pattern/HELP.md)
