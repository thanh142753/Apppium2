package widget.commonWidget;

public interface IHomePageWidget extends IBaseWidget{


    void closeTheWebAdvertisement();

    void addProductToCart(String productName) throws InterruptedException;

    void clickOnMyCart();

    void verifyProductInCart(String productName, String quantity);

    void clickOnModule(String moduleName);
}
