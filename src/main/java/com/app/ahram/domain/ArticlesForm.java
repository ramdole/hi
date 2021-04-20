package com.app.ahram.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class ArticlesForm {
    private String title;
    private String contents;

    public Article toEntity() {
        return new Article(null, this.title, this.contents);
    }
}
