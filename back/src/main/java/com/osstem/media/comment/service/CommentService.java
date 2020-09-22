package com.osstem.media.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osstem.media.comment.domain.CommentVO;
import com.osstem.media.comment.repo.CommentRepo;

@Service
public class CommentService {

	@Autowired
	CommentRepo repo;

	public void create(CommentVO vo) {
		this.repo.save(vo);
	}

	public List<CommentVO> findAllByVideoId(int videoId) {
		return this.repo.findAllByVideoId(videoId);
	}

	public List<CommentVO> findAllByUpperId(int commentId) {
		return this.repo.findAllByUpperId(commentId);
	}
	
	
}
