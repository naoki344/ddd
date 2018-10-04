package tweet.lib.model.tweet;

public class AuthorID {
    private String value;

	AuthorID( String content ){
		this.value = content;
	}

    public String get_value () {
		return this.value;
    }
}
