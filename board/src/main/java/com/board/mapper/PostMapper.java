package com.board.mapper;

import java.util.List;

import com.board.domain.Post;

public interface PostMapper {
	public void postInsert(Post post)throws Exception;
	
	public List<Post>postList()throws Exception;
	
	public Post postView(int idx)throws Exception;
	
	public void hitPlus(int idx)throws Exception;
	
	public void postUpdate(Post postvo)throws Exception;
	
	public void postDelete(int idx)throws Exception;
	
	public List<Post>postReadT(String title)throws Exception;
	
	public List<Post>postReadA(String author)throws Exception;
}
