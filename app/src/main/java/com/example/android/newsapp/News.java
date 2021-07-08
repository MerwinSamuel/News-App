package com.example.android.newsapp;

public class News {

    private String mWebTitle;
    private String mSectionName;
    private String mWebPublicationDate;
    private String mUrl;
    private String mAuthor;

    public News(String webTitle, String sectionName, String webPublicationDate, String url, String author){
        mWebTitle=webTitle;
        mSectionName=sectionName;
        mWebPublicationDate=webPublicationDate;
        mUrl=url;
        mAuthor=author;
    }

    public String getWebTitle(){
        return mWebTitle;
    }
    public String getSectionName(){
        return mSectionName;
    }
    public String getWebPublicationDate(){
        return mWebPublicationDate;
    }
    public String getUrl(){
        return mUrl;
    }
    public String getAuthor(){return mAuthor;}
}
