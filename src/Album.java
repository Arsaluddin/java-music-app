import java.util.ArrayList;

public class Album {
      private  String name;
      private  String artist;
      private ArrayList<Song> Songs;

      public Album(String name,String artist,ArrayList<Song> Songs){
        this.name=name;
        this.artist=artist;
        this.Songs=new ArrayList<Song>();
      }

      public Song FindSong(String title){
         for(Song Checked : Songs){
            if(Checked.getTitle().equals(title)){
                return Checked;
            }
         }
         return null;
      }

      public boolean addSong(String title,double duration){
         if(FindSong(title)==null){
            Songs.add( new Song(title,duration));
            System.out.println(title+"Song sucessfully added");
            return true;
         }
         System.out.println(title+"already in the list");
         return false;
      }
}
