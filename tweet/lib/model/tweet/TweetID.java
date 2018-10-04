package tweet.lib.model.tweet;

public class TweetID {
    private String value;

	TweetID( String tweet_id ){
		this.value = tweet_id;
	}

    public String get_value () {
		return this.value;
    }
}
