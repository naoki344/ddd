package tweet.lib.model.tweet;

public class Content {
    private String value;

	Content( String content ){
		this.value = content;
	}

    public String get_value () {
		return this.value;
    }
}
