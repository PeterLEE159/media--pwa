package com.osstem.media.comment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osstem.media.comment.domain.CommentVO;

@Repository
public interface CommentRepo extends JpaRepository<CommentVO, Integer> {

	List<CommentVO> findAllByVideoId(int videoId);

	List<CommentVO> findAllByUpperId(int commentId);
}
