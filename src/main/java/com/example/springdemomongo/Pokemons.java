package com.example.springdemomongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//in MongoDB, a collection is a Table, and a document is an entry / a row in the table.
//@Data
@Document
public class Pokemon {
    @Id
    private String id; //in mongoDB, we can not have a document without an id. like in SQL.
    private String img;
    private String name;
    private List<String> type;
    private Stats stats;
    private Moves moves;

    public Pokemon(String img, String name) {
        this.img = img;
        this.name = name;
    }
}
