package com.board.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.board.domain.Post;
import com.board.enums.PostType;

public interface IPostService {
	 Page<Post> findPostList(Pageable pageable);
	 Post findPostByIdx(Long idx);
	 Page<Post> findPostByType(PostType type, Pageable pageable);
}
