package com.example.demoSpringBootElasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName = "course")
public class Course {
    @Id
    private String id, name, price, describe, time;
    public String getName(){
        return name;
    }
    public String getPrice(){
        return price;
    }
    public String getDescribe(){
        return describe;
    }
    public String getTime(){
        return time;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public void setDescribe(String describe){
        this.describe = describe;
    }
    public void setTime(String time){
        this.time = time;
    }

}
