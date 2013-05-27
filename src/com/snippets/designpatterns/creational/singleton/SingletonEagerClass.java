package com.snippets.designpatterns.creational.singleton;

import java.util.Objects;

public class SingletonEagerClass {

    /**
     * EAGER loaded instance.
     * Holds the unique instance for this class.
     */
    private static final SingletonEagerClass singletonObj = new SingletonEagerClass();

    private int value;

    /**
     * Private constructor to avoid creation of multiple instances.
     */
    private SingletonEagerClass() {
        if (Objects.nonNull(singletonObj)) {
            throw new RuntimeException("Singleton class should be instantiated with getInstance method."); // against java reflection calls
        }
    }

    /**
     * Get the instance for this class.
     *
     * @return always the same unique instance
     */
    public static SingletonEagerClass getInstance() {
        return singletonObj;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingletonEagerClass that = (SingletonEagerClass) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SingletonEagerClass{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
