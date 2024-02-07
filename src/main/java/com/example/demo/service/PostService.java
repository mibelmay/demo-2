package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>() {{
        add(new Post("доброе утро страна", new Date()));
        add(new Post("корни", new Date()));
        add(new Post("lol", new Date()));
    }};
    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
