package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private Long index = 0L;
    private List<Post> posts = new ArrayList<>() {{
        add(new Post(index++, "доброе утро страна", new Date()));
        add(new Post(index++, "корни", new Date()));
        add(new Post(index++, "lol", new Date()));
    }};
    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(index++, text, new Date()));
    }
}
