import tweet.app.service.TweetQueryService;

public class TweetInterface {
    public static void main (String[] args) {
		TweetQueryService tweet_query_service = TweetQueryService();
		tweet_query_service.find();

    }
}
