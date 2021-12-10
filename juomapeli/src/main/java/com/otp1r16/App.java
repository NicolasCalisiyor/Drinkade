package com.otp1r16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.otp1r16.HibernateUtil;

public class App {
    public static void main(String[] args) {
    	MenuScreen start = new MenuScreen();
    	start.launchScene(args);
    }
}
