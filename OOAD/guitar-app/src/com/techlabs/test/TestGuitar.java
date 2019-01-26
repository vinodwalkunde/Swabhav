package com.techlabs.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;
import com.techlabs.repository.Guitar;
import com.techlabs.repository.GuitarSpec;
import com.techlabs.service.Inventory;

public class TestGuitar {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addGuitar("A12", 10000, Builder.FENDER, "ABC", Type.ACOUSTIC, Wood.ALDER, Wood.BASSWOOD, 12);
		inventory.addGuitar("A13", 403450, Builder.GIBSON, "DEF", Type.ELECTRIC, Wood.BASSWOOD, Wood.ALDER, 11);
		inventory.addGuitar("A14", 50000, Builder.MARTIN, "ABC", Type.ACOUSTIC, Wood.MAPLE, Wood.MAPLE, 12);
		inventory.addGuitar("A15", 10300, Builder.FENDER, "DEF", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 13);

		System.out.println(inventory.getGuitars());
		GuitarSpec spec1 = new GuitarSpec(Builder.MARTIN, "ABC", Type.ACOUSTIC, Wood.MAPLE, Wood.MAPLE, 12);

		List<Guitar> matchingGuitars = inventory.search(spec1);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n     " + spec.getBackWood() + " back and sides,\n     " + spec.getTopWood()
						+ " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

}
