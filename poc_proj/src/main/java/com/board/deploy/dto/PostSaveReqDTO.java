package com.board.deploy.dto;

import com.board.deploy.enums.PostType;
import com.board.deploy.vo.Post;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostSaveReqDTO {

    private String title;
    private String content;
    private String author;
    private PostType postType;
    private LocalDateTime createdDate;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
