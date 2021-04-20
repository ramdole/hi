package com.app.ahram.controller;

import com.app.ahram.domain.Article;
import com.app.ahram.domain.ArticlesForm;
import com.app.ahram.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ArticlesController {

    private final ArticleRepository articleRepository;

    @GetMapping("/article")
    public String articleForm() {
        return "articles/articles";
    }

    @PostMapping("/article/create")
    public String article(ArticlesForm articlesForm, Model model) {
        model.addAttribute("title", articlesForm.getTitle());
        model.addAttribute("contents", articlesForm.getContents());
        Article article = articlesForm.toEntity();
        log.info("aritcle : {}", article.toString());

        Article saved = articleRepository.save(article);
        log.info("saved : {}", saved);

        return "articles/articles_create";
    }

}
