package com.masai;

public class RecommendationService {
	private ContentService contentService;

	public RecommendationService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecommendationService(ContentService contentService) {
		super();
		this.contentService = contentService;
	}

	public ContentService getContentService() {
		return contentService;
	}

	public void setContentService(ContentService contentService) {
		this.contentService = contentService;
	}

}
