package com.wikimaps.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;

public class Graph extends Composite implements ClickHandler {

	protected Canvas canvas;
	protected Context2d context;

	public Graph() {
		canvas = Canvas.createIfSupported();

		if (canvas == null) {
			initWidget(new Label(
					"Your browser doesn't support the HTML5 Canvas"));
		} else {
			canvas.setWidth("100%");
			canvas.setHeight("100%");
			
			context = canvas.getContext2d();
			
			initWidget(canvas);
		}
	}

	@Override
	public void onClick(ClickEvent event) {
		event.getX();
	}

}
