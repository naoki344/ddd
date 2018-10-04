package tweet.lib.model.tweet;

import tweet.lib.model.tweet.TweetID;
import tweet.lib.model.tweet.Content;
import tweet.lib.model.tweet.AuthorID;

public class Tweet {
    public TweetID tweet_id;
    public Content content;
    public AuthorID author_id;

	Tweet( TweetID tweet_id, Content content, AuthorID author_id ){
		this.tweet_id = tweet_id;
		this.content = content;
		this.author_id = author_id;
	}
	
	public HashMap<String, String> to_hash(){
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("tweet_id",this.tweet_id.get_value());
		hashmap.put("content",this.content.value);
		hashmap.put("author_id",this.author_id.value);
	}
}
