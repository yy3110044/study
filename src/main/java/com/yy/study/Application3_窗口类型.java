package com.yy.study;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Application3_窗口类型 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Stage s1 = new Stage();
		s1.setTitle("s1");
		s1.initStyle(StageStyle.DECORATED);//默认窗口类型
		s1.show();
		
		Stage s2 = new Stage();
		s2.setTitle("s2");
		s2.initStyle(StageStyle.TRANSPARENT);//透明窗口
		s2.show();
		
		Stage s3 = new Stage();
		s3.setTitle("s3");
		s3.initStyle(StageStyle.UNDECORATED);//跟s2差不多
		s3.show();
		
		Stage s4 = new Stage();
		s4.setTitle("s4");
		s4.initStyle(StageStyle.UNIFIED); //不带标题栏的窗口
		s4.show();
		
		Stage s5 = new Stage();
		s5.setTitle("s5");
		s5.initStyle(StageStyle.UTILITY); //没有最小化和最大化的窗口
		s5.show();
		
		Thread.sleep(2000);
		Platform.exit();//退出所有窗口(退出虚拟机)
	}
}
