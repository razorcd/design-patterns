package com.snippets.designpatterns.structural.adapter;

public class UserProfileClient {

    /**
     * Print UserProfile implementation.
     *
     * @param userProfile
     */
    public void printUserProfile(UserProfile userProfile) {
        System.out.println("User first stateName : " + userProfile.getFirstName());
        System.out.println("User last stateName  : " + userProfile.getLastName());
        System.out.println("User age        : " + userProfile.getAge());
    }
}
