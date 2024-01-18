package com.crnts.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

@Override
    public void sessionCreated(HttpSessionEvent se) {
	// TODO Auto-generated method stub
	   System.out.println("session started");
    }

     @Override
    	public void sessionDestroyed(HttpSessionEvent se) {
    		// TODO Auto-generated method stub
    		System.out.println("session ended");
    	}
}
