package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SemtrioPages {

    public SemtrioPages(){
        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy(xpath = "//select[@class='search-user'][1]")
    public WebElement selectUser;


    @FindBy (xpath = "//option[@value='2']")
    public WebElement user2;

    @FindBy (xpath = "(//h4[@class='item-title'])[3]")
    public WebElement post3;

    @FindBy (xpath = "(//li[@class='page-item'])[10]")
    public WebElement LastComments;

    @FindBy (xpath = "(//h1[@class='section-title'])[3]")
    public WebElement CommentsTitle;

    @FindBy (xpath = "//option[@value='3']")
    public WebElement user3;

    @FindBy (xpath = "(//li[@class='page-item'])[8]")
    public WebElement LastAlbums;

    @FindBy (xpath = "(//h4[@class='item-title'])[4]")
    public WebElement LastAlbumSentence;

    @FindBy (xpath = "(//h1[@class='section-title'])[3]")
    public WebElement AlbumPhotoTitle;

    @FindBy (xpath = "(//div[@class='show-photo'])[1]")
    public WebElement firstPhoto;








}
