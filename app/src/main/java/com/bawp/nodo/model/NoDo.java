package com.bawp.nodo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
//CREATING IN ENTITY

//Annotation (only in java), allows us to connect certain meta data
// iintou our classes or instance variable
//@ define an annotation
//After annotation, the noDo class will be known as a table
@Entity(tableName = "nodo_table")
public class NoDo {

    //Annotating the ID s o it can be the Primary Key
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Annotating the noDo string so it can be one of the attribute name
    //@NonNull to make sure it doesn't take no null values
    @NonNull
    @ColumnInfo(name = "nodo_col")
    private String noDo;

    public NoDo(@NonNull String noDo) {
        this.noDo = noDo;
    }

    public String getNoDo() {
        return noDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNoDo(@NonNull String noDo) {
        this.noDo = noDo;
    }
}
