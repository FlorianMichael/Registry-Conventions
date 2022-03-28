# Registry Convention Pattern

Usage

```java
package de.florianmichael;

import de.florianmichael.registryconvention.exception.ListFuncError;
import de.florianmichael.registryconvention.listener.IAddListener;
import de.florianmichael.registryconvention.nameable.IStringNameable;
import de.florianmichael.registryconvention.nameable.NameableRegistry;

public class ExampleRegistry extends NameableRegistry<ExampleRegistry.TestObject> {

    public void init() {
        this.setAddListener(new IAddListener<TestObject>() {
            @Override
            public void add(TestObject t) {
                System.out.println("Added " + t.name);
            }
        });
    }

    public void addDefaults() throws ListFuncError {
        this.add(
                new TestObject("Person 1", 14),
                new TestObject("Person 2", 16)
        );
    }

    public static record TestObject(String name, int age) implements IStringNameable {
        @Override
        public String name() {
            return name;
        }
    }
}

```
