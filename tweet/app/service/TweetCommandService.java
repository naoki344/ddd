package tweet.app.service;

import tweet.app.datasource.TweetDataSource;
import tweet.lib.model.tweet.Tweet;

public class TweetCommandService {
	public Tweet update() {
		TweetDataSource tweet_datasource = TweetDataSource();
		tweet_datasource.update();
	}
	public Tweet insert() {
		TweetDataSource tweet_datasource = TweetDataSource();
		tweet_datasource.insert();
	}
}
