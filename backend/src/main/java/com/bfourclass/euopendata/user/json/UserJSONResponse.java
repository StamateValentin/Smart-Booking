package com.bfourclass.euopendata.user.json;

public class UserJSONResponse {

    public final String username;
    public final String email;
    public final String profilePhotoLink;

    public final String authorizationToken;

    public UserJSONResponse(String username, String email, String profilePhotoLink, String authorizationToken) {
        this.username = username;
        this.email = email;
        this.profilePhotoLink = profilePhotoLink;
        this.authorizationToken = authorizationToken;
    }
}