public class usuario {
    public static void main(String[] args) throws Exception {

        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual : " +smartTv.canal);

        smartTv.mudarCanal(13);

         System.out.println("Canal Atual : " +smartTv.canal);
       
       
        System.out.println("Volume Atual : " +smartTv.volume);

        System.out.println("Tv ligada ? :" + smartTv.ligada);
        System.out.println("Volume Atual ? :" +smartTv.volume);
        System.out.println("Canal atual ? :" +smartTv.canal);

        smartTv.ligar ();
        System.out.println("novo status -> Tv ligada ? " + smartTv.ligada);
      
        smartTv.desligar();
        System.out.println("novo status -> Tv ligada ? " + smartTv.ligada);

        


    }
}
