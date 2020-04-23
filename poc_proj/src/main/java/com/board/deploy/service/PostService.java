package com.board.deploy.service;

import com.board.deploy.dto.PostSaveReqDTO;
import com.board.deploy.repository.PostRepository;
import com.board.deploy.vo.Post;
import org.hibernate.annotations.common.reflection.XMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Transactional
    public Long save(PostSaveReqDTO dto){
        return postRepository.save(dto.toEntity()).idx;
    }

    public Page<Post> findPostList(Pageable pageable) {
        pageable = PageRequest.of(
                pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1,
                pageable.getPageSize());
        return postRepository.findAll(pageable);
    }

    public Post findPostByIdx(Long idx) {
        return postRepository.findById(idx).orElse(new Post("","",""));
    }
}