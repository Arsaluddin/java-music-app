import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
      private  String name;
      private  String artist;
      private ArrayList<Song> Songs;

      public Album(String name,String artist){
        this.name=name;
        this.artist=artist;
        Songs = new ArrayList<>();
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

      public boolean addToPlaylist(int trackNumber,LinkedList<Song> PlayList){
        int index = trackNumber-1;
        if(index>0 && index<=this.Songs.size()){
            PlayList.add(this.Songs.get(index));
            return true;
        }
        System.out.println("this album does not have song with tracknumber"+trackNumber);
        return false;
      }

      public boolean addToPlaylist(String title,LinkedList<Song> PlayList){
          for(Song checkedSong :this.Songs){
            if(checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
          }
          System.out.println("ther is no such songs in the album");
          return false;
      }
}
