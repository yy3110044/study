package com.yy.study;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MyApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("我的javaFX标题"); //设置标题
		
		ObservableList<Image> list = stage.getIcons();
		list.add(new Image("/resource/javafx.png"));//设置标题栏图标
		
		//stage.setIconified(true); //设置窗口最小化
		
		//stage.setMaximized(true); //设置窗口最大化
		
		//stage.close();//关闭窗口（与show相对应）
		
		stage.setWidth(500);stage.setHeight(500); //设置窗口大小
		//stage.setResizable(false);//设置窗口大小不可改变
		//stage.setMaxWidth(800);stage.setMaxHeight(800);//设置窗口最大大小
		stage.setMinWidth(300);stage.setMinHeight(300);//设置窗口最小大小
		
		//监听窗口高度变化
		stage.heightProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
			}
		});
		
		stage.setFullScreen(true);stage.setScene(new Scene(new Group())); //这两句设置全屏
		
		stage.show();//显示窗口(与close相对应)
		p("start：" + Thread.currentThread().getName());
		
	}

	@Override
	public void init() throws Exception {
		super.init();
		System.out.println("init：" + Thread.currentThread().getName());
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println("stop：" + Thread.currentThread().getName());
	}
	
	private void p(Object o) {
		System.out.println(o);
	}
}