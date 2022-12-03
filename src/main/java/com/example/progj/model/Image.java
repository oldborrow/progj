package com.example.progj.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "images")
public class Image {
    public Image(Long imageId, String imageTitle, LocalDate uploadDate, String extension, String downloadLink) {
        this.imageId = imageId;
        this.imageTitle = imageTitle;
        this.uploadDate = uploadDate;
        this.extension = extension;
        this.downloadLink = downloadLink;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long imageId;

    private String imageTitle;

    @Column(nullable = false, updatable = false)
    private LocalDate uploadDate;

    private String extension;

    private String downloadLink;
}
