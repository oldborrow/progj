package com.example.progj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String preview_text;
    private String content;
    private Long author_id;

    public Article(String title, String content, String preview_text, Long authorId) {
        this.title = title;
        this.content = content;
        this.preview_text = preview_text;
        this.author_id = authorId;
    }

    public Article() {

    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", preview_text='" + preview_text + '\'' +
                ", content='" + content + '\'' +
                ", author_id=" + author_id +
                '}';
    }
}
