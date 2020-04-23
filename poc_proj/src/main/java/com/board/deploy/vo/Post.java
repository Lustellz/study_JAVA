package com.board.deploy.vo;

import com.board.deploy.enums.PostType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Post extends BaseTimeEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idx;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private PostType postType;

    @Column
    private String author;

    @OneToOne(fetch = FetchType.LAZY)
    private Member member;

    @Builder
    public Post(String title, String content, String author, Member member) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.member = member;
    }
}
