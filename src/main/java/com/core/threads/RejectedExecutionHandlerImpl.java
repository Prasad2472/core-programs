package com.core.threads;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable worker, ThreadPoolExecutor executor) {
		System.out.println(worker + " ------------------->is Rejected<--------------------------");
		System.out.println(worker + " ------------------->is Rejected<--------------------------"+executor.toString());
		System.out.println(worker + " ------------------->is Rejected<--------------------------"+executor);
//		System.out.println("Retrying to Execute");
//		try {
//			// Re-executing with alternateExecutor
//			RejectedExecutionHandlerExample.alternateExecutor.execute(worker);
//			System.out.println(worker.toString() + " Execution Started");
//		} catch (Exception e) {
//			System.out.println("Failure to Re-exicute " + e.getMessage());
//		}
	}

}