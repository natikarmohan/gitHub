package com.bjs.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bjs.dev.Home;
import com.bjs.dev.Login;




public class OrangeTest {

	@Test //adding testng dependency to resolve this error
	public void unknowsMethod() {
		// TODO Auto-generated method stubs

		ChromeDriver d = new ChromeDriver();//adding selenium java dependency for this error nd @test error
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Login l = new Login(d);
            l.typeUsername();
            l.typePassword();
            l.clickSubmitButton();
            Home h = new Home(d);
            h.clickionc();
                        System.out.println("home");
	}

}
