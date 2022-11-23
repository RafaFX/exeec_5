import java.util.List;

public class Fila {

    
    public int Fifo(List<Frame> fila){

        int index = 0;

        for(int i = 0; i < fila.size(); i++){
            if(fila.get(index).getTempoCarga() > fila.get(i).getTempoCarga()){

                index = i;
                System.out.println("deve ser susbtituido o frame de id:"+fila.get(index).getId() );
                
            }else{
                System.out.println("Teste");
            }
            
        }return fila.get(index).getId();

        // if(fila.get(0).getTempoCarga() < fila.get(1).getTempoCarga()){

        //    System.out.println("deve ser susbtituido o frame de id:"+fila.get(0).getTempoCarga() );

        // }

    }

}
