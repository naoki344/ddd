package tweet.app.datasource;

import java.util.HashMap;

import app.datasource.DataSource;
import tweet.lib.model.tweet.Tweet;
import tweet.lib.model.tweet.TweetID;
import tweet.lib.model.tweet.Title;
import tweet.lib.model.tweet.Content;
import tweet.lib.model.tweet.AuthorID;
import tweet.lib.model.tweet.TweetRepository;

public class TweetDataSource extends TweetRepository{
//public class TweetDataSource {
	public DataSource datasource;
	TweetDataSource(){
		this.datasource = DataSource();
	}

	public Tweet find(TweetID tweet_id) {
		HashMap<String, String> tweet_dict = this.datasource.find();
		return Tweet(
					TweetID(tweet_dict.get("tweet_id")),
					Content(tweet_dict("content")),
					AuthorID(tweet_dict("author_id"))
				);
	}

	public Tweet[] find_all() {
		//hashmapはそのまま使わない
		HashMap<String, String> tweet_dict = this.datasource.find();
		Tweet tweet = Tweet(
					TweetID(tweet_dict.get("tweet_id")),
					Content(tweet_dict("content")),
					AuthorID(tweet_dict("author_id"))
				);
		Tweet tweet_list[];
		tweet_list[0] = tweet;
		tweet_list[1] = tweet;
		tweet_list[2] = tweet;
		tweet_list[3] = tweet;

		return tweet_list;

	}

	public boolean register(Tweet tweet) {
		return true
	}

	public boolean update(Tweet tweet) {
		return true
	}
}
