package com.masai.model;

import java.util.ArrayList;
import java.util.List;

public class Tweet {
	private String tweetId;
	private String userId;
	private String content;
	private List<String> likedUserIds = new ArrayList<>();
	private List<String> retweetedUserIds = new ArrayList<>();

	public Tweet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tweet(String tweetId, String userId, String content, List<String> likedUserIds,
			List<String> retweetedUserIds) {
		super();
		this.tweetId = tweetId;
		this.userId = userId;
		this.content = content;
		this.likedUserIds = likedUserIds;
		this.retweetedUserIds = retweetedUserIds;
	}

	public Tweet(String tweetId, String userId, String content) {
		super();
		this.tweetId = tweetId;
		this.userId = userId;
		this.content = content;
	}

	public String getTweetId() {
		return tweetId;
	}

	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getLikedUserIds() {
		return likedUserIds;
	}

	public void setLikedUserIds(List<String> likedUserIds) {
		this.likedUserIds = likedUserIds;
	}

	public List<String> getRetweetedUserIds() {
		return retweetedUserIds;
	}

	public void setRetweetedUserIds(List<String> retweetedUserIds) {
		this.retweetedUserIds = retweetedUserIds;
	}

	@Override
	public String toString() {
		return "Tweet [tweetId=" + tweetId + ", userId=" + userId + ", content=" + content + ", likedUserIds="
				+ likedUserIds + ", retweetedUserIds=" + retweetedUserIds + "]";
	}

}
