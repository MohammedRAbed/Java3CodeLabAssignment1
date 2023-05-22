package com.example.a1project.View;

public class ViewManager {
    public static LoginPage loginPage;
    public static CurrencyChangeSystemPage currencyChangeSystemPage;
    public static AlertPage alertPage;

    public ViewManager() {}

    public static void openLoginPage() {
        if (loginPage==null)
            loginPage = new LoginPage();
        loginPage.show();
    }

    public static void closeLoginPage() {
        if (loginPage!=null)
            loginPage.close();
    }

    public static void openCCSPage() {
        if (currencyChangeSystemPage==null)
            currencyChangeSystemPage = new CurrencyChangeSystemPage();
        currencyChangeSystemPage.show();
    }

    public static void closeCCSPage() {
        if (currencyChangeSystemPage!=null)
            currencyChangeSystemPage.close();
    }

    public static void openAlertPage() {
        if (alertPage==null)
            alertPage = new AlertPage();
        alertPage.show();
    }

    public static void closeAlertPage() {
        if (alertPage!=null)
            alertPage.close();
    }
}
