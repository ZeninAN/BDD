package test;

import data.DataHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @BeforeEach
    public void setUp(){
        open("http://localhost:9999");
    }


    @Test
    public void shouldTransferFromSecondToFirstValidAmount(){
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage =  loginPage.validLogin(authInfo);
        var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(verifyInfo);
        var firstCardInfo = DataHelper.getFirstCardInfo();
        var secondCardInfo = DataHelper.getSecondCardInfo();
        int amount = 222;
        var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
        var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
        var transferPage = dashboardPage.cardToTransfer(secondCardInfo);
        dashboardPage = transferPage.makeTransfer(firstCardInfo, String.valueOf(amount));
        var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
        var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
        assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
        assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }

    @Test
    public void shouldTransferFromSecondToFirstValidAmount2(){
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage =  loginPage.validLogin(authInfo);
        var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(verifyInfo);
        var firstCardInfo = DataHelper.getFirstCardInfo();
        var secondCardInfo = DataHelper.getSecondCardInfo();
        int amount = 10000;
        var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
        var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
        var transferPage = dashboardPage.cardToTransfer(secondCardInfo);
        dashboardPage = transferPage.makeTransfer(firstCardInfo, String.valueOf(amount));
        var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
        var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
        assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
        assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }
    @Test
    public void shouldTransferFromSecondToFirstValidAmount3(){
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage =  loginPage.validLogin(authInfo);
        var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(verifyInfo);
        var firstCardInfo = DataHelper.getFirstCardInfo();
        var secondCardInfo = DataHelper.getSecondCardInfo();
        int amount = 0;
        var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
        var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
        var transferPage = dashboardPage.cardToTransfer(secondCardInfo);
        dashboardPage = transferPage.makeTransfer(firstCardInfo, String.valueOf(amount));
        var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
        var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
        assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
        assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }
    @Test
    public void shouldTransferFromSecondToFirstValidAmount4(){
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage =  loginPage.validLogin(authInfo);
        var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(verifyInfo);
        var firstCardInfo = DataHelper.getFirstCardInfo();
        var secondCardInfo = DataHelper.getSecondCardInfo();
        int amount = 1;
        var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
        var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
        var transferPage = dashboardPage.cardToTransfer(secondCardInfo);
        dashboardPage = transferPage.makeTransfer(firstCardInfo, String.valueOf(amount));
        var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
        var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
        assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
        assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }
    @Test
    public void shouldTransferFromSecondToFirstValidAmount5(){
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage =  loginPage.validLogin(authInfo);
        var verifyInfo = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(verifyInfo);
        var firstCardInfo = DataHelper.getFirstCardInfo();
        var secondCardInfo = DataHelper.getSecondCardInfo();
        int amount = 9999;
        var expectedBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo) - amount;
        var expectedBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo) + amount;
        var transferPage = dashboardPage.cardToTransfer(secondCardInfo);
        dashboardPage = transferPage.makeTransfer(firstCardInfo, String.valueOf(amount));
        var actualBalanceFirstCard = dashboardPage.getCardBalance(firstCardInfo);
        var actualBalanceSecondCard = dashboardPage.getCardBalance(secondCardInfo);
        assertEquals(expectedBalanceFirstCard, actualBalanceFirstCard);
        assertEquals(expectedBalanceSecondCard, actualBalanceSecondCard);
    }
}
