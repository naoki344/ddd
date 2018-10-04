package tweet.lib.model.tweet;

import tweet.lib.model.tweet.Tweet;
import tweet.lib.model.tweet.TweetList;
import tweet.lib.model.tweet.TweetID;

abstract public class TweetRepository {
	abstract Tweet find(TweetID tweet_id);
	//first class collection
	//list? timeline??
	abstract TweetList find_all();
	abstract boolean register(Tweet tweet);
	abstract boolean delete(Tweet tweet);
	abstract boolean update(Tweet tweet);
}
