package com.yy.study;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Application4_窗口模态 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Stage s1 = new Stage();
		s1.setTitle("s1");
		s1.show();
		
		Stage s2 = new Stage();
		s2.initOwner(s1);
		s2.setTitle("s2");
		s2.initStyle(StageStyle.UTILITY);
		s2.initModality(Modality.WINDOW_MODAL);//设置此窗口处理所有者的上层，只有关闭此窗口后，才能使用所有者窗口
		s2.show();
	}
	
	/*
	@Override
	public void start(Stage stage) throws Exception {
		Stage s1 = new Stage();
		s1.setTitle("s1");
		s1.show();
		
		Stage s2 = new Stage();
		s2.setTitle("s2");
		s2.show();
		
		
		
		Stage s3 = new Stage();
		s3.initModality(Modality.APPLICATION_MODAL); //处于所有窗口最顶层，只有关闭这个窗口后，才能使用其它窗口
		s3.setTitle("s3");
		s3.show();
	}
	*/
}
