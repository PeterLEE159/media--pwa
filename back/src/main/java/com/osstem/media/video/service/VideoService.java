package com.osstem.media.video.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.osstem.media.video.domain.VideoVO;
import com.osstem.media.video.repo.VideoRepo;

@Service
public class VideoService {
	
	@Autowired
	private VideoRepo repo;
	
	public List<VideoVO> search(String queue, int pageNo, int size) {
		if(!"".equals(queue)) return this.repo.findByNameContaining(queue, PageRequest.of(pageNo, size));
		Page<VideoVO> page = this.repo.findAll(PageRequest.of(pageNo, size));
		return page.toList();
	}
}
