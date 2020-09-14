package com.osstem.media.video.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osstem.media.video.domain.VideoVO;

@Repository
public interface VideoRepo extends JpaRepository<VideoVO, Integer> {

	public List<VideoVO> findByNameContaining(String queue, Pageable page);
}
