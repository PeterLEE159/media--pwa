package com.osstem.media.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osstem.media.comment.domain.CommentVO;
import com.osstem.media.comment.service.CommentService;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@PostMapping
	public void create(@RequestBody CommentVO vo) {
		this.service.create(vo);
	}
	
	@GetMapping("{videoId}")
	public List<CommentVO> findAllByVideoId(@PathVariable("videoId") int videoId) {
		return this.service.findAllByVideoId(videoId);
	}
	
	@GetMapping("comment/{upperId}")
	public List<CommentVO> findAllByUpperId(@PathVariable("upperId") int commentId) {
		return this.service.findAllByUpperId(commentId);
	}
}
