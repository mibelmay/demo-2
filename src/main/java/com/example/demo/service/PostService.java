package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("доброе утро страна"));
        posts.add(new Post("корни"));
        posts.add(new Post("lol"));
        return posts;
    }
}
