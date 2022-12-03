package com.example.progj.controller;

import com.example.progj.dto.BlogPostDto;
import com.example.progj.model.Article;
import com.example.progj.model.ArticleInPreview;
import com.example.progj.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainMenuController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/fullArticles")
    List<Article> allArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/main")
    List<ArticleInPreview> allPreviews() {
        return articleService.getAllArticlesPreviews();
    }

    @PostMapping("/editor")
    @ResponseBody
    void upload(@RequestBody BlogPostDto blogPostDto) {
        articleService.saveArticle(blogPostDto);
    }

    @GetMapping(value = "/articles/{id}")
    @ResponseBody
    public Optional<Article> getFoodsBySimplePathWithPathVariable(@PathVariable String id) {
        return articleService.getArticleById(id);
    }
}
