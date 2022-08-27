 package com.johnny.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Registrer your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pastagram-jhon")
                .clientKey("CodepathMoveFastParse")
                .server("https://pastagram-jhon.herokuapp.com/parse/").build()
        );
    }
}
