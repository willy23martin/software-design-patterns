# Design Patterns

### Creational Patterns - Factory Method

In order to deal with the problem of incompatible interfaces, **Factory Method Pattern** allows convert the one incompatible into another that the client expects:

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

#### Without the Pattern

![Design Patterns - Creational - Factory Method - Without Pattern.png](..%2Fsrc%2Fmain%2Fresources%2Fimg%2FDesign%20Patterns%20-%20Creational%20-%20Factory%20Method%20-%20Without%20Pattern.png)

#### With the Pattern

![Design Patterns - Creational - Factory Method - With Pattern.png](..%2Fsrc%2Fmain%2Fresources%2Fimg%2FDesign%20Patterns%20-%20Creational%20-%20Factory%20Method%20-%20With%20Pattern.png)

#### CKJM Metrics Analysis of using **Factory Method** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Factory Method Pattern**:

|                           CKJM Metric                            | Average<br/>Without the Pattern | Average<br/>With the Pattern |
|:----------------------------------------------------------------:|:-------------------------------:|:----------------------------:|
|               **WMC**: Weighted methods per class                |                2                |              3               |
|                **DIT**: Depth of Inheritance Tree                |                1                |              1               |
|                   **NOC**: Number of Children                    |                0                |              0               |
|             **CBO**: Coupling between object classes             |                2                |             3.4              |
|                  **RFC**: Response for a Class                   |                3                |             5.6              |
|              **LCOM**: Lack of cohesion in methods               |                0                |              1               |
|           **Ca**: Afferent coupling (not a C&K metric)           |              0.75               |             1.4              |
| **NPM**: Number of Public Methods for a class (not a C&K metric) |              1.25               |              2               |


![DESIGN PATTERNS - CKJM - Creational Pattern - Factory Method.png](..%2Fsrc%2Fmain%2Fresources%2Fimg%2FDESIGN%20PATTERNS%20-%20CKJM%20-%20Creational%20Pattern%20-%20Factory%20Method.png)
