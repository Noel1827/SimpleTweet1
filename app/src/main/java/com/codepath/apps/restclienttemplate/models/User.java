package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    private String name;
    private String screenName;
    private String profileImageUrl;
    public static User fromJson(JSONObject jsonObject) throws JSONException {
    User user = new User();
    user.setName(jsonObject.getString("name"));
    user.setScreenName(jsonObject.getString("screen_name"));
    user.setProfileImageUrl(jsonObject.getString("profile_image_url_https"));
    return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
