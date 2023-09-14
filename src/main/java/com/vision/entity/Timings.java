package com.vision.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Timings {
	@Id
	private int timingId;
	private String timingName;
	public int getTimingId() {
		return timingId;
	}
	public void setTimingId(int timingId) {
		this.timingId = timingId;
	}
	public String getTimingName() {
		return timingName;
	}
	public void setTimingName(String timingName) {
		this.timingName = timingName;
	}
	@Override
	public String toString() {
		return "Timings [timingId=" + timingId + ", timingName=" + timingName + "]";
	}
	
	

}
