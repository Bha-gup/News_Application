package com.example.newsapp;

import java.util.ArrayList;

public class MainNews {

    private String status;
    private String totalResults;
    private ArrayList<ModelClass> articles;


    public MainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
class Login{

    private String email;
    private String password;
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
