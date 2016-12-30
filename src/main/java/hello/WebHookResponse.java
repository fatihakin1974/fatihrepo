package hello;

public class WebHookResponse {
	/*	{
			"speech": "Barack Hussein Obama II is the 44th and current President of the United States.",
			"displayText": "Barack Hussein Obama II is the 44th and current President of the United States, and the first African American to hold the office. Born in Honolulu, Hawaii, Obama is a graduate of Columbia University   and Harvard Law School, where ",
			"data": {...},
			"contextOut": [...],
			"source": "DuckDuckGo"
			}*/

	private String	speech		= "Speech1";
	private String	displayText	= "displayText1";
	private String	source		= "source";
	public WebHookResponse(String speech, String displayText, String source) {
		this.setDisplayText(displayText);
		this.setSource(source);
		this.setSpeech(speech);
	}
	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
