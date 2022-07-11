package checkdatetestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class CheckDateTest {

    WebDriver driver = null;

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app-package", "com.example.checkdate");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @Test
    public void TestCase1() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("12");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("12");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2022");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Valid Date!");
    }

    @Test
    public void TestCase2() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("32");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("12");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2022");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase3() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("31");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("6");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2022");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase4() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("15");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("13");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2022");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase5() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("13");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("-5");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2022");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase6() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("15");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("6");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("10000");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase7() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("15");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("6");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("999");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase8() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("29");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("02");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2020");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Valid Date!");
    }

    @Test
    public void TestCase9() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("29");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("02");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2022");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase10() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("abc");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("12");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2020");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase11() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("12");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2020");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase12() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("12");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("abc");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2020");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase13() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("12");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("2020");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase14() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("12");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("12");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("abc");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase15() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("12");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("12");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase16() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("abc");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("abc");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("abc");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @Test
    public void TestCase17() {
        WebElement reset = driver.findElement(By.id("com.example.checkdate:id/btnReset"));
        reset.click();
        WebElement day = driver.findElement(By.id("com.example.checkdate:id/txtDay"));
        day.sendKeys("");
        WebElement month = driver.findElement(By.id("com.example.checkdate:id/txtMonth"));
        month.sendKeys("");
        WebElement year = driver.findElement(By.id("com.example.checkdate:id/txtYear"));
        year.sendKeys("");
        WebElement btnCheck = driver.findElement(By.id("com.example.checkdate:id/btnCheck"));
        btnCheck.click();
        WebElement result = driver.findElement(By.id("com.example.checkdate:id/txtResult"));
        Assert.assertEquals(result.getText(), "Invalid Date!");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
