package com.javatechie.solid.C.lsp;

public abstract class SocialMedia {
    // @supported by WhatsApp, Facebook, instagram
    public abstract void chatWithFriend();

    // @Supported By WhatsApp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    // @Supported by Facebook, instagram
    public abstract void publishPost(Object post);

    // @Supported by WhatsApp, Facebook
    public  abstract void groupVideosCall();
}
