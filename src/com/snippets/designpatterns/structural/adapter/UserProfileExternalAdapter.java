package com.snippets.designpatterns.structural.adapter;

import com.snippets.designpatterns.structural.adapter.entities.UserProfileExternal;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Adapts UserProfileExternal to UserProfile interface
 */
public class UserProfileExternalAdapter implements UserProfile {

    // holds external object that will be adapted to new interface
    private UserProfileExternal userProfileExternal;

    /**
     * The userProfileExternal class that will be adapted to new interface.
     *
     * @param userProfileExternal
     */
    public UserProfileExternalAdapter(UserProfileExternal userProfileExternal) {
        this.userProfileExternal = userProfileExternal;
    }

    @Override
    public String getFirstName() {
        return userProfileExternal.getName().split(" ",2)[0];
    }

    @Override
    public void setFirstName(String firstName) {
        String name = firstName + " " + getLastName();
        userProfileExternal.setName(name);
    }

    @Override
    public String getLastName() {
        return userProfileExternal.getName().split(" ",2)[1];
    }

    @Override
    public void setLastName(String lastName) {
        String name = getFirstName() + " " + lastName;
        userProfileExternal.setName(name);
    }

    @Override
    public int getAge() {
        return LocalDateTime.now().getYear() - userProfileExternal.getBirthDate().getYear();
    }

    // will set birthday at the beginning of the birth year.
    @Override
    public void setAge(int age) {
        LocalDate birthDate =  LocalDate.now().minusYears(age).withDayOfYear(1);
        userProfileExternal.setBirthDate(birthDate);
    }
}
