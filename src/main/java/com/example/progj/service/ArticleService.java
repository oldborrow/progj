package com.example.progj.service;

import com.example.progj.dto.BlogPostDto;
import com.example.progj.model.Article;
import com.example.progj.model.ArticleInPreview;
import com.example.progj.model.PieceOfText;
import com.example.progj.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public List<ArticleInPreview> getAllArticlesPreviews() {
        List<Article> articles = articleRepository.findAll();
        List<ArticleInPreview> list = new ArrayList<>();
        for (Article article : articles) {
            list.add(new ArticleInPreview(article.getTitle(), article.getPreview_text(), article.getId()));
        }
        return list;
    };

    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    public void saveArticle(BlogPostDto blogPostDto) {
        List<PieceOfText> list = blogPostDto.getText();
        StringBuilder builder = new StringBuilder();
        String title = null;
        String preview = null;
        for (int i = 0; i < list.size(); i++) {
            String paragraph = null;
            if (list.get(i).getFormat().equals("header-one")) {
                title = list.get(i).getParagraph();
                continue;
            }
            if (list.get(i).getFormat().equals("header-two")) {
                preview = list.get(i).getParagraph();
                continue;
            }
            if (list.get(i).getFormat().equals("header-three")) {
                paragraph = "<h3>" + list.get(i).getParagraph() + "</h3>\n";
            }
            if (list.get(i).getFormat().equals("header-four")) {
                paragraph = "<h4>" + list.get(i).getParagraph() + "</h4>\n";
            }
            if (list.get(i).getFormat().equals("header-five")) {
                paragraph = "<h5>" + list.get(i).getParagraph() + "</h5>\n";
            }
            if (list.get(i).getFormat().equals("header-six")) {
                paragraph = "<h6>" + list.get(i).getParagraph() + "</h6>\n";
            }
            builder.append(paragraph);
        }
        Article article = new Article(title, builder.toString(), preview, 1L);
        articleRepository.save(article);
    }

    public Optional<Article> getArticleById(String id) {
        return articleRepository.findById(Long.valueOf(id));
    }
}
