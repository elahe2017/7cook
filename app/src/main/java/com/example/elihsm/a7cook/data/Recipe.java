
package com.example.elihsm.a7cook.data;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Recipe {

    @SerializedName("id")
    private Long mId;
    @SerializedName("img")
    private String mImg;
    @SerializedName("link")
    private String mLink;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("author")
    private String mAuthor;
    @SerializedName("rating")
    private float mRate;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImg() {
        return mImg;
    }

    public void setImg(String img) {
        mImg = img;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) { mTitle = title; }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) { mDescription = description; }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) { mAuthor = author; }

    public float getRate() {
        return mRate;
    }

    public void setRate(float rate) { mRate = rate; }


}
