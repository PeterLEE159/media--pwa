package com.osstem.media.video.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="video")
public class VideoVO {
	@Id
	private int id;
	
	private String uriPath;
	private String uriFilename;
	private String thumbFilename;
	private String name;
	private Date regDt;
	private Date modDt;
	private String regNm;
	private String modNm;
	private Long visitCount;
}
