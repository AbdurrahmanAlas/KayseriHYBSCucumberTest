package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.PageHYBS;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_4_Stepdefinitions {

    PageHYBS pageHYBS=new PageHYBS();
    Actions actions=new Actions(Driver.getDriver());

    @Given("click on the inspect eye icon")
    public void click_on_the_inspect_eye_icon() {
        pageHYBS.incelegözsimgesi.click();
    }

    @Given("Company Name and Registration number must appear.")
    public void company_name_and_registration_number_must_appear() {


   Assert.assertTrue(pageHYBS.firmaAdıveSicilNoGeldimi.isDisplayed());


    }

    @Given("The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST buttons should be visible")
    public void the_company_s_balance_ats_document_extend_blacklıst_buttons_should_be_visible() {
        Assert.assertTrue(pageHYBS.ATSOnayBelgesiButton.isDisplayed());
        Assert.assertTrue(pageHYBS.karaListeyeAlbutton.isDisplayed());

    }
    @Given("The company's BALANCE, ATS DOCUMENT EXTEND, BLACKLIST and their functions should work properly when clicked.")
    public void the_company_s_balance_ats_document_extend_blacklıst_and_their_functions_should_work_properly_when_clicked() {

     pageHYBS.ATSOnayBelgesiButton.click();

     Assert.assertTrue(pageHYBS.ATSBelgesiUzatText.isDisplayed());
        ReusableMethods.wait(3);
     pageHYBS.ATSBelgesiUzatTextinUzerindekiCarpı.click();
        ReusableMethods.wait(3);
     pageHYBS.karaListeyeAlbutton.click();
        ReusableMethods.wait(3);
     Assert.assertTrue(pageHYBS.karalisteText.isDisplayed());
     pageHYBS.KaralisteTextIptalbutonu.click();




    }


    @Given("the user clicks on Company_Information,Company_Personnel,Company_Users,Company_Documents,Vehicles,Vehicle_Documents,Financial_Transactions,TIB,Balance_Movements,Call_List,Construction_Fill_List,Penalty_List,Complaint_List,CONTRACT link")
    public void the_user_clicks_on_company_ınformation_company_personnel_company_users_company_documents_vehicles_vehicle_documents_financial_transactions_tıb_balance_movements_call_list_construction_fill_list_penalty_list_complaint_list_contract_link() {

        pageHYBS.companyInformationLink.click();
        Assert.assertTrue(pageHYBS.companyInformationlinkTable.isDisplayed());
        pageHYBS.companyPersonnelLink.click();
        Assert.assertTrue(pageHYBS.companyPersonnelLinkTable.isDisplayed());
        pageHYBS.companyUsersLink.click();
        Assert.assertTrue(pageHYBS.companyUsersLinkTable.isDisplayed());
        pageHYBS.companyDocumentsLink.click();
        Assert.assertTrue(pageHYBS.companyDocumentsLinkTable.isDisplayed());
        pageHYBS.vehicleDocumentsLink.click();
        Assert.assertTrue(pageHYBS.vehicleDocumentsLinkTable.isDisplayed());
        pageHYBS.financialTransactionsLink.click();
        Assert.assertTrue(pageHYBS.financialTransactionsLinkTable.isDisplayed());
        pageHYBS.TIBLink.click();
        Assert.assertTrue(pageHYBS.TIBLinkTable.isDisplayed());
        pageHYBS.balanceMovementsLink.click();
        Assert.assertTrue(pageHYBS.balanceMovementsLinkTable.isDisplayed());
        pageHYBS.callListLink.click();
        Assert.assertTrue(pageHYBS.callListLinkTable.isDisplayed());
        pageHYBS.constructionFillListLink.click();
        Assert.assertTrue(pageHYBS.constructionFillListLinkTable.isDisplayed());
        pageHYBS.penaltyListLink.click();
        Assert.assertTrue(pageHYBS.penaltyListLinkTable.isDisplayed());
        pageHYBS.complaintListLink.click();
        Assert.assertTrue(pageHYBS.complaintListLinkTable.isDisplayed());

    }











}
