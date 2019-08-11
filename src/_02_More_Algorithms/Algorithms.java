package _02_More_Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int amount = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				amount++;
			}
		}
		return amount;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest  = 0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longest = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> message) {
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		boolean sorted = false;
		
		while(sorted == false) {
			sorted = true;
			for(int i = 1; i < results.size(); i++) {
				if(results.get(i) < results.get(i-1)) {
					double swap = results.get(i-1);
					results.set(i-1, results.get(i));
					results.set(i, swap);
					sorted = false;
				}
			}
		}
		
		return results;
	}
	
	public static List<String> sortDNA(List<String> sequence){
		boolean sorted = false;
		
		while(sorted == false) {
			sorted = true;
			for(int i = 1; i < sequence.size(); i++) {
				if(sequence.get(i).length() < sequence.get(i-1).length()) {
					String swap = sequence.get(i);
					sequence.set(i, sequence.get(i-1));
					sequence.set(i-1, swap);
					sorted = false;
				}
			}
		}
		
		return sequence;
	}
	
	public static List<String> sortWords(List<String> words) {
		boolean sorted = false;
		
		while(sorted == false) {
			sorted = true;
			for(int i = 1; i < words.size(); i++) {
				if(words.get(i).compareTo(words.get(i-1)) < 0) {
					String swap = words.get(i);
					words.set(i, words.get(i-1));
					words.set(i-1, swap);
					sorted = false;
				}
			}
		}
		
		return words;
	}
}
