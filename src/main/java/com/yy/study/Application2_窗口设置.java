package com.yy.study;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class Application2_窗口设置 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setOpacity(0.7);//设置窗口透明
		stage.setAlwaysOnTop(true);//设置窗口始终在最前面
		
		//设置窗口初始位置与长宽
		stage.setX(100);stage.setY(100);stage.setHeight(400);stage.setWidth(400);
		
		//监听X轴的变化
		stage.xProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("X坐标：" + newValue);
			}
		});
		
		stage.show();
	}
}