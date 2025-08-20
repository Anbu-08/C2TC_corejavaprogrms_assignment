package com.tnsif.abstracteg;

public class TnsifcgDemo {

	public static void main(String[] args) {
		Trainer t=new TechTrainer();
		t.session();
		t.checks();
		t=new SoftTrainer();
		t.session();
		t.checks();

	}

}
