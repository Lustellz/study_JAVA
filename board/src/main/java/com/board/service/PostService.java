package com.board.service;

import com.board.domain.Post;
import com.board.enums.PostType;
import com.board.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service // 서비스로 사용될 컴포넌트 정의
public class PostService implements IPostService{
    // service -> repository -> db
	@Autowired
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Page<Post> findPostList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize());
        // pageble로 넘어온 pageNumber 객체가 0이하 일 때 0으로 초기화, 기본 페이지 크기인 10으로 새로운 PageRequest 객체를 만들어 페이징 처리된 게시글 리스트 반환
        return postRepository.findAll(pageable);
    }

    @Override
    public Post findPostByIdx(Long idx) {
        return postRepository.findByIdx(idx); // board의 idx값을 사용하여 board객체를 반환
    }

	@Override
	public Page<Post> findPostByType(PostType type, Pageable pageable) {
		// TODO Auto-generated method stub
		return postRepository.findByPostType(type, pageable);
	}

}