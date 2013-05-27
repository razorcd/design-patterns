package com.snippets.designpatterns.creational.prototype;

import java.util.Objects;

public class Resource implements Cloneable {

    private String param;
    private boolean active;
    private Child child;
    private DeepCopyChild deepCopyChild;

    public Resource() {
    }

    public Resource(String param, boolean active, Child child, DeepCopyChild deepCopyChild) {
        this.param = param;
        this.active = active;
        this.child = child;
        this.deepCopyChild = deepCopyChild;
    }



    /**
     * Copy constructor. It manually creates a new copied instance.
     * A better approach then using Cloneable.
     *
     * @param oldResource the resource to copy
     */
    public Resource(Resource oldResource) {
        this.param = oldResource.param;
        this.active = oldResource.active;
        this.child = oldResource.child;   // shallow copy
        this.deepCopyChild = new DeepCopyChild(oldResource.deepCopyChild);   // deep copy
    }


    /**
     * Shallow copy of current object.
     * Cloneable was implemented in Java 1.0 and has no Generics. Using Copy is a better approach.
     * @return a new copied instance
     */
    @Override
    protected Resource clone() {
        try {
            return (Resource) super.clone();
        } catch(CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
    }



    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public DeepCopyChild getDeepCopyChild() {
        return deepCopyChild;
    }

    public void setDeepCopyChild(DeepCopyChild deepCopyChild) {
        this.deepCopyChild = deepCopyChild;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return active == resource.active &&
                Objects.equals(param, resource.param) &&
                Objects.equals(child, resource.child) &&
                Objects.equals(deepCopyChild, resource.deepCopyChild);
    }

    @Override
    public int hashCode() {

        return Objects.hash(param, active, child, deepCopyChild);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Resource{");
        sb.append("param='").append(param).append('\'');
        sb.append(", active=").append(active);
        sb.append(", child=").append(child);
        sb.append(", deepCopyChild=").append(deepCopyChild);
        sb.append('}');
        return sb.toString();
    }
}
