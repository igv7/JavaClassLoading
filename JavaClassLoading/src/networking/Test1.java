package networking;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		String url = "https://jsonplaceholder.typicode.com/posts/1";
		NetworkUtils.getRequest(url);
		System.out.println("***********************************");
		NetworkUtils.getBooksRequestFromGoogle("https://www.googleapis.com/books/v1/volumes?q=", "mario+livio");
	}

}