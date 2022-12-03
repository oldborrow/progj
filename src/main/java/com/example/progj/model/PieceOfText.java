package com.example.progj.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PieceOfText {
    private String paragraph;
    private String format;

    @Override
    public String toString() {
        return "PieceOfText{" +
                "paragraph='" + paragraph + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
