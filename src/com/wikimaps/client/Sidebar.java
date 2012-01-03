package com.wikimaps.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.Widget;

public class Sidebar extends Composite implements HasVisibility {

	private static SidebarUiBinder uiBinder = GWT.create(SidebarUiBinder.class);

	interface SidebarUiBinder extends UiBinder<Widget, Sidebar> {
	}

	public Sidebar() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
