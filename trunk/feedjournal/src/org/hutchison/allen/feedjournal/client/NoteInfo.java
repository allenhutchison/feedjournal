package org.hutchison.allen.feedjournal.client;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class NoteInfo implements Serializable {

	private String noteText;
	private Date createdOn;
	private String owner;
	
	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}
	
	public String getNoteText() {
		return noteText;
	}
	
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
}
