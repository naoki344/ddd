package tweet.app.service;

import tweet.app.datasource.TweetDataSource;
import tweet.lib.model.tweet.Tweet;

public class TweetQueryService {

	public Tweet find() {
		TweetDataSource tweet_datasource = TweetDataSource();
		return tweet_datasource.find();
	}

}
