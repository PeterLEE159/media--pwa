package com.osstem.media.video;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osstem.media.video.domain.VideoVO;
import com.osstem.media.video.service.VideoService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/video")
public class VideoController {
	
	@Autowired
	VideoService service;
	
	@GetMapping()
	public List<VideoVO> search(@RequestParam(defaultValue = "") String queue, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
		return this.service.search(queue, page, size);
	}	
	
	
//	@PostMapping()
//	public VideoVO upload(@RequestBody) {
//		
//	}
}
