package com.magfine.mockserver.DTO;

public enum statusType
{

	processing("任务正在处理中"),suspended(" 任务暂停"),done(" 任务已完成 "),failed("任务已失败");

	private final String taskStatus;

	private statusType(String taskStatus){
		this.taskStatus = taskStatus;
	}

	private String getTaskStatus(){
		return this.taskStatus;
	}

	@Override
	public String toString(){
		return this.getTaskStatus();
	}

	public static void main(String[] args) {
		statusType s = statusType.processing;
		System.out.print(s.getTaskStatus());

	}
}
