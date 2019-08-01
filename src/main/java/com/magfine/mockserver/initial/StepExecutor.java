package com.magfine.mockserver.initial;

import org.springframework.stereotype.Component;

@Component
public class StepExecutor implements Runnable{
	@Override
	public void run() {
		startStreamTask();

	}

	public void startStreamTask() {
		try {
			Runtime.getRuntime().exec("open  http://localhost:8080/");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
