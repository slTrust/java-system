package com.littlejava.view;

import com.littlejava.model.News;

import java.util.ArrayList;

public class NewsListView {
    private ArrayList<News> newsList;

    public NewsListView(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    public void display(){
        for (News news: newsList) {
            // 转移到 News 内部 因为扩展后 display 变了
            System.out.println("---------------------------------");
            // System.out.println("|Title| " + news.getTitle());
            // System.out.println("|Content| " + news.getContent());
            news.display();
        }
    }


}
