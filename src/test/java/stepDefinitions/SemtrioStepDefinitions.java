package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SemtrioPages;
import utilities.ConfigReader;
import utilities.Driver;

public class SemtrioStepDefinitions {



   SemtrioPages projePages = new SemtrioPages();



   @Given("Kullanıcı Proje anasayfasına gider")
   public void kullanıcı_proje_anasayfasına_gider() {

      Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));

   }
   @Given("Ana sayfanın açıldığı kontrol edilir.")
   public void ana_sayfanın_açıldığı_kontrol_edilir() {
      String sayfaUrl = Driver.getDriver().getCurrentUrl();
      Assert.assertTrue(sayfaUrl.equals(ConfigReader.getProperty("projeUrl")));



   }
   @Given("Bir Kullanıcı seçilir.")
   public void bir_kullanıcı_seçilir() {

      projePages.selectUser.click();
      projePages.user2.click();


   }
   @Given("Post seçilir.")
   public void post_seçilir() {

      projePages.post3.click();



   }
   @Given("Post seçildiğinde comments alanın  acıldıgı kontrol edilir.")
   public void post_seçildiğinde_comments_alanın_acıldıgı_kontrol_edilir() {
      Assert.assertTrue(projePages.CommentsTitle.isDisplayed());



   }
   @Given("Seçilen posttaki en son yoruma tıklanır.")
   public void seçilen_posttaki_en_son_yoruma_tıklanır() {
      projePages.LastComments.click();


   }
   @Given("Sayfa kapanır")
   public void Sayfa_kapanır() {

      Driver.CloseDriver();

   }


   @Given("Başka Bir Kullanıcı seçilir.")
   public void Başka_Bir_Kullanıcı_seçilir_() {

      projePages.selectUser.click();
      projePages.user3.click();


   }


   @Given("Album ikinci sayfadaki son albüm  seçilir.")
   public void album_ikinci_sayfadaki_son_albüm_seçilir() {
      projePages.LastAlbums.click();
      projePages.LastAlbumSentence.click();



   }
   @Given("Album seçildiğinde photo alanının açıldığı kontrol edilir.")
   public void Album_seçildiğinde_photo_alanının_açıldığı_kontrol_edilir_() {

      Assert.assertTrue(projePages.AlbumPhotoTitle.isDisplayed());


   }
   @Given("Seçilen albumdeki ilk resime tıklanır.")
   public void seçilen_albumdeki_ilk_resime_tıklanır() {

      projePages.firstPhoto.click();



   }





}
