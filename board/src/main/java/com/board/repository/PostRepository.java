package com.board.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.board.domain.MemberDTO;
import com.board.domain.Post;
import com.board.enums.PostType;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	
	public Page<Post> findByPostType(PostType type, Pageable pageable);
	public List<Post> findByAuthor(MemberDTO memberDTO);
	public Post findByIdx(Long idx);
}
