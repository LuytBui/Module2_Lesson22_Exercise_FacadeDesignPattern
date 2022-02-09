public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade();
        socialMediaFacade.share(message);
    }
}
