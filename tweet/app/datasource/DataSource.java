package tweet.app.datasource;

import java.util.HashMap;

public class DataSource {
	public int handler;
	DataSource(){
		this.handler = 1;
	}

	public boolean update(){
		return true;
	}

	public boolean insert(){
		return true;
	}

	public HashMap<String, String> find(){
		HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("tweet_id", "farkegliu5678");
        hashmap.put("content", "つぶやきました");
        hashmap.put("author_id", "agh79efrab78fa");

		return hashmap;
	}
}
