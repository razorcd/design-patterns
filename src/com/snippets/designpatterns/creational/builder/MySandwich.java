package com.snippets.designpatterns.creational.builder;

import java.util.Objects;

public class MySandwich {

    private String bread;
    private String cream;
    private boolean toasted;


    /**
     * Get the builder for this class.
     *
     * @return the builder instance to construct the current sandwich instance.
     */
    public Builder getBuilder() {
        return new Builder(this);
    }



    /**
     * Defines a builder class for current MySandwich class.
     * It is meant to fix complex constructors.
     * There is no need to build this Builder inner class. All building methods could be in main class.
     */
    public static class Builder {
        private final MySandwich sandwich;

        /**
         * Constructor with with main instance.
         *
         * @param sandwich the main instance.
         */
        private Builder(MySandwich sandwich) {
            this.sandwich = sandwich;
        }

        public Builder bread(String bread) {
            sandwich.bread = bread;
            return this;
        }

        public Builder cream(String cream) {
            sandwich.cream = cream;
            return this;
        }

        public Builder toasted(boolean toasted) {
            sandwich.toasted = toasted;
            return this;
        }

        /**
         * Get the built MySandwich instance
         * @return the built MySandwich instance
         */
        public MySandwich build() {
            return sandwich;
        }
    }



    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCream() {
        return cream;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MySandwich that = (MySandwich) o;
        return toasted == that.toasted &&
                Objects.equals(bread, that.bread) &&
                Objects.equals(cream, that.cream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, cream, toasted);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MySandwich{");
        sb.append("bread='").append(bread).append('\'');
        sb.append(", cream='").append(cream).append('\'');
        sb.append(", toasted=").append(toasted);
        sb.append('}');
        return sb.toString();
    }
}
