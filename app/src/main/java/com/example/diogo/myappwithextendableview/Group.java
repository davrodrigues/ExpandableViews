package com.example.diogo.myappwithextendableview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diogo on 30-06-2016.
 */

public class Group {

    public String string;
    public final List<String> children = new ArrayList<String>();

    public Group(String string) {
        this.string = string;
    }

}