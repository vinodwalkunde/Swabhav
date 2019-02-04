package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.composite.test.TestControl;

public class ControlGroup implements IControl{
	private String name;

	private List<IControl> nameList = new ArrayList<IControl>();
	public ControlGroup(String name) {
		this.name=name;
	}

	public String getTagName() {
		return name;
	}

	public List<IControl> getListOfTags() {
		return nameList;
	}
	public void addItem(IControl icontrol) {
		nameList.add(icontrol);
	}


	@Override
	public void displayDom() {
		System.out.println(TestControl.compositeBuilder+"   <"+name+">");
		TestControl.compositeBuilder.append("   ");
		for (IControl element:nameList) {
			element.displayDom();
		}
		System.out.println(TestControl.compositeBuilder+"</"+name+">");
		TestControl.compositeBuilder.setLength(TestControl.compositeBuilder.length() - 3);
	}

}
