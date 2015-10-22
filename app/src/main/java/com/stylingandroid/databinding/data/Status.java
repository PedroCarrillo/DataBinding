package com.stylingandroid.databinding.data;

import android.support.annotation.NonNull;

@SuppressWarnings("Unused")
public class Status {

    private final String name;
    private final String screenName;
    private final String text;
    private final String imageUrl;
    private final Status quotedStatus;

    public Status(@NonNull String name, @NonNull String screenName, @NonNull String text, @NonNull String imageUrl, Status quotedStatus) {
        this.name = name;
        this.screenName = screenName;
        this.text = text;
        this.imageUrl = imageUrl;
        this.quotedStatus = quotedStatus;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Status getQuotedStatus() {
        return quotedStatus;
    }

    public boolean hasQuotedStatus() {
        return quotedStatus != null;
    }

}
