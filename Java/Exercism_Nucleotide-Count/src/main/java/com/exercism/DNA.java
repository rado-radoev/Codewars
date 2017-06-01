package com.exercism;

import java.util.HashMap;
import java.util.Map;

public class DNA {
	
	private String dna;														// argument that will contain DNA string
	Map<Character, Integer> dnaStrand = new HashMap<Character, Integer>();	// Map to contain Nucleotide occurances
	
	// Constructor accepting the DNA as a String
	public DNA(String dna) {
		this.dna = dna;
	}

	/**
	 * Iterate through DNA string and count the number of occurrances for each nucleotide
	 * @return	a HashMap<Characeter, Integer> containing the nucleotides as keys and the
	 * number of times each one occured in the DNA string
	 */
	public Map<Character, Integer> nucleotideCounts() {
		initializeDnaStrandDefaultValues();		// Zero out map before proceeding
		int currentValue;						// Variable to contain current nucleotide occurrences
		for (int i = 0; i < dna.length(); i++) {			
			if (dnaStrand.containsKey(dna.charAt(i))) {		// If that key already exists
				currentValue = dnaStrand.get(dna.charAt(i));	// Get the current occurances value
				dnaStrand.put(dna.charAt(i), ++currentValue);	// Increment it by 1
			} else {
				dnaStrand.put(dna.charAt(i), 1);		// If key does not exist, add to Map with value of 1
			}
		}
		return dnaStrand;
	}

	/**
	 * Count the number of Nucleotides in a DNA string
	 * @param c	the nucleotide to check for
	 * @return	how many times the nucleotide has occurred in the DNA String
	 * @throws IllegalArgumentException	if non existing nucleotide was parsed as parameter
	 */
	public int count(char c) throws IllegalArgumentException {
		if (nucleotideCounts().containsKey(c))
			return nucleotideCounts().get(c);
		else
			throw new IllegalArgumentException();
	}
	
	/**
	 * Helper method to zero out and initialize the map with default values
	 */
	private void initializeDnaStrandDefaultValues() {
		dnaStrand.clear();
		dnaStrand.put('A', 0);
		dnaStrand.put('C', 0);
		dnaStrand.put('G', 0);
		dnaStrand.put('T', 0);
	}
	
	
	public static void main (String[] args) {
		DNA dna = new DNA("GATTACA");
		dna.count('C');
	}

}
