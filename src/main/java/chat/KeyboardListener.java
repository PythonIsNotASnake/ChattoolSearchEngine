package chat;

import com.google.gson.JsonElement;
import model.SearchResult;
import retrofit2.Call;

import javax.swing.JTextArea;
import java.io.IOException;

public class KeyboardListener implements InputListener {

	private JTextArea textArea;
	private String nick;
	
	public KeyboardListener(JTextArea textArea, String nick) {
		this.textArea = textArea;
		this.nick = nick;
	}
	
	@Override
	public void inputReceived(String str) {
		ISearch service = Globals.getInstance().getRetrofit().create(ISearch.class);
		Call<SearchResult> call = service.getSearchResult(str);
		try {
			SearchResult chat = call.execute().body();
			textArea.append(chat.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}


		//textArea.append("<" + nick + "> " + str + System.getProperty("line.separator"));
	}

}
