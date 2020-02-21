package com.moskaoud.tourguideappksa;

public class KSAData {
    int imageResource;
    String description;

    KSAData(int imageResource, String description) {
        this.imageResource = imageResource;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
