

public class Song {
    String title;
    double duration;

    public Song(String title,double duration){
       this.title=title;
       this.duration=duration;
    }
//getters and setters
    public String getTitle(){
        return title;
    }
    public double getDuration(){
        return duration;
    }
    public void setTitle(String Title){
        this.title=Title;
    }
    public void setDuration(double Duration){
        this.duration=Duration;
    }

    @Override
    public String toString() {
        return "Song (title "+ title +"duration "+ duration+")";
    }
}
