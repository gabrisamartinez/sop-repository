package com.work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Workflow {
	
	private final Pattern NUMBER_PATTERN = Pattern.compile("\\w(\\d+)");

	private String name;
	
	public Workflow(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getValue() {
		Matcher matcher = NUMBER_PATTERN.matcher(name);
		matcher.find();
		return Integer.valueOf(matcher.group(1));
	}
	
}
