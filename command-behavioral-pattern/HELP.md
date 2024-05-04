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
1. [AbstractFactory](../abstractfactory-creational-pattern/HELP.md)
2. [Adapter](../adapter-structural-pattern/HELP.md)
