package com.example.progj.dto;

import com.example.progj.model.PieceOfText;

import java.util.List;

public class BlogPostDto {
    private List<PieceOfText> text;
    public List<PieceOfText> getText() { return text; }
    public void setText(List<PieceOfText> text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "BlogPostDto{" +
                "text=" + text.toString() +
                '}';
    }
}
