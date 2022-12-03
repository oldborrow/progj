package com.example.progj.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ArticleInPreview {
    private String title;
    private String preview_text;
    private Long id;

    public ArticleInPreview(String title, String preview_text, Long id) {
        this.title = title;
        this.preview_text = preview_text;
        this.id = id;
    }
}
