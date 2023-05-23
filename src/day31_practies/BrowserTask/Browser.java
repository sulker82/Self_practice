package day31_practies.BrowserTask;

public class Browser {

    /*
    Create a class named Browser:

            Methods:
                openBrowser(): prints "opening chrome browser"
                closeBrowser():  prints "closing chrome browser"


                 Create the following sub classes of Browser and override the methods if needed:

            1. ChromeBrowser
                    methods:
                        openBrowser(): prints "opening chrome browser"
                        closeBrowser():  prints "closing chrome browser"

            2. FireFox extends Browser
                    methods:
                        openBrowser(): prints "opening firefox browser"
                        closeBrowser(): prints "closing fire fox browser"

            3. Opera extends Browser
                    methods:
                        openBrowser(): prints "opening opera browser"
                        closeBrowser(): prints "closing opera browser"

            4. Safari extends Browser
                    methods:
                        openBrowser(): prints "opening safari browser"
                        closeBrowser(): prints "closing safari browser"


     */
    public void openBrowser(){
        System.out.println("Opening chrome browser");
    }

    public void closeBrowser(){
        System.out.println("Closing chrome browser");
    }
}
