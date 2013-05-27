package com.snippets.designpatterns.creational.singleton;

import java.util.Objects;

public class SingletonLazyClass {

    /**
     * LAZY loaded instance. Will be initialised the first time when instance is required.
     * Holds the unique instance for this class.
     */
    private static volatile SingletonLazyClass singletonObj;   // ensures variable is read from HEAP and not

    private int value;

    /**
     * Private constructor to avoid creation of multiple instances.
     */
    private SingletonLazyClass() {
        if (Objects.nonNull(singletonObj)) {
            throw new RuntimeException("Singleton class should be instantiated with getInstance method."); // against Java reflection calls
        }
    }

    /**
     * Get the instance for this class.
     *
     * @return always the same unique instance
     */
    public static SingletonLazyClass getInstance() {
        if (Objects.isNull(singletonObj)) {
            synchronized (SingletonLazyClass.class) {  // thread safe! Putting synchronized on the entire method would slow it down when singletonObj != null.
                if (Objects.isNull(singletonObj)) {    // checks again in synchronized block in case another thread has already created it
                    singletonObj = new SingletonLazyClass();
                }
            }
        }
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
        SingletonLazyClass that = (SingletonLazyClass) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SingletonLazyClass{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
