# Design Patterns

### Behavioral Patterns - Command

In order to deal with the problem of incompatible interfaces, **Command Pattern** allows convert the one incompatible into another that the client expects:

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

## Without the Pattern
![Design Patterns - Behavioral - Command - without.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Behavioral%20-%20Command%20-%20without.png)
## With the Pattern
![Design Patterns - Behavioral - Command - with.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Behavioral%20-%20Command%20-%20with.png)

---

#### CKJM Metrics Analysis of using **Command** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Command Pattern**:

|                           CKJM Metric                            | Without the Pattern | With the Pattern |
|:----------------------------------------------------------------:|:-------------------:|:----------------:|
|               **WMC**: Weighted methods per class                |        3.11         |       3.3        |
|                **DIT**: Depth of Inheritance Tree                |          1          |        1         |
|                   **NOC**: Number of Children                    |          0          |        0         |
|             **CBO**: Coupling between object classes             |        3.66         |       3.6        |
|                  **RFC**: Response for a Class                   |        6.44         |       6.4        |
|              **LCOM**: Lack of cohesion in methods               |        0.88         |       0.5        |
|           **Ca**: Afferent coupling (not a C&K metric)           |        1.11         |       1.1        |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |        2.55         |       2.5        |

![Design Patterns - Behavioral - Command - CKJM Metrics.png](src%2Fmain%2Fresources%2Fstatic%2FDesign%20Patterns%20-%20Behavioral%20-%20Command%20-%20CKJM%20Metrics.png)

---

## Related Patterns
1. [Composite](../composite-structural-pattern/HELP.md)
2. [Memento](../memento-behavioral-pattern/HELP.md)
