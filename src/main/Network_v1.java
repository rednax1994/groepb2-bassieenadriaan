/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Jeroen
 */
public class Network_v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewsFeed feed1 = new NewsFeed();
        MessagePost mp1 = new MessagePost("Schrijver 1","Blabla1");
        MessagePost mp2 = new MessagePost("Schrijver 2","Blabla2");
        MessagePost mp3 = new MessagePost("Schrijver 3","Blabla3");
        
        PhotoPost pp1 = new PhotoPost("Photo 1","1","Foto 1");
        PhotoPost pp2 = new PhotoPost("Photo 2","2","Foto 2");
        PhotoPost pp3 = new PhotoPost("Photo 3","3","Foto 3");
        
        feed1.addMessagePost(mp1);
        feed1.addMessagePost(mp2);
        feed1.addMessagePost(mp3);
        feed1.addPhotoPost(pp1);
        feed1.addPhotoPost(pp2);
        feed1.addPhotoPost(pp3);
        
        feed1.show();
    }
    
}
