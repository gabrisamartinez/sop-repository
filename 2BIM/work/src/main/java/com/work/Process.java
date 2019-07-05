package com.work;

import java.util.List;

import com.google.common.collect.Lists;

public class Process {

	private String name;
	private Integer priority;
	private List<Workflow> list;
	
	public Process(String name, Integer priority, List<Workflow> list) {
		super();
		this.name = name;
		this.priority = priority;
		this.list = transformList(list);
	}
	
	private List<Workflow> transformList(List<Workflow> rawList) {
		List<Workflow> newList = Lists.newArrayList();
		
		int i;
		for(i = 0; i < rawList.size(); i++) {
			Workflow w = rawList.get(i);
			int times = w.getValue();
			int j;
			for (j = 0; j < times; j++) {
				newList.add(w);
			}
		}
		
		return newList;
	}

	public Integer getSize() {
		return list.size();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public List<Workflow> getList() {
		return list;
	}
	public void setList(List<Workflow> list) {
		this.list = list;
	}
	
}
