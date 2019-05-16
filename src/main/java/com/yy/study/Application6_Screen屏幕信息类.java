package com.yy.study;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Application6_Screen屏幕信息类 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		//获得主屏幕
		Screen s = Screen.getPrimary();
		System.out.println("dpi：" + s.getDpi());
		System.out.println("OutputScaleX：" + s.getOutputScaleX());
		System.out.println("OutputScaleY：" + s.getOutputScaleY());

		
		//获得屏幕范围
		Rectangle2D bounds = s.getBounds();
		System.out.println("X：" + bounds.getMinX() + " ~ " + bounds.getMaxX());
		System.out.println("Y：" + bounds.getMinY() + " ~ " + bounds.getMaxY());
		System.out.println("width：" + bounds.getWidth() + "，height：" + bounds.getHeight());
		
		//获得屏幕可视范围
		Rectangle2D visualBounds = s.getVisualBounds();
		System.out.println("X：" + visualBounds.getMinX() + " ~ " + visualBounds.getMaxX());
		System.out.println("Y：" + visualBounds.getMinY() + " ~ " + visualBounds.getMaxY());
		System.out.println("width：" + visualBounds.getWidth() + "，height：" + visualBounds.getHeight());
		Platform.exit();
	}
}