package com.work;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Lists;

public class App {
	
    public static void main(String[] args) {
    	sjf();
    	rbs();
    	priority();
    	priorityAndTime();
    }
    
    private static void sjf() {
    	System.out.println("SJF:");
    	List<Process> process = getProcessList();
    	
    	Collections.sort(process, new Comparator<Process>() {
			@Override
			public int compare(Process a, Process b) {
				return a.getSize().compareTo(b.getSize());
			}
		});
    	
    	String formatter = "%s - %s clocks";
    	for (Process p : process) {
    		System.out.println(String.format(formatter, p.getName(), p.getSize()));
    	}
    }
    
    private static void rbs() {
    	System.out.println("\nRound Robin:");
    	
    	List<Process> process = getProcessList();
    	int clock = 1;
    	while(true) {
    		int i;
    		for(i = 0; i < process.size(); i++) {
    			Process p = process.get(i);
    			if (!p.getList().isEmpty()) {
    				Workflow w = p.getList().remove(0);
    				String formatter = "Clock: %s - %s - %s";    				
    				System.out.println(String.format(formatter, clock, p.getName(), w.getName(), p.getSize()));    				
    				clock++;
    			}
    		}
    		System.out.println("");
    		
    		if (process.get(0).getSize() == 0 &&
				process.get(1).getSize() == 0 &&
				process.get(2).getSize() == 0 &&
				process.get(3).getSize() == 0) {
    			break;
    		}
    	}
    }
    
    private static void priority() {
    	System.out.println("\nPriority:");
    	List<Process> process = getProcessList();
    	
    	Collections.sort(process, new Comparator<Process>() {
			@Override
			public int compare(Process a, Process b) {
				return a.getPriority().compareTo(b.getPriority());
			}
		});
    	
    	String formatter = "%s - %s clocks";
    	for (Process p : process) {
    		System.out.println(String.format(formatter, p.getName(), p.getSize()));
    	}
    }
    
    private static void priorityAndTime() {
    	System.out.println("\nPriority and time:");
    	List<Process> process = getProcessList();
    	
    	Collections.sort(process, new Comparator<Process>() {
			@Override
			public int compare(Process a, Process b) {
				int byPriority = a.getPriority().compareTo(b.getPriority());
				int byTime = a.getSize().compareTo(b.getSize());
				return byPriority != 0 ? byPriority : byTime;
			}
		});
    	
    	String formatter = "%s - %s clocks";
    	for (Process p : process) {
    		System.out.println(String.format(formatter, p.getName(), p.getSize()));
    	}
    }

	private static List<Process> getProcessList() {
    	return Lists.newArrayList(
    	        new Process("P1", 2, Lists.newArrayList(new Workflow("C10"), new Workflow("E5"), new Workflow("C4"))),
    	        new Process("P2", 1, Lists.newArrayList(new Workflow("C2"), new Workflow("E10"), new Workflow("C1"))),
    	        new Process("P3", 2, Lists.newArrayList(new Workflow("C16"), new Workflow("E1"), new Workflow("C10"))),
    	        new Process("P4", 0, Lists.newArrayList(new Workflow("C4"), new Workflow("E1"), new Workflow("C1"), new Workflow("E1"), new Workflow("C1"))));
    }
    
}
