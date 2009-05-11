package org.hutchison.allen.feedjournal.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("note")
public interface NoteService extends RemoteService {
	public List<NoteInfo> getJournalNotes();
}
