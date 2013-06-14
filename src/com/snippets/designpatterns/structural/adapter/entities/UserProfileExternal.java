package com.snippets.designpatterns.structural.adapter.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * This class does not implement UserProfile interface. So it can not be used where UserProfile is needed.
 * It requires an adapter to be used with UserProfileClient
 */
public class UserProfileExternal {

    private String name;
    private LocalDate birthDate;

    public UserProfileExternal() {
    }

    public UserProfileExternal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfileExternal that = (UserProfileExternal) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, birthDate);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserProfileExternal{");
        sb.append("stateName='").append(name).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }
}
