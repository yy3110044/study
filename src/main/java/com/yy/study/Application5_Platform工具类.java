package com.yy.study;

import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Application5_Platform工具类 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("runLater前：" + Thread.currentThread().getName());

		//runLater里的Runnable将会在方法最后执行，可以用这个做一些轻量级的资源、组件更新操作
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				System.out.println("runLater：" + Thread.currentThread().getName());
			}
		});

		System.out.println("runLater后：" + Thread.currentThread().getName());
		
		//设为false时，点击窗口关闭按钮，程序不会退出(需要调用Platform.exit()来退出)
		Platform.setImplicitExit(false);
		//调用这个将退出程序
		//Platform.exit();

		stage.show();
		
		//Platform.isSupported()用于判断平台是否支持各种功能
		System.out.println(Platform.isSupported(ConditionalFeature.SCENE3D));
	}
}