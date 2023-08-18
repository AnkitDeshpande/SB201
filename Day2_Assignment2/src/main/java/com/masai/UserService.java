package com.masai;

public class UserService {
	private RecommendationService RecommendationService;

	public RecommendationService getRecommendationService() {
		return RecommendationService;
	}

	public void setRecommendationService(RecommendationService recommendationService) {
		RecommendationService = recommendationService;
	}

	public void login(String string) {
		System.out.println("Logged in successful, Welcome " + string);
	}
}
