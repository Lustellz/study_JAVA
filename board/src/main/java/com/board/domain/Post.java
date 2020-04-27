package com.board.domain;

import com.board.enums.PostType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@NoArgsConstructor
@Entity
@Table
public class Post extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String content;

    @Column(name="post_type")
    @Enumerated(EnumType.STRING)
    private PostType postType;

    @Column
    private MemberEntity author;

    @Builder
    public Post(String title, String content, PostType postType, MemberEntity member) {
        this.title = title;
        this.content = content;
        this.postType = postType;
        this.author = member;
    }
}
