# Software Design Patterns for Java Applications
Proof of Concepts of Design Patterns for Java applications and the evaluation of the CKJM quality metrics.

## Design Patterns Catalog (23 patterns)

### Creational Patterns Catalog
1. [Abstract Factory](abstractfactory-creational-pattern)
2. [Builder](builder-creational-pattern)
3. [Factory Method](factory-creational-pattern)
4. [Prototype](prototype-creational-pattern)
5. [Singleton](singleton-creational-pattern)

### Structural Patterns Catalog
1. [Adapter](adapter-structural-pattern)
2. [Bridge](bridge-structural-pattern)
3. [Composite](composite-structural-pattern)
4. [Decorator](decorator-structural-pattern)
5. [Facade](facade-structural-pattern)
6. [Flyweight](flyweight-structural-pattern)
7. [Proxy](proxy-structural-pattern)

### Behavioral Patterns Catalog
1. [Chain of Responsibility](chainofresponsibility-behavioral-pattern)
2. [Command](command-behavioral-pattern)
3. [Interpreter](interpreter-behavioral-pattern)
4. [Iterator](iterator-behavioral-pattern)
5. [Mediator](mediator-behavioral-pattern)
6. [Memento](memento-behavioral-pattern)
7. [Observer](observer-behavioral-pattern)
8. [State](state-behavioral-pattern)
9. [Strategy](strategy-behavioral-pattern)
10. [Template Method](templatemethod-behavioral-pattern)
11. [Visitor](visitor-behavioral-pattern)

## CKJM Metrics
To execute the metrics you should:
1. Compile each module by executing ```mvn clean install -e```
2. Download the CKJM jar file called
3. In the Terminal, located in the CKJM jar directory execute the following command: ``` java -jar ckjm_ext.jar target/classes/<packages_path_to_.class_files>/*.class```

## References

1. [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/b77puMG)
2. [CKJM Metrics](https://www.spinellis.gr/sw/ckjm/doc/indexw.html)