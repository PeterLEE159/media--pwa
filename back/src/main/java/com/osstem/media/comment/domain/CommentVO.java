package com.osstem.media.comment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="comment")
public class CommentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int videoId;
	private int upperId;
	private String comment;
}
