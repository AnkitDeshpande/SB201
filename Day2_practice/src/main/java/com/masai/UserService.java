package com.masai;

public class UserService {
	private RecommendationService recommendationService;

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService(RecommendationService recommendationService) {
		super();
		this.recommendationService = recommendationService;
	}

	public RecommendationService getRecommendationService() {
		return recommendationService;
	}

	public void setRecommendationService(RecommendationService recommendationService) {
		this.recommendationService = recommendationService;
	}

	public void show() {
		System.out.println("Showing All the recommendation.");
	}
}
