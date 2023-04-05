package org.example.DesignPatterns.StructuralDP;

/*
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 */
public class AdapterPattern {

    interface WebDriver {
        public void getElement();

        public void selectElement();
    }


    static class ChromeDriver implements WebDriver {

        @Override
        public void getElement() {
            System.out.println("Get element from ChromeDriver");
        }

        @Override
        public void selectElement() {
            System.out.println("Select element from ChromeDriver");

        }

    }

    static class IEDriver {

        public void findElement() {
            System.out.println("Find element from IEDriver");
        }

        public void clickElement() {
            System.out.println("Click element from IEDriver");
        }

    }

    static class WebDriverAdapter implements WebDriver {

        IEDriver ieDriver;

        public WebDriverAdapter(IEDriver ieDriver) {
            this.ieDriver = ieDriver;
        }

        @Override
        public void getElement() {
            ieDriver.findElement();

        }

        @Override
        public void selectElement() {
            ieDriver.clickElement();
        }

    }


    public static void main(String[] args) {
        ChromeDriver a = new ChromeDriver();
        a.getElement();
        a.selectElement();

        IEDriver e = new IEDriver();
        e.findElement();
        e.clickElement();

        WebDriver wID = new WebDriverAdapter(e);
        wID.getElement();
        wID.selectElement();
    }

}

