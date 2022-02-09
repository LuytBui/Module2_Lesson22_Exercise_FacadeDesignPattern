public class SocialMediaFacade {
    private FacebookShare facebookShare;
    private TwitterShare twitterShare;
    private LinkedInShare linkedInShare;

    public SocialMediaFacade() {
        facebookShare = new FacebookShare();
        twitterShare = new TwitterShare();
        linkedInShare = new LinkedInShare();
    }

    public void share(String message){
        facebookShare.setMessage(message);
        twitterShare.setMessage(message);
        linkedInShare.setMessage(message);
        facebookShare.share();
        twitterShare.share();
        linkedInShare.share();
    }
}
