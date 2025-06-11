interface Plugin{
    void execute();
}
class VisualizerPlugin implements Plugin{
    public void execute(){
        System.out.println("Executing VisualizerPlugin");
    }

}
class EqualizerPlugin implements Plugin{
     public void execute(){
        System.out.println("Executing EqualizerPlugin");
    }

}
class LyricsPlugin implements Plugin{
     public void execute(){
        System.out.println("Executing LyricsPlugin");
    }

}
class Demo5{
    public static void main(String[] args){
        VisualizerPlugin vp=new VisualizerPlugin();
        System.out.println("VisualizerPlugin Class:");
        vp.execute();
        EqualizerPlugin ep=new EqualizerPlugin();
        System.out.println("\nEqualizerPlugin Class:");
        ep.execute();
        LyricsPlugin lp=new LyricsPlugin();
        System.out.println("\nLyricsPlugin Class:");
        lp.execute();
    }
}