package com.snippets.designpatterns.structural.adapter;

import com.snippets.designpatterns.structural.adapter.entities.UserProfileDb;
import com.snippets.designpatterns.structural.adapter.entities.UserProfileExternal;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        UserProfileClient userProfileClient = new UserProfileClient();

        UserProfile userProfileDb = new UserProfileDb("Tom", "John", 33);

        userProfileClient.printUserProfile(userProfileDb);

        System.out.println();


        UserProfileExternal userProfileExternal = new UserProfileExternal("Tom John", LocalDate.parse("1980-06-29"));
        UserProfile adaptedUserProfileExternal = new UserProfileExternalAdapter(userProfileExternal);
        adaptedUserProfileExternal.setAge(10);

        userProfileClient.printUserProfile(adaptedUserProfileExternal);

    }
}
