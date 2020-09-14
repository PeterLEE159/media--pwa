package com.osstem.media.file.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class FileService {
	
	@Autowired
	private ApplicationContext appContext;
	
	private final Path dir;
	
	@Autowired
    public FileService(@Value("${file.path}") String path) {
		this.dir = Paths.get(path);
        try {
        	if(!Files.exists(this.dir)) {
        		Files.createDirectories(this.dir);
        	}
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
	
	public Resource load(String fileNm) {
		
		Path file = Paths.get(this.dir + "/" + fileNm);
		Resource resource = appContext.getResource("file:" + file.toAbsolutePath().toString());
        
		if(resource.exists()) return resource;
		
		return null;
	}
}
