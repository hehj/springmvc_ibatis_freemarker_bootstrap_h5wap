package com.itelephant.h5wap.entity;

public class Article {
	private Long id;
	private Long postAuthor;
	private String postKeywords;
	private String postTitle;
	private String postContent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostAuthor() {
		return postAuthor;
	}

	public void setPostAuthor(Long postAuthor) {
		this.postAuthor = postAuthor;
	}

	public String getPostKeywords() {
		return postKeywords;
	}

	public void setPostKeywords(String postKeywords) {
		this.postKeywords = postKeywords;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

}
