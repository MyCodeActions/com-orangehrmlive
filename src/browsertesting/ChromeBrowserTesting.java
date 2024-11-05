package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Forgot your password?’ link.
 * 7. Print the current URL.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email in the email field.
 * 11. Enter the password in the password field.
 * 12. Click on the Login Button.
 * 13. Close the browser
 * <p data-v-7b563373="" data-v-0af708be="" class="oxd-text oxd-text--p orangehrm-login-forgot-header">Forgot your password? </p>
 */
public class ChromeBrowserTesting {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // 1. Launch the chrome browswer
        WebDriver driver = new ChromeDriver();

        // 2. open url
        driver.get(baseUrl);


        // 3.Print title of the page
        System.out.println("The title of page is : " + driver.getTitle());

        // 4.Get current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 5.Get page source code
        System.out.println("The page source is below: \n" + driver.getPageSource());

        // 6. Click on the ‘Forgot your password?’ link.
        // driver.findElement(By.linkText("Forgot your password? ")).click();
        //   driver.findElement(By.className("orangehrm-login-forgot")).click();
        //   driver.findElement(By.linkText("Forgot your password?")).click();
        //  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
        //   driver.findElement(By.className("orangehrm-login-forgot-header")).click();
        //  driver.findElement(By.className("orangehrm-login-forgot")).click();
        // driver.findElement(By.className("oxd-text oxd-text--p orangehrm-login-forgot-header")).click();
        // driver.findElement(By.className("oxd-text")).click();
        // driver.findElement(By.xpath("//p[text()='Forgot your password?'])")).click();
        //  driver.find_element(By.XPATH, "//p[text()='Forgot your password?']").text
        //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p
        //   driver.findElement(By.className("oxd-text")).click();



//        /html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p
//
//        //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p
//      <p data-v-7b563373="" data-v-0af708be="" class="oxd-text oxd-text--p orangehrm-login-forgot-header">Forgot your password? </p>
       //p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']


//           WebElement forgotPasswordElement = driver.findElement(By.linkText("Forgot your password?"));
//          forgotPasswordElement.click();


 //  <p data-v-7b563373="" data-v-0af708be="" class="oxd-text oxd-text--p orangehrm-login-forgot-header">Forgot your password? </p>




    }
}