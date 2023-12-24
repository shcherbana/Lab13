package org.example.task1;

import java.time.LocalDateTime;

public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();

    }
    @Override
    public LocalDateTime getLastActiveTime() {

        return facebookUser.getLastActiveTime();
    }
}
