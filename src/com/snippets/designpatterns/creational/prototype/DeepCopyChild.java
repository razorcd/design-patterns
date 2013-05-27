package com.snippets.designpatterns.creational.prototype;

public class DeepCopyChild implements Cloneable {

    private int value;

    public DeepCopyChild() {
    }

    public DeepCopyChild(int value) {
        this.value = value;
    }


    /**
     * Copy constructor.
     *
     * @param oldDeepCopyChild the DeepCopyChild instance to copy
     */
    public DeepCopyChild(DeepCopyChild oldDeepCopyChild) {
        this.value = oldDeepCopyChild.value;
    }



    @Override
    protected DeepCopyChild clone() {
        try {
            return (DeepCopyChild) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return null;
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
        DeepCopyChild that = (DeepCopyChild) o;
        return value == that.value;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("DeepCopyChild{");
//        sb.append("value=").append(value);
//        sb.append('}');
//        return sb.toString();
//    }
}
