package com.nelioprofessorruim.workshop.mongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO authir;
	
	public CommentDTO() {
	}

	public CommentDTO(String text, Date date, AuthorDTO authir) {
		super();
		this.text = text;
		this.date = date;
		this.authir = authir;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthir() {
		return authir;
	}

	public void setAuthir(AuthorDTO authir) {
		this.authir = authir;
	}
	
}
