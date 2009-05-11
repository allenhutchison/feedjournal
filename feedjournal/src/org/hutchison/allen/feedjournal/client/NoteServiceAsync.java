package org.hutchison.allen.feedjournal.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface NoteServiceAsync {
	public void getJournalNotes(AsyncCallback<NoteInfo> async);
}
