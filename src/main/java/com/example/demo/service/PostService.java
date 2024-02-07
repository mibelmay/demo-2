package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("доброе утро страна", new Date()));
        posts.add(new Post("корни", new Date()));
        posts.add(new Post("lol", new Date()));
        return posts;
    }
}
