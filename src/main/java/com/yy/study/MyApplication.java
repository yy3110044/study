package com.yy.study;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.show();
		stage.setTitle("我的javaFX标题");
		System.out.println("start");
	}

	@Override
	public void init() throws Exception {
		super.init();
		System.out.println("init");
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println("stop");
	}
}