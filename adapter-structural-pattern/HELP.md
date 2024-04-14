# Design Patterns

### Structural Patterns - Adapter

In order to deal with the problem of incompatible interfaces, **Adapter Pattern** allows convert the one incompatible into another that the client expects:

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
* [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)

#### CKJM Metrics Analysis of using **Adapter** Pattern:

The following summary shows us how **CKJM Metrics**  have been affected in this project after having applied the **Adapter Pattern**:

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

