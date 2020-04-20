package com.co.gco.websocketexample.models;

public class ChatMessageDTO {

    private String primaryText;
    private String secondaryText;
    private boolean isAvatar;
    private boolean isIcon;

    public String getPrimaryText() {
        return primaryText;
    }

    public void setPrimaryText(String primaryText) {
        this.primaryText = primaryText;
    }

    public String getSecondaryText() {
        return secondaryText;
    }

    public void setSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
    }

    public boolean getIsAvatar() {
        return isAvatar;
    }

    public void setAvatar(boolean isAvatar) {
        this.isAvatar = isAvatar;
    }

    public boolean getIsIcon() {
        return isIcon;
    }

    public void setIcon(boolean isIcon) {
        this.isIcon = isIcon;
    }
}
