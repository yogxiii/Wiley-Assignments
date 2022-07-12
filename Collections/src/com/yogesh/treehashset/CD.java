package com.yogesh.treehashset;

public class CD implements Comparable<CD>{
	private int cdId;
	private String cdName;
	private String cdAutherName;
	private int cdPlayTime;
	
	public CD() {
		super();
	}

	public CD(int cdId, String cdName, String cdAutherName, int cdPlayTime) {
		super();
		this.cdId = cdId;
		this.cdName = cdName;
		this.cdAutherName = cdAutherName;
		this.cdPlayTime = cdPlayTime;
	}

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getCdName() {
		return cdName;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public String getCdAutherName() {
		return cdAutherName;
	}

	public void setCdAutherName(String cdAutherName) {
		this.cdAutherName = cdAutherName;
	}

	public int getCdPlayTime() {
		return cdPlayTime;
	}

	public void setCdPlayTime(int cdPlayTime) {
		this.cdPlayTime = cdPlayTime;
	}

	@Override
	public String toString() {
		return "CD [cdId=" + cdId + ", cdName=" + cdName + ", cdAutherName=" + cdAutherName + ", cdPlayTime="
				+ cdPlayTime + "]";
	}

	@Override
	public int compareTo(CD o) {
		if(cdPlayTime > o.cdPlayTime)
			return 1;
		else if(cdPlayTime < o.cdPlayTime)
			return -1;
		else if(cdId == o.cdId && cdName.equals(o.cdName) && cdAutherName.equals(o.cdAutherName) && cdPlayTime == o.cdPlayTime)
		return 0;
		else 
			return -1;
	}
	
	
}
