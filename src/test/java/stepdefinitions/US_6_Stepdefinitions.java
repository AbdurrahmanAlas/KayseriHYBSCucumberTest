package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.PageHYBS;
import utilities.ReusableMethods;

public class US_6_Stepdefinitions {
    PageHYBS pageHYBS=new PageHYBS();

    @Given("User should be able to click on VEHICLE LIST")
    public void user_should_be_able_to_click_on_vehıcle_lıst() {

        pageHYBS.araclistesiLİNK.click();
        ReusableMethods.wait(3);

    }
    @Given("Test whether the checkbox has status or not.")
    public void test_whether_the_checkbox_has_status_or_not() {

        try {

            // Checkbox'ın mevcut olduğunu ve görünür olduğunu doğrula
            Assert.assertTrue("Checkbox is not visible.", pageHYBS.araclistesindekiTASIMACHECKBOXU.isDisplayed());

            // Checkbox seçili değilse, ona tıkla
            if (!pageHYBS.araclistesindekiTASIMACHECKBOXU.isSelected()) {
                pageHYBS.araclistesindekiTASIMACHECKBOXU.click();
            }

            // Checkbox'ın seçili olduğunu doğrula
            Assert.assertTrue("Checkbox is not selected.", pageHYBS.araclistesindekiTASIMACHECKBOXU.isSelected());

            System.out.println("Checkbox test passed successfully.");
        } catch (Exception e) {
            // Element bulunamazsa veya diğer bir hata olursa
            System.out.println("Checkbox test failed: " + e.getMessage());
            e.printStackTrace();

        }


    }

}
